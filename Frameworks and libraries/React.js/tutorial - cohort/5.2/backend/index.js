const express = require('express');
const bodyParser = require('body-parser');
const { connectDB } = require('./db');
const Todo = require('./todo');
const { createToDo, updateToDo } = require('./types');

const app = express();
app.use(bodyParser.json());

// Connect to MongoDB
connectDB();

app.get('/todos', async (req, res) => {
  try {
    const todos = await Todo.find({});
    res.status(200).json(todos);
  } catch (err) {
    res.status(500).send('Error fetching todos');
  }
});

app.post('/todo', async function (req, res) {
  const createPayload = req.body;
  const parsedPayload = createToDo.safeParse(createPayload);

  if (!parsedPayload.success) {
    return res.status(400).json({ error: parsedPayload.error });
  }

  try {
    const todo = await Todo.create({
      title: parsedPayload.data.title,
      description: parsedPayload.data.description,
      completed: false
    });
    res.status(201).json(todo);
  } catch (err) {
    res.status(500).json({ error: 'Error creating todo' });
  }
});

app.put('/completed', async (req, res) => {
  const updatePayload = req.body;
  const parsedPayload = updateToDo.safeParse(updatePayload);

  if (!parsedPayload.success) {
    return res.status(400).send('Input data invalid');
  }

  try {
    const todo = await Todo.findByIdAndUpdate(
      updatePayload.id,
      { completed: true },
      { new: true }
    );
    if (!todo) {
      return res.status(404).send('Todo not found');
    }
    res.status(200).json(todo);
  } catch (err) {
    res.status(500).send('Error updating todo');
  }
});

app.delete('/todos/:id', async (req, res) => {
  try {
    const todo = await Todo.findByIdAndDelete(req.params.id);
    if (!todo) {
      return res.status(404).send('Todo not found');
    }
    res.status(200).send('Deleted successfully');
  } catch (err) {
    res.status(500).send('Error deleting todo');
  }
});

// Error handling middleware
app.use((err, req, res, next) => {
  console.error(err.stack);
  res.status(500).send('Something broke!');
});

// 404 middleware
app.use((req, res) => {
  res.status(404).send('Not Found');
});

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});

module.exports = app;
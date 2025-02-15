import { useState } from 'react';

const CreateTodo = () => {
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");

  return (
    <div className="create-todo">
      <input
        id="title"
        type="text"
        placeholder="title"
        onChange={(e) => setTitle(e.target.value)}
      />
      
      <input
        id="desc"
        type="text"
        placeholder="description"
        onChange={(e) => setDescription(e.target.value)}
      />
      
      <button 
        onClick={() => {
          fetch('http://localhost:3000/todo', {
            method: 'POST',
            body: JSON.stringify({ title, description }),
            headers: {
              'Content-Type': 'application/json'
            }
          })
            .then(async function(response){ 
              const data = await response.json();
              alert("Todo Created")
            })
        }}
      >
        Add Todo
      </button>
    </div>
  )
}

export default CreateTodo;
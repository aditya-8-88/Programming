const express = require('express');
const app = express();
const port = 3000;

app.get('/', (req, res) => {
  res.send('Hello World!');
});

app.post('/abc', (req, res) => {
    console.log(req.headers["auth"]);
    console.log(req.body);
    res.send('Hi There!');
});

app.listen(port);
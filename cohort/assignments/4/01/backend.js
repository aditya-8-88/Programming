const express = require('express');
const app = express();
const cors = require('cors');
const port = 3000;

app.use(cors());

app.get('/calculate', (req, res) => {
    const { principle, rate, time } = req.query;
    const simpleInterest = (principle * rate * time) / 100;
    return res.send({ simpleInterest });
});

app.listen(port);
const express  = require('express'); 
const app = express();
const port = 3000;

app.listen(port);

app.get('/', (req, res) => {
    let n = req.query.n;
    res.send('Hello World! Sum is ' + sum(n));
});

function sum(n) {
    let sum = 0;
    for (let i = 0; i <= n; i++) {
        sum += i;
    }
    return sum;
}
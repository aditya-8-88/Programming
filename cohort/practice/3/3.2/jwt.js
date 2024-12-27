const express = require('express');
const jwt = require('jsonwebtoken');
const port = 3000;
const jwtPassword = "123456";

const app = express();
app.use(express.json());

const users = [
    {
        username: "admin1",
        password: "admin1",
        firstname: "Admin1",
    },
    {
        username: "admin2",
        password: "admin2",
        firstname: "Admin2",
    },
    {
        username: "admin3",
        password: "admin3",
        firstname: "Admin3",
    },
]

function userExists(username, password) {
    for(let i=0;i<users.length;i++) {
        if(users[i].username === username && users[i].password === password) {
            return true;
        }
    }
    return false;
}

app.post('/signin', (req, res) => {
    const username = req.body.username;
    const password = req.body.password;

    if(userExists(username, password)) {
        const token = jwt.sign({ username: username }, jwtPassword);
        res.json({
            token
        });
    }
    else {
        res.status(403).json({
            msg : "Invalid username or password",
        });
    }
});

app.get('/profile', (req, res) => {
    try{
        const token = req.headers.authorization;
        const decoded = jwt.verify(token, jwtPassword);
        const username = decoded.username;
        res.json({
            users : users.filter((value) => {
                if(value.username == username){
                    return false;
                }
                else {
                    return true;
                }}),
        });
    }
    catch(err) {
        res.status(403).json({
            msg : "Invalid token",
        });
    }
});

app.listen(port);
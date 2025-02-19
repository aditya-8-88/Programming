const express = require("express");
const jwt = require("jsonwebtoken");
const mongoose = require("mongoose");
const jwtPassword = "123456";
const app = express();
app.use(express.json());

// below connection string was just for demo purpose, auth is removed from it
// you should use your own connection string
// you can get it from mongodb atlas
// https://docs.mongodb.com/manual/reference/connection-string/
mongoose.connect(
  "mongodb+srv://adityapratapsingh12b05:ex8HwIcbdgSeTiS6@cluster0.oees5.mongodb.net/userappnew",
);

const User = mongoose.model("User", {
  name: String,
  username: String,
  password: String,
});

// const user = new User({
//     name: "Aditya",
//     username: "aditya",
//     password: "aditya",
// });

// user.save();

function userExists(username, password) {
  // should check in the database
}

app.post("/signin", async function (req, res) {
  const username = req.body.username;
  const password = req.body.password;

  if (!userExists(username, password)) {
    return res.status(403).json({
      msg: "User doesnt exist in our in memory db",
    });
  }

  var token = jwt.sign({ username: username }, "shhhhh");
  return res.json({
    token,
  });
});

app.get("/users", function (req, res) {
  const token = req.headers.authorization;
  try {
    const decoded = jwt.verify(token, jwtPassword);
    const username = decoded.username;
    // return a list of users other than this username from the database
  } catch (err) {
    return res.status(403).json({
      msg: "Invalid token",
    });
  }
});

app.listen(3000);
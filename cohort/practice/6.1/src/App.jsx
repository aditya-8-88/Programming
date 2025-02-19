import { useState } from "react";
import "./App.css";

function App() {
  return (
    <div>
      <Header />
      <h1>Heading1</h1>
    </div>
  );
}

// Header Component
function Header() {
  const [title, setTitle] = useState("Random Heading");

  // update function
  function update() {
    let a = Math.random();
    setTitle(a);
  }

  return (
    <div>
      <button onClick={update}>Update</button>
      <h1>{title}</h1>
    </div>
  );
}

export default App;

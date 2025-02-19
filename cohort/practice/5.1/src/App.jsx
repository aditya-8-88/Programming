import { useState } from "react";
import "./App.css";

function App() {
  const [count, setCount] = useState(0);

  return (
    <div>
      <CounterComponent count={count} setCount={setCount}></CounterComponent>
    </div>
  );
}

// Counter component
function CounterComponent(props) {
  function onClickHandler() {
    props.setCount(props.count + 1);
  }

  return (
    <div className="card">
      <button onClick={onClickHandler}>count is {props.count}</button>
    </div>
  );
}

export default App;
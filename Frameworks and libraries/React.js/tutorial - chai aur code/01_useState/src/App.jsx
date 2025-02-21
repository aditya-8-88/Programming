import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  let [count, setCount] = useState(15)

  const removeValue = () => {
    if(count > 0)
    setCount(count - 1)
    else
    alert("Value can't be less than 0")
  }

  return (
    <>
      <h2>button clicked {count} times</h2>
      <button onClick={() => setCount(count + 1)}>click me</button>
      <button onClick={removeValue}>remove</button>
    </>
  )
}

export default App

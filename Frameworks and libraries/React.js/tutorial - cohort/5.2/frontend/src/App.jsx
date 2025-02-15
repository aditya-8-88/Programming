import './App.css'
import CreateTodo from './component/CreateToDo.jsx'
import Todos from './component/ToDos'

function App() {

  // const [todos, setTodos] = useState([]);

  // fetch('http://localhost:3000/todos')
  // .then(async function(response){
  //   const data = await response.json();
  //   setTodos(data.todos);
  // })


  return (
    <>
      < CreateTodo />
      < Todos />
    </>
  )
}

export default App
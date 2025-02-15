const Todos = ({todos}) => {
    return (
      <div>
        {todos && todos.map(function(todo){
          return (
            <div key={todo._id} className="todo-item">
              <h2>{todo.title}</h2>
              <p>{todo.description}</p>
              <button>{todo.completed ? "Completed" : "Mark as Complete"}</button>
            </div>
          )
        })}
      </div>
    )
}

export default Todos;
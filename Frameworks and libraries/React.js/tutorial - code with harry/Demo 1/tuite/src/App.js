// import logo from './logo.svg';
import './App.css';
import NavBar from './Components/NavBar';
import TextForm from './Components/TextForm';

function App() {
  return (
    <div>
      <NavBar title="React App" aboutSection="About Us" searchButton="Search" />
      <div className="container my-3">
        <TextForm heading="Enter Some Text"/>
      </div>
    </div>
  );
}

export default App;

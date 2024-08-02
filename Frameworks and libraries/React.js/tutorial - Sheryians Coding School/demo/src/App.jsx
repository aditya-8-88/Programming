import React from 'react';
import Navbar from './Components/Navbar';
import LandingPage from './Components/LandingPage';

function App() {
  return (
      <div className='w-full h-screen bg-zinc-900 text-white'>
        <Navbar/>
        <LandingPage/>
      </div>
  );
}

export default App;

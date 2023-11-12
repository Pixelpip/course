import React, { useState, useEffect } from 'react';
import './App.css';


const App=()=> {
  const [counter, setcounter] = useState(0);
  useEffect(()=>{
    setcounter(100);
  },[]);
  return (
    <div className="App">
      <button onClick={()=> setcounter((prevCount=> prevCount-1))}>-</button>
     <h3>{counter}</h3>
     <button onClick={()=> setcounter((prevCount=> prevCount+1))}>+</button>
    </div>
  );
}

export default App;

import React, { useState } from 'react';
import './App.css';

const P1 = (props) => {
  
  return(
  < >
  <h1>Hello {props.name}</h1>
  <h2>age:{props.age}</h2>
  
  </>
)};


const App=()=> {
  const [counter, setcounter] = useState(0);
  return (
    <div className="App">
      <button onClick={()=> setcounter((prevCount=> prevCount-1))}>-</button>
     <h3>{counter}</h3>
     <button onClick={()=> setcounter((prevCount=> prevCount+1))}>+</button>
    </div>
  );
}

export default App;

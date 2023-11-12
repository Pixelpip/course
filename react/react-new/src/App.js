
import './App.css';

const P1 = (props) => {
  
  return(
  < >
  <h1>Hello {props.name}</h1>
  <h2>age:{props.age}</h2>
  </>
)};


const App=()=> {
 
  return (
    <div className="App">
      <P1 name={'jade'} age={40}/>
     
    </div>
  );
}

export default App;

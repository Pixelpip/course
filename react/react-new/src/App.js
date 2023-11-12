import {React,useEffect} from 'react';
//omdb api key: 1cab1ad1
const API_URL='http://www.omdbapi.com?apikey=1cab1ad1';
const App=()=>{
    
    useEffect(()=>{
        const searchMovies=async(title)=>{
            const response=await fetch(`${API_URL}&s=${title}`);
            const data=await response.json();
            console.log(data);
        }
    })
    return(
      
        <h1>Default</h1>
       
    );
}

export default App
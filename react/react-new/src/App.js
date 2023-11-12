import {useState,React,useEffect} from 'react';
import './App.css';
import SearchIcon from './search.svg';
import MovieCard from './MovieCard';
//omdb api key: 1cab1ad1
const API_URL='http://www.omdbapi.com?apikey=1cab1ad1';
const movie1={
    
        "Title": "Spiderman in Cannes",
        "Year": "2016",
        "imdbID": "tt5978586",
        "Type": "movie",
        "Poster": "https://m.media-amazon.com/images/M/MV5BZDlmMGQwYmItNTNmOS00OTNkLTkxNTYtNDM3ZWVlMWUyZDIzXkEyXkFqcGdeQXVyMTA5Mzk5Mw@@._V1_SX300.jpg"
      
}


const App=()=>{
    const [movies, setMovies] = useState([]);
    const searchMovies=async(title)=>{
        const response=await fetch(`${API_URL}&s=${title}`);
        const data=await response.json();
        console.log(data.Search);
    }
    useEffect(()=>{
       searchMovies('Spiderman');
    },[]);
    return(
      
        <div className='app'>
           <h1>MovieLand</h1>
           <div className='search'><input placeholder='Search movies' value="Superman" onChange={
            ()=>{}
           }/>
           <img src={SearchIcon}
           alt="search"
           onClick={()=>{}}/></div> 
           {
            movies?.length>0
            ? (
                <div className='container'>
                {movies.map((movie)=>()}/>
               </div> 
            ): (
                <div className='empty'>
                    <h2>Not found</h2>
            )
           }
           <div className='container'>
            <MovieCard movie1={movies[0]}/>
           </div>
        </div>
       
    );
}

export default App
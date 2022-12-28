import logo from './logo.svg';
import './App.css';
import {Results}  from './Results.js';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
        <Results />
    </div>
  );
}

//component => put in searchTerm => do get request to it and pump that searchTerm into the backend where it'll fetch and return the JSON data

export default App;

import logo from './logo.svg';
import './App.css';
import Results  from './Results';
import React from 'react';

type myState = {
  helloData: string;
}

class App extends React.Component<{}, myState> {

  state: myState = {
    helloData: "",
  };

  async componentDidMount() {
    const response = await fetch('/test');
    const body = await response.json();
    this.setState({helloData: body});
  }

  render() {
    const {helloData} = this.state;
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
        <Results hello={helloData} />
    </div>
  );
  }
}

//component => put in searchTerm => do get request to it and pump that searchTerm into the backend where it'll fetch and return the JSON data
//search bar component grabs searchTerm
//throws this searchTerm out to the API to get data and returns it as state

export default App;

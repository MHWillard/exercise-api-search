import logo from './logo.svg';
import './App.css';
import Results  from './Results';
import React from 'react';

type myState = {
  key: string;
  title: string;
  first_publish_year: number;
  number_of_pages_median: number;
  author_name: string[];
  subject: string[]
}

class App extends React.Component<{}, myState> {

  state: myState = {
    name: "",
  };

  async componentDidMount() {
    const response = await fetch('/react');
    const body = await response.json();
    console.log(JSON.stringify(body));
    let setName: string = body.name;
    //get json, break it apart, or assign specific value of key to the state => look up Javascript docs for this
    this.setState({name: setName});
  }

  render() {
    const {name} = this.state;
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
        <Results hello={name} />
    </div>
  );
  }
}

//component => put in searchTerm => do get request to it and pump that searchTerm into the backend where it'll fetch and return the JSON data
//search bar component grabs searchTerm
//throws this searchTerm out to the API to get data and returns it as state

export default App;

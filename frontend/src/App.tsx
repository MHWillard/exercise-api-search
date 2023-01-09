import './App.css';
import Results  from './Results';
import React from 'react';

type Book = {
  book_key: string;
  title: string;
  first_publish_year: number;
  number_of_pages_median: number;
  author_name: string[];
  subject: string[]
}

type myState = {
  numFound: number;
  docs : Book[]
}

/*
JSON returned is a group of objects
-so we probably need to define a type for Docs
-then the state can be an array of Docs
-then: for each Doc, we iterate and dump it into their own Entry
*/

class App extends React.Component<{}, myState> {

  state: myState = {
    numFound: 0,
    docs: []
  };

  async componentDidMount() {
    const response = await fetch('/react2');
    const body = await response.json();
    console.log(JSON.stringify(body));
    let setNum: number = body["numFound"];
    let setDocs: Book[] = body["docs"];
    //body["docs"]
    //get json, break it apart, or assign specific value of key to the state => look up Javascript docs for this
    this.setState({numFound: setNum, docs: setDocs});
  }

  render() {
    const {numFound} = this.state;
  return (
    <div className="App">
      
      <header>
        {/*
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
        </a> */}
      </header>
        <Results numFound={numFound} />
    </div>
  );
  }
}

//component => put in searchTerm => do get request to it and pump that searchTerm into the backend where it'll fetch and return the JSON data
//search bar component grabs searchTerm
//throws this searchTerm out to the API to get data and returns it as state

export default App;

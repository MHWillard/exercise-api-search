import React from 'react'

type helloProps = {hello?: string}

class Results extends React.Component<helloProps> {
    render() {

    return(
        <div>
            <p>Hello World!</p>
            <p>Hello, {this.props.hello}!</p>
        </div>
    );
    }
}

export default Results;
import React from 'react'

type keyProps = {book_key?: string}

class Results extends React.Component<keyProps> {
    render() {

    return(
        <div>
            <p>Hello World!</p>
            <p>Key: {this.props.book_key}!</p>
        </div>
    );
    }
}

export default Results;
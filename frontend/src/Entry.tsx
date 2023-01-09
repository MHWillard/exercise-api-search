import React from 'react'

type keyProps = {numFound?: number}

class Entry extends React.Component<keyProps> {
    render() {

    return(
        <div>
            <p>Hello World!</p>
            <p>Key: {this.props.numFound}!</p>
        </div>
    );
    }
}

export default Entry;
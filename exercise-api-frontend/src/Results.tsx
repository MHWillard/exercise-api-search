import React from 'react'

type helloProps = {hello?: string}

class Results extends React.Component<helloProps> {
    render() {

    return(
        <div>
            <p>Hello World</p>
            {this.props.hello}
        </div>
    );
    }
}

export default Results;
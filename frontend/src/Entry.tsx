import React from 'react'

/* <Results numFound={numFound} />   book_key: string;
  title: string;
  first_publish_year: number;
  number_of_pages_median: number;
  author_name: string[];
  subject: string[] */

type bookProps = {book_key: string;
    title: string;
    first_publish_year: number;
    number_of_pages_median: number;
    author_name: string[];
    subject: string[]}

    //need to see how the actual author and subject arrays work out and their type so we're not returning null
function Entry(props: bookProps) {
    let subjects: string[] = props.subject;
    let subjectItems = subjects.map((subject: string, index:number) => <span key={index}>{subject}</span>);

    return(
        <div>
            <p><b>{props.title}</b></p>
            <p><b>Author(s): </b> {props.author_name}</p>
            <p>Year: {props.first_publish_year} Pages: {props.number_of_pages_median}</p>
            <p><b>Subjects: </b> {subjectItems}</p>
        </div>
    );
}

export default Entry;
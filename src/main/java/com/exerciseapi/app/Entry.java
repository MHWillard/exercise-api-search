package com.exerciseapi.app;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entry {
    @JsonProperty("numFound")
    private Integer numFound;
    //@JsonProperty("title")
    //private String title;

    @JsonProperty("docs")
    private Docs docs;

    public Integer getNumFound() { return numFound;}

    public void setNumFound(Integer numFound) {
        this.numFound = numFound;
    }

    public Docs getDocs() {
        return docs;
    }

    public void setDocs(Docs docs) {
        this.docs = docs;
    }

    public Entry() {}

    public String toString() {
        //String publishers = "";
        //publisher.forEach((house) -> publishers.concat(house));
        //return "Title: " + title + "Date: " + publish_date + "Author: " + author_name + "Contributor: " + contributor + "Publishers: " + publishers;
        return "Number found: " + numFound; //+ ", Docs: " + docs;
        //return "title: " + title;
        //return numFound.toString();
    }
}

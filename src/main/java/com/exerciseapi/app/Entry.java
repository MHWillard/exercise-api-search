package com.exerciseapi.app;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entry {
    @JsonProperty("numFound")
    private Integer numFound;

    private Docs docs;

    public Entry() {}

    public String toString() {
        //String publishers = "";
        //publisher.forEach((house) -> publishers.concat(house));
        //return "Title: " + title + "Date: " + publish_date + "Author: " + author_name + "Contributor: " + contributor + "Publishers: " + publishers;
        return "Number found: " + numFound + ", Docs: " + docs;
        //return numFound.toString();
    }
}

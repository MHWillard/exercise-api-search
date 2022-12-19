package com.exerciseapi.app;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Docs {
    @JsonProperty("title")
    private String title;

    @JsonProperty("publish_date")
    private List<String> publish_date;

    @JsonProperty("author_name")
    private List<String> author_name;
    @JsonProperty("contributor")
    private List<String> contributor;
    @JsonProperty("publisher")
    private List<String> publisher;

    @JsonProperty("number_of_pages_median")
    private Integer number_of_pages_median;

    @JsonProperty("isbn")
    private List<String> isbn;

    @JsonProperty("subject_facet")
    private List<String> subject_fact;

    public Docs() {}

    //add getter and setter for title

    public String getTitle() {return title; }

    public void setTitle(String title) {this.title = title;}

    @Override
    public String toString() {
        return "Title: " + title + "Date: " + publish_date + "Author: " + author_name + "Contributor: " + contributor + "Publishers: " + publisher;
    }
}

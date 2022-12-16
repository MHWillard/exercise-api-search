package com.exerciseapi.app;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Docs {
    @JsonProperty("title")
    private String title;
    @JsonProperty("publish_date")
    private String publish_date;
    @JsonProperty("author_name")
    private String author_name;
    @JsonProperty("contributor")
    private String contributor;
    @JsonProperty("publisher")
    private ArrayList<String> publisher;

    public Docs() {}

    @Override
    public String toString() {
        //String publishers = "";
        //publisher.forEach((house) -> publishers.concat(house));
        //return "Title: " + title + "Date: " + publish_date + "Author: " + author_name + "Contributor: " + contributor + "Publishers: " + publishers;
        return "Title: " + title + "Date: " + publish_date + "Author: " + author_name + "Contributor: " + contributor + "Publishers: ";
    }
}

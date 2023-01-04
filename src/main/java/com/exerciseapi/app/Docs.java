package com.exerciseapi.app;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Docs {
    @JsonProperty("title")
    private String title;

    @JsonProperty("number_of_pages_median")
    private Integer number_of_pages_median;

    @JsonProperty("first_publish_year")
    private Integer first_publish_year;

    public Docs() {}

    //add getter and setter for title

    public String getTitle() {return title; }

    public void setTitle(String title) {this.title = title;}

    @Override
    public String toString() {
        return "Title: " + title + "Date: " + first_publish_year + "Pages: " + number_of_pages_median;
    }
}

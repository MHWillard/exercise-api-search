package com.exerciseapi.app;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Title {
    @JsonProperty("title")
    private String title;

    public Title() {}

    //add getter and setter
    public String getTitle() {return title; }

    public void setTitle(String title) {this.title = title;}

    public String toString() {
        //String publishers = "";
        //publisher.forEach((house) -> publishers.concat(house));
        //return "Title: " + title + "Date: " + publish_date + "Author: " + author_name + "Contributor: " + contributor + "Publishers: " + publishers;
        return "title: " + title;
        //return numFound.toString();
    }
}

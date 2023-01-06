package com.exerciseapi.app;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {
    private Work work;

    @JsonProperty("key")
    private String key;

    @JsonProperty("title")
    private String title;

    @JsonProperty("first_publish_year")
    private Integer first_publish_year;

    @JsonProperty("number_of_pages_median")
    private Integer number_of_pages_median;

    @JsonProperty("author_name")
    private ArrayList<String> author_name;

    @JsonProperty("subject")
    private ArrayList<String> subject;

    public Book(String key, String title, Integer first_publish_year, Integer number_of_pages_median, ArrayList<String> author_name, ArrayList<String> subject) {}

    public Book() {}

    public void addWork(Work work) {
        this.work = work;
    }

    public String getKey() {
        return this.key;
    }

    @Override
    public String toString() {
        return "Key: " + key + " Title: " + title + " Author: " + author_name + " Subject: " + subject + " Publish Year: " + first_publish_year + " Pages: " + number_of_pages_median;
    }

}

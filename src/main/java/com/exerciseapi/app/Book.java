package com.exerciseapi.app;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {
    private Work work;
    private String key;
    private String title;
    private Integer first_publish_year;
    private Integer number_of_pages_median;
    private ArrayList<String> author_name;
    private ArrayList<String> subject;

    public Book(String key, String title, Integer first_publish_year, Integer number_of_pages_median) {}

    public Book() {}

    public void addWork(Work work) {
        this.work = work;
    }

    public String getKey() {
        return this.key;
    }

    @Override
    public String toString() {
        return "Key: " + key + "Title: " + title + "Author" + author_name + "Publish Year: " + first_publish_year + "Pages: " + number_of_pages_median;
    }

}

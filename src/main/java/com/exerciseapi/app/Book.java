package com.exerciseapi.app;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {
    private String title;
    private String publish_date;
    private String author_name;
    private String contributor;
    private ArrayList<String> publisher;

    public Book(String title, String publish_date, String author_name, String contributor, ArrayList<String> publisher) {}

    public Book() {}

    @Override
    public String toString() {
        //String publishers = "";
        //publisher.forEach((house) -> publishers.concat(house));
        //return "Title: " + title + "Date: " + publish_date + "Author: " + author_name + "Contributor: " + contributor + "Publishers: " + publishers;
        return "Title: " + title + "Date: " + publish_date + "Author: " + author_name + "Contributor: " + contributor + "Publishers: ";
    }

}

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

    public Book() {}

}

package com.exerciseapi.app;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Work {
    @JsonProperty("description")
    private String description;

    public Work(String description) {}

    @Override
    public String toString() {
        return "Description: " + description;
    }
}

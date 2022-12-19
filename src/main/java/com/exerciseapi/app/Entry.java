package com.exerciseapi.app;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entry {
    @JsonProperty("numFound")
    private Integer numFound;
    //@JsonProperty("title")
    //private String title;

    @JsonProperty("docs")
    private List<Docs> docs;

    public Integer getNumFound() { return numFound;}

    public void setNumFound(Integer numFound) {
        this.numFound = numFound;
    }

    //internal json arrays must be parsed accordingly so I needed to turn it into a list here for RestTemplate
    public List<Docs> getDocs() {
        return docs;
    }

    public void setDocs(List<Docs> docs) {
        this.docs = docs;
    }

    public Entry() {}

    public String toString() {
        return "Number found: " + numFound + ", Docs: " + docs;
    }
}

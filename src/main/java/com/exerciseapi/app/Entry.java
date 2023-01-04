package com.exerciseapi.app;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

//@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Entry {
    //private @Id @GeneratedValue Long id;

    @JsonProperty("numFound")
    private Integer numFound;

    @JsonProperty("docs")
    private List<Book> docs;

    public Integer getNumFound() { return numFound;}

    public void setNumFound(Integer numFound) {
        this.numFound = numFound;
    }

    //internal json arrays must be parsed accordingly so I needed to turn it into a list here for RestTemplate
    public List<Book> getDocs() {
        return docs;
    }

    public void setDocs(List<Book> docs) {
        this.docs = docs;
    }

    public Entry() {}

    public String toString() {
        return "Number found: " + numFound + ", Docs: " + docs;
    }
}

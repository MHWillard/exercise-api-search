package com.exerciseapi.app;

import net.minidev.json.JSONObject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
//@RequestMapping("/test")
public class HomeController {

    @GetMapping("/test")
    public Entry index() {
        //String helloData = "test";
        //return helloData; //probably need to return an actual string as a response

        RestTemplate restTemplate = new RestTemplate();
        //String helloData = "test";
        //return helloData; //probably need to return an actual string as a response
        Entry entry = restTemplate.getForObject("https://openlibrary.org/search.json?q=redwall", Entry.class);
        //log.info(entry.toString());
        //return String.format(entry.toString());
        return entry;
    }

    @GetMapping("/react")
    public Entry indexR() {

        RestTemplate restTemplate = new RestTemplate();
        //String helloData = "test";
        //return helloData; //probably need to return an actual string as a response
        Entry entry = restTemplate.getForObject("https://openlibrary.org/search.json?q=vote+for+duck+click+clack+moo", Entry.class);
        //log.info(entry.toString());
        return entry;
    }

    @GetMapping("/react2")
    public Entry indexR2() {

        RestTemplate restTemplate = new RestTemplate();
        //String helloData = "test";
        //return helloData; //probably need to return an actual string as a response
        Entry entry = restTemplate.getForObject("https://openlibrary.org/search.json?q=redwall", Entry.class);
        //log.info(entry.toString());
        return entry;
    }


    @RequestMapping("/test")
    public String indexRX() {

        RestTemplate restTemplate = new RestTemplate();
        //String helloData = "test";
        //return helloData; //probably need to return an actual string as a response
        Entry entry = restTemplate.getForObject("https://openlibrary.org/search.json?q=vote+for+duck+click+clack+moo", Entry.class);
        //log.info(entry.toString());
        return String.format(entry.toString());
    }
}

/* TODO: get book description using doc.key and then put into json object */

/*
* 	@GetMapping("/test")
	public String test(@RequestParam() String id) {
		return "ID: " + id;
		//also generate test list item here to return probably
	}
* */

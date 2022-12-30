package com.exerciseapi.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
//@RequestMapping("/test")
public class HomeController {

    @GetMapping("/test")
    public String index() {
        String helloData = "test";
        return helloData; //probably need to return an actual string as a response
    }

    @RequestMapping("/test")
    public String indexR() {
        String helloData = "test";
        return helloData; //probably need to return an actual string as a response
    }
}

/*
* 	@GetMapping("/test")
	public String test(@RequestParam() String id) {
		return "ID: " + id;
		//also generate test list item here to return probably
	}
* */

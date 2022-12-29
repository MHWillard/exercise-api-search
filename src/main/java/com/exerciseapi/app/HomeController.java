package com.exerciseapi.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping(value = "/test")
    public String index() {
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

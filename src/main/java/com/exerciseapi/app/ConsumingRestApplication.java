package com.exerciseapi.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ConsumingRestApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			//Quote quote = restTemplate.getForObject("https://gistcdn.githack.com/ayan-b/ff0441b5a8d6c489b58659ffb849aff4/raw/e1c5ca10f7bea57edd793c4189ea8339de534b45/response.json", Quote.class);
			//log.info(quote.toString());
			// https://openlibrary.org/developers/api
			// https://openlibrary.org/search.json?title=vote+for+duck+click+clack+moo

			Entry entry = restTemplate.getForObject("https://openlibrary.org/search.json?q=vote+for+duck+click+clack+moo", Entry.class);
			log.info(entry.toString());
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/json")
	public String json(@RequestParam(value = "searchTerm", defaultValue = "lord+of+the+rings") String searchTerm) {
		//return String.format("Hello %s!", name);
		//get name value
		//push it to data class that pulls from API and arranges into data format
		//returns it here on route access
		//return args -> {
			//Quote quote = restTemplate.getForObject("https://gistcdn.githack.com/ayan-b/ff0441b5a8d6c489b58659ffb849aff4/raw/e1c5ca10f7bea57edd793c4189ea8339de534b45/response.json", Quote.class);
			//log.info(quote.toString());
			// https://openlibrary.org/developers/api
			// https://openlibrary.org/search.json?title=vote+for+duck+click+clack+moo

			RestTemplate restTemplate = new RestTemplate();
			String fullSearchURL = String.format("https://openlibrary.org/search.json?q=%s", searchTerm);

			Entry entry = restTemplate.getForObject(fullSearchURL, Entry.class);
			log.info(entry.toString());
			return String.format(entry.toString());
		//};
	}
}

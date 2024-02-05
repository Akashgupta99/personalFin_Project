package dev.finservapp.personalfin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@SpringBootApplication
@RestController
public class PersonalfinApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalfinApplication.class, args);
	}

	@GetMapping("/help")
	public String getHelp(){
		return ("Hello, World!");
	}

	@PostMapping(value = "/TryPost", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String tryToPost(@RequestBody Map<String, Object> payload){
		System.out.println(payload.get("id"));
		return "post";
	}

}

package com.example.SpringBootApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

@RestController
class MyRestController {
	//	The following is an example of "Injecting". This takes assigned values from the "application.properties" file
	//	In the "resources" directory and brings them to that file, over to here. The file currently holds the following values
	//		"coach.name = "Giga Chad"
	//		"team.name = "The Chads"
	@Value("${coach.name}")
	public String coachName; // This assigns the value in the "application.properties" file to the String variable "coachName"

	// Same for the next value.
	@Value("${team.name}")
	public String teamName;
}

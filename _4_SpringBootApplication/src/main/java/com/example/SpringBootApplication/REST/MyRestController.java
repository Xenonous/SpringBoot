package com.example.SpringBootApplication.REST;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // Homepage
    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Welcome to the Web Application!";
    }

    // Team Information Endpoint
    @GetMapping("/teaminfo")
    public String showTeamInfo() {
        return "Our team name is " + teamName + "\n and our coach is " + coachName;
    }

}

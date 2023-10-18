package com.example.SpringBootApplication.REST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!!!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "100 Pushups, 100 Situps, Run a 5k, HYDRATE!";
    }

    @GetMapping("/secret")
    public String getSecretMessage() {
        return "Congrats, you found the secret endpoint!!";
    }
}
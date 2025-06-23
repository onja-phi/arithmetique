package com.example.demo.endpoint.rest.controller.health;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "world";
    }
}

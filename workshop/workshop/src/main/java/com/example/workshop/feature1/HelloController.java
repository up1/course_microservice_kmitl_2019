package com.example.workshop.feature1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public HelloResponse sayHello( @PathVariable String name) {
        return new HelloResponse("Hello " + name);
    }
}

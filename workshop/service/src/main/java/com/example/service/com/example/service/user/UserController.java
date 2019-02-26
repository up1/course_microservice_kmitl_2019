package com.example.service.com.example.service.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<UserResponse> listUser() {
        return Arrays.asList(
                new UserResponse(),
                new UserResponse(),
                new UserResponse()
        );
    }

    @GetMapping("/users/{id}")
    public UserResponse getUser(@PathVariable long id) {
        return new UserResponse();
    }

}

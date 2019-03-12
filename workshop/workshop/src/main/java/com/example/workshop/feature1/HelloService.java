package com.example.workshop.feature1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HelloService {

//    @Autowired Field/Property/Setter Injection
    private UserRepository userRepository;

    @Autowired // Constructor Injection
    public HelloService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String formatData(String name) {
        Optional<User> someUser = userRepository.findByFirstname(name);
        return "Hello " + someUser.get().getFirstname();
    }
}

package com.example.workshop.feature1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HelloServiceTest {

    @Mock
    UserRepository userRepository;

    @Test
    public void formatData() {
        // Stub
        User stubUser = new User("name", "last");
        when(userRepository.findByFirstname("name"))
                .thenReturn(Optional.of(stubUser));

        HelloService service = new HelloService(userRepository);
        assertEquals("Hello name", service.formatData("name"));
    }
}
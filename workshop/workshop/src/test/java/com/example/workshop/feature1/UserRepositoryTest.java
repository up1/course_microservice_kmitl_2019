package com.example.workshop.feature1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void success_find_by_firstname_with_somkiat() {
        // Initial data in database
        User somkiat = new User("somkiat", "pui");
        userRepository.save(somkiat);

        // Find by firstname
        Optional<User> someUser = userRepository
                                     .findByFirstname("somkiat");

        // Assert
        assertEquals("somkiat", someUser.get().getFirstname());
        assertEquals("pui", someUser.get().getLastname());
    }

}
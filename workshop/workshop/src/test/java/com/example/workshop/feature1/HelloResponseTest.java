package com.example.workshop.feature1;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloResponseTest {

    @Test
    public void xxx() {
        assertEquals(new HelloResponse("a"),
                new HelloResponse("a"));
    }

}
package net.ayoentem.phonebook.main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    public static final String STD_NAME = "Item";
    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack(5);

        //Pushen
        stack.push("Ahmet");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void push() {
        //Testen
        assertEquals("Ahmet", stack.peek());
    }

    @Test
    void pop() {

    }
}
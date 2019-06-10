package com.mouse.fuzzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void name() {
        assertEquals("1", new FizzBuzz().replace(1));
        assertEquals("2", new FizzBuzz().replace(2));
        assertEquals("Fizz", new FizzBuzz().replace(3));
        assertEquals("Buzz", new FizzBuzz().replace(5));
        assertEquals("FizzBuzz", new FizzBuzz().replace(15));
        assertEquals("Fizz", new FizzBuzz().replace(13));
        assertEquals("Buzz", new FizzBuzz().replace(52));
        assertEquals("FizzBuzz", new FizzBuzz().replace(53));
    }
}

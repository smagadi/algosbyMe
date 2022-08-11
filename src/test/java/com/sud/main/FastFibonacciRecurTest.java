package com.sud.main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FastFibonacciRecurTest {
    @Test
    void checkOne1()
    {
        int expected = 5;
        Assertions.assertEquals(expected,FastFibRecur.getNthFib(6));



    }
}

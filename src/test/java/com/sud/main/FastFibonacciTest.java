package com.sud.main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FastFibonacciTest {
    @Test
    void checkOne()
    {
        int expected = 5;
        Assertions.assertEquals(expected,FastFib.getNthFib(6));



    }
}

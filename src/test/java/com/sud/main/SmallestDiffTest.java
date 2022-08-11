package com.sud.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.sud.main.FindSmallestDifference;

import java.util.Arrays;

public class SmallestDiffTest {

@Test
void checkOne()
{
    int[] expected = {28, 26};
    Assertions.assertArrayEquals(expected,FindSmallestDifference.smallestDifference(
            new int[] {-1, 5, 10, 20, 28, 3}, new int[] {26, 134, 135, 15, 17}));


}
}

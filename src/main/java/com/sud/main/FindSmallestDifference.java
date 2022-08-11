package com.sud.main;

import java.util.Arrays;

public class FindSmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int[] results = new int[]{arrayOne[0],arrayTwo[0]};

        int ptr1 =0;
        int ptr2 =0;

        int difference = Integer.MAX_VALUE;

        while(ptr1 < arrayOne.length &&  ptr2<arrayTwo.length)
        {
            int val1 = arrayOne[ptr1];
            int val2 =arrayTwo[ptr2];

            int diff = Math.abs(val1-val2);
            if(diff < difference)
            {
                results= new int[]{val1,val2};

            }
            if (val1 < val2)
            {
                ptr1++;
            }
            else {
                ptr2++;
            }
        }


        return results;
    }

}

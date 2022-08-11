package com.sud.main;

public class FastFib {
    public static int getNthFib(int n) {
        int num1 = 0;
        int num2 = 1;
        int num3=0;
        int counter = 0;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        while (counter < n-1) {

            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    return num1;


    }
}

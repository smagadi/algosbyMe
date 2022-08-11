package com.sud.main;

import java.util.HashMap;

public class FastFibRecur {
   static  HashMap<Integer,Integer> fibmem = new HashMap<Integer,Integer>();

    public static int getNthFib(int n) {

        int result=0;




        for(int i=0;i<n;i++)
        {
            result=fib(i);

        }

        return result;
    }

    private static int  fib(int n)
    {
        if(n<=1)
            return n;
        if(fibmem.containsKey(n))
            return fibmem.get(n);

        int result=  fib(n-1)+fib(n-2);
        fibmem.put(n,result);
        return  result;

    }
}

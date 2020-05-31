package com.madhavan.projecteuler;

import java.math.BigInteger;

public class ThousandFibonacciNumber {

    public static void main(String[] args) {
        int n = Integer.MAX_VALUE; /// Max value

        BigInteger t1 = new BigInteger("0");
        BigInteger t2 = new BigInteger("1");
     /*   int t1 = 0;
        int t2 = 1;*/
        int evenSum = 0;

        for (int i = 0; i < n; i++) {
            BigInteger fibonacciValue = new BigInteger("0");

            fibonacciValue = t1.add(t2);
            t1 = t2;
            t2 = fibonacciValue;

            if(fibonacciValue.toString().length() >= 1000) {
               // System.out.println(fibonacciValue);
                System.out.println(fibonacciValue+"===Index===="+(i+1));
                break;
            }
        }
    }
}

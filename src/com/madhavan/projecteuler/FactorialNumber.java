package com.madhavan.projecteuler;

import java.math.BigInteger;

public class FactorialNumber {
    /*
    n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
     */

    public static void main(String[] args) {

        int N = 100;
        BigInteger result = new BigInteger("1");
        for (int i = N ; i>=1 ; i--){
            result = result.multiply(BigInteger.valueOf(Integer.valueOf(i)));
        }
        System.out.println("Result=="+result);

        char[] summation = result.toString().toCharArray();
        int sum = 0 ;
        for(char c : summation){
            Character character = new Character(c);
            sum = sum+Integer.valueOf(character.toString());
        }
        System.out.println(sum);



    }
}

package com.madhavan.projecteuler;

/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class EvenFibonacciNumbers {

    public static void main(String[] args) {
        int n = 100; /// Max value
        int t1 = 0;
        int t2 = 1;
        int evenSum = 0;

        for (int i =0;i<n ; i++){
            int fibinacciValue = t1+t2;
            if(fibinacciValue < 4000000) {
                if(fibinacciValue % 2 ==0){
                    evenSum += fibinacciValue;
                }
                t1 = t2;
                t2 = fibinacciValue;
                System.out.println(fibinacciValue);
            }

        }
        System.out.println("Total Sum ="+evenSum);
    }
}

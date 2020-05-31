package main.java.projecteuler;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class MultiplesOfThreeAndFive {


    public static void main(String[] args) {

        int n = 10000; // Number of recursion
        int sum = 0; // Total Value
        for(int i=0;i<n;i++){
            if (i % 3 == 0 || i % 5 == 0) {
                sum+=i;
            }
        }
        System.out.println("Sum of numbers divisible by 3 or 5 less than "+n+"===="+sum);
    }
}



package com.madhavan.projecteuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SummationOfPrimes {
    public static void main(String[] args) {
        double aa = Math.sqrt((double)1526565);
        for(int j=2;j<=aa;j++){
        System.out.println(j);
        }
       // System.out.println(getSumOfPrimes(2000000));
        //System.out.println(getSumofPrimeList(2000000).stream().mapToInt(Integer::intValue).sum());
    }


    private static BigInteger getSumOfPrimes(int n){
        BigInteger sum = new BigInteger("2");
        boolean isPrime = true;

        for(int i=3;i<n;i++){
            double aa = Math.sqrt((double)i);
            for(int j=2;j<=aa;j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum = sum.add(BigInteger.valueOf(i));
            }
            isPrime = true;
        }
        System.out.println("Sum="+sum);
        return sum;
    }

    public static List<Integer> getSumofPrimeList(int n){
        int sumprime = 0;
        List<Integer> listPrime = new ArrayList<>();
        for (int prime = 2; prime < n; prime++) {
            boolean flag = false;
            for (int i = 2; i <= prime / 2; ++i) {
                if (prime % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(prime);
                sumprime += prime;
                listPrime.add(prime);
            }
        }
        //System.out.println(sumprime);
        return listPrime;
    }
}

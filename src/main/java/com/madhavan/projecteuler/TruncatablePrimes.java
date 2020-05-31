package com.madhavan.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class TruncatablePrimes {

    public static void main(String[] args) {

        System.out.println(getNthPrimeNumber());
    }
    private static int getNthPrimeNumber(){
        List<Integer> primeNumberList = new ArrayList<>();
        int count =0;

        outer:
        for (int i = 2; i < 20; i++) {
            boolean flag = false;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                count++;
                if(Integer.valueOf(i).toString().length() >= 2){
                    System.out.println(i);
                }
            }
        }
        return -1;
    }
}

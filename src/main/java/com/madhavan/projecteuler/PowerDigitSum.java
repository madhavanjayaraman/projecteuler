package main.java.projecteuler;

import java.math.BigInteger;

public class PowerDigitSum {
    public static void main(String[] args) {
        //2^15 = 32768 and their sum is 3+2+7+6+8 = 26

        int result = 0;

        String val = BigInteger.valueOf(2).pow(1000).toString();

        for(char a : val.toCharArray()){
            result = result + Character.getNumericValue(a);
        }
        System.out.println("val ==>" + result);

        String value = BigInteger.valueOf(2).pow(15).toString();
        System.out.println("val ==>" + value);
    }
}

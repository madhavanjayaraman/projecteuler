package main.java.projecteuler;

import java.math.BigInteger;

public class SelfPowers {
    public static void main(String[] args) {

        int N = 1000;
        BigInteger bigInteger = new BigInteger("0");
        for(int i = 1; i <=N ; i++){
            BigInteger power = BigInteger.valueOf(i).pow(i);
            bigInteger = bigInteger.add(power);
        }
        System.out.println(bigInteger.toString());
    }
}

package com.madhavan.projecteuler;

import java.math.BigInteger;
import java.util.*;

public class DistinctPowers {
    public static void main(String[] args) {
        int N = 5;
        System.out.println("Size of the Distinct Chain for 2 ≤ a ≤ +"+N+ "and 2 ≤ b ≤ "+N+"=="+getDistinctTerms(N));
    }

    private static int getDistinctTerms(int powers){
        SortedSet<BigInteger> chains = new TreeSet<>();
       // Set<BigInteger> chains = new HashSet<>();
        for (int i =2; i <= powers;i++){
            // System.out.print(i+"-->");
            for (int j =2; j <= powers;j++) {
                BigInteger distPower = new BigInteger(String.valueOf(i));
                //  System.out.print(distPower.pow(j)+",");
                chains.add(distPower.pow(j));
            }
            //System.out.println();
        }
        System.out.println(chains);
        return chains.size();
    }
}

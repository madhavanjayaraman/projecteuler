package main.java.projecteuler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DistinctPrimeFactors {
    public static void main(String[] args) {

        Map<Integer, Set<Integer>> primeNumberMap = new HashMap<>();

        int N = Integer.MAX_VALUE;
        int O = 1; // Count to Check Consecutive

        for(int i =3; i<N;i++){
            primeNumberMap.put(i,getPrimeFactors(i));
        }

        for(int check : primeNumberMap.keySet()){
          //  System.out.println(check + "--" + primeNumberMap.get(check));

           if(primeNumberMap.get(check).size() == 4 && primeNumberMap.get(check-1).size() == 4 && primeNumberMap.get(check-2).size() == 4 && primeNumberMap.get(check-3).size() == 4){
               System.out.println(check + "--" +primeNumberMap.get(check));
               break;
           }

        }
    }


    private static Set<Integer> getPrimeFactors(int number){
        Set<Integer> primeNumber = new HashSet<>();
        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                //System.out.println(i+" ");
                primeNumber.add(i);
                number = number/i;
            }
        }
        if(number >2) {
            primeNumber.add(number);
            //System.out.println(number);
        }
        //System.out.println(number +"-----"+ primeNumber);
        return primeNumber;
    }
}

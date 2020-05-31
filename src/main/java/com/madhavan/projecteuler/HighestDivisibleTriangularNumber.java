package main.java.projecteuler;

import java.util.HashMap;

public class HighestDivisibleTriangularNumber {

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        System.out.println(getFirstTriNumOver500());
        long endTime = System.nanoTime();
        System.out.println("Completed in " + (endTime-startTime) + " nanoseconds.");

        startTime = System.nanoTime();
        System.out.println(getFirstTriNumOver500Naive());
        endTime = System.nanoTime();
        System.out.println("Completed in " + (endTime - startTime) + " nanoseconds.");
    }


    public static int getFirstTriNumOver500() {

        int possibilities = 1;
        int n = 1;
        int sum = 1;

        while(possibilities < 500) {

            possibilities = 1;
            HashMap<Integer, Integer> factors = getPrimeFactors(sum);

            for (Integer key : factors.keySet()) {
                possibilities *= factors.get(key)+1;
            }
            sum += ++n;
        }

        return sum - n;


    }

    public static int getFirstTriNumOver500Naive() {

        int n = 1;
        int sum = 1;

        while (getNumDivisors(sum) < 500) {
            sum += ++n;
        }

        return sum;
    }

    public static int getNumDivisors(int input) {

        int factor = 0;

        /**
         * Only up to the square root.
         *  If there exists a factor between input and sqrt(input)
         *  then that value will have a corresponding factor between 3 and sqrt(input)
         */
        for (int i = 1; i <= Math.sqrt(input); i++) {

            if (i*i == input) {
                factor++;
            } else if (input % i == 0) {
                factor += 2;
            }
        }

        return factor;
    }

    public static HashMap<Integer, Integer> getPrimeFactors(int input) {

        HashMap<Integer, Integer> factors = new HashMap<>();

        int possiblePrimeFactor = 2;

        while (input != 1) {

            while (input % possiblePrimeFactor == 0) {

                if (factors.get(possiblePrimeFactor) == null) {
                    factors.put(possiblePrimeFactor, 1);
                } else {
                    factors.put(possiblePrimeFactor, factors.get(possiblePrimeFactor)+1);
                }

                input /= possiblePrimeFactor;

            }

            possiblePrimeFactor++;
        }

        return factors;

    }

    /*public static void main(String[] args) {
        int N = Integer.MAX_VALUE;
        //1, 3, 6, 10, 15, 21, 28, 36, 45, 55

        long trinumber = 1;
        for(int i=1; i<= N; i++) {

            int factorCount = 0;
            for (int j =1; j<=trinumber;j++){
                if(trinumber%j ==0){
                    System.out.print(j+",");
                    factorCount++;
                }
            }
            System.out.println("==="+trinumber+"==="+i+",Factor Count==="+factorCount);
            if(factorCount>=100) {
                System.out.println("Found the Factors More than 500=="+trinumber);
                break;
            }
            trinumber += i +1;
        }
    }*/
}

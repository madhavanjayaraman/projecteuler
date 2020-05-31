package main.java.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class CircularPrimes {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int count=0;
        for(int i=0;i<=1000;i++)
        {
            String str=String.valueOf(i);
            for(int j=0;j<str.length();j++)
            {
                char tmp=str.charAt(j);
                int cmp=Character.getNumericValue(tmp);
                if(cmp==5)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static int getNthPrimeNumber(){
        List<Integer> primeNumberList = new ArrayList<>();
        int count =0;

        outer:
        for (int i = 2; i < 100; i++) {
            boolean flag = false;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                count++;
                System.out.println("Prime Number" + i);
                if (count == 10001) {
                    System.out.println("10 001th Prime Number" + i);
                    return i;
                }
            }
        }
        return -1;
    }


    public static void rotateNumber(long number)

    {

        long start = number;



        int numdigits = (int) Math.log10((double)number); // would return numdigits - 1

        int multiplier = (int) Math.pow(10.0, (double)numdigits);



        //System.out.println(numdigits);

        //System.out.println(multiplier);



        while(true)

        {

            long q = number / 10;

            long r = number % 10;



            //1234 = 123;

            number = number / 10;

            number = number + multiplier * r;



            System.out.println(number);



            if(number == start)

                break;

        }

    }
}

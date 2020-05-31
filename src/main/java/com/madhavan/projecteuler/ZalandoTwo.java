package main.java.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class ZalandoTwo {
    public static void main(String[] args) {
        int a = 6000, b = 7000;

        List<Integer> getSq = countSquares(a,b);
        for(Integer temp : getSq){
            int floor= floorSqrt(temp);
        }


    }

    private static boolean isSqrt(int x){
        Double ss = Math.sqrt(x);
        if (Double.toString(ss).endsWith(".0")) return true;
        else return false;
    }

    private static List<Integer>  getSqrt(int starting_number, int ending_number){
        List<Integer> getListOfSqureRt = new ArrayList<>();
        for (int i = starting_number; i <= ending_number; i++) {
            int number = i;
            int sqrt = (int) Math.sqrt(number);
            if (sqrt * sqrt == number) {
                getListOfSqureRt.add(sqrt);
            }
        }
        return getListOfSqureRt;
    }

    static int floorSqrt(int x)
    {
        if (x == 0 || x == 1)
            return x;
        int i = 1, result = 1;

        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }
    static List<Integer> countSquares(int a, int b)
    {
        int cnt = 0;
        List<Integer> getListOfNumber = new ArrayList<>();
        for (int i = a; i <= b; i++)
            for (int j = 1; j * j <= i; j++)
                if (j * j == i){
                    cnt++;
                    getListOfNumber.add(i);
                }
        return getListOfNumber;
    }

}

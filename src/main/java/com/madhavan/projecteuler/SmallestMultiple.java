package com.madhavan.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class SmallestMultiple {
    public static void main(String[] args) {
        System.out.println("Number Matched=" + smallestNumber(20));
    }

    private static int smallestNumber(int divisbile) {

        outer:
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            List<Boolean> tempArray = new ArrayList<>();
            for (int j = 1; j <= divisbile; j++) {
                if (i % j == 0) tempArray.add(true);
                else {
                    tempArray.add(false);
                    continue outer;
                }
            }
            if (!tempArray.contains(false)) {
                return i;
            }
        }
        return -1;
    }
}

package com.madhavan.projecteuler;

import java.util.HashSet;

public class ZalondoMock {

    static int[] j = {1, 2, 3};

    public static void main(String[] args) {
        System.out.println(getSmallest(j));
    }
    public static int getSmallest(int[] A) {

        int res = 0;
        HashSet<Integer> list = new HashSet<>();
        for (int i : A) list.add(i);
        for (int i = 1; i <= 1000000; i++) {
            if(!list.contains(i)){
                res = i;
                break;
            }
        }
        return res;
    }


}

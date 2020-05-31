package com.madhavan.projecteuler;

public class ZalandoMain {

    public static void main(String[] args) {
        int N = 999999999;
        System.out.println(getSmallest(N));

    }

    private static int getSmallest(int N){
        String str = Integer.toString(N);
        for(int i=0;i<1000000000;){
            String getLength = Integer.toString(i);
            if(str.length() == getLength.length()) {
                return i;
            }
            i = (i == 0)?10:i*10;
            System.out.println(i);
        }
        return -1;
    }
}

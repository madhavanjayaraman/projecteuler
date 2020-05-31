package com.madhavan.projecteuler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitsofFive {
    public static void main(String[] args) {
        int N = 1000;
        int P = 5;
        int totalCount = 0;
        String findNumber = Integer.toString(P);
        Pattern p = Pattern.compile(Integer.toString(P));

        for (int i = 0; i < N ; i++){
            String naturalNumber = Integer.toString(i);
            if(naturalNumber.contains(findNumber)){
                Matcher m = p.matcher( naturalNumber );
                int j =0;
                while (m.find()) {
                    j++;
                }
                totalCount += j;

            }
        }
        System.out.println("Number "+P+" occurs "+totalCount + " times till " + N );
    }
}

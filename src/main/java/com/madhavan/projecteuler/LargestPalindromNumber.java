package main.java.projecteuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPalindromNumber {
    public static void main(String[] args) {

        int startValue = 1000;
        int maxValue = 9999;
        List<Integer> listPalindromes = new ArrayList<>();
        for (int i = maxValue; i > startValue; i--) {
            for (int j = maxValue; j > startValue; j--) {
                int mul = j * i;
                if (isPalindrome(mul)) {
                    listPalindromes.add(Integer.valueOf(mul));
                }
            }
        }
        System.out.println(Collections.max(listPalindromes));

    }

    static boolean isPalindrome(int i) {

        String reversed = new StringBuilder(Integer.toString(i).toString()).reverse().toString();
        return Integer.toString(i).toString().equals(reversed) ? true : false;
    }
}

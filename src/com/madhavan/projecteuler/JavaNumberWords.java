package com.madhavan.projecteuler;

import javax.lang.model.element.NestingKind;

public class JavaNumberWords {

    private static String[] untis = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static String[] teens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety",};
    private static String hundreds = "hundred";
    private static String thousands = "thousand";
    private static String laks = "lak";

    public static void main(String[] args) {

        int sumofwords = 0;
        for (int i = 1; i <= 1000; i++) {

            String value = Integer.valueOf(i).toString();

            char[] chars = value.toCharArray();

            String numericWord = "";

            if (value.length() == 1 && Integer.valueOf(value) <= 9) { // Ones
                numericWord = untis[Integer.valueOf(value) - 1];

            } else if (value.length() == 2 && Integer.valueOf(value) >= 10 && Integer.valueOf(value) <= 99) { // teens
                int pos1 = Integer.valueOf(Character.toString(chars[0])) - 1;
                int pos2 = Integer.valueOf(Character.toString(chars[1])) - 1;
                if (Integer.valueOf(value) >= 11 && Integer.valueOf(value) <= 19) numericWord = teens[pos2];
                else if (pos2 == -1) numericWord = tens[pos1];
                else numericWord = tens[pos1] + " " + untis[pos2];

            } else if (value.length() == 3 && Integer.valueOf(value) >= 100 && Integer.valueOf(value) <= 999) {

                int pos1 = Integer.valueOf(Character.toString(chars[0])) - 1;
                int pos2 = Integer.valueOf(Character.toString(chars[1])) - 1;
                int pos3 = Integer.valueOf(Character.toString(chars[2])) - 1;

                if (pos2 == -1 && pos3 == -1) numericWord = untis[pos1] + " " + hundreds;
                else if (pos2 == -1) numericWord = untis[pos1] + " " + hundreds + " and " + untis[pos3];
                else if (pos3 == -1) numericWord = untis[pos1] + " " + hundreds + " and " + tens[pos2];
                else if (pos2 == 0 || (pos1 == 0 && pos2 == 0))
                    numericWord = untis[pos1] + " " + hundreds + " and " + teens[pos3];
                else numericWord = untis[pos1] + " " + hundreds + " and " + tens[pos2] + " " + untis[pos3];
            } else if (value.length() == 4) {
                numericWord = "one " + thousands;
            }
            sumofwords += numericWord.replaceAll("\\s+", "").length();
            System.out.println(i + " == " + numericWord + " === Length ==== " + numericWord.replaceAll("\\s+", "").length());
        }

        System.out.println("finalcount= " + sumofwords);
    }

    /*
    for (int i = 1; i <= 19; i++) {
            String value = Integer.valueOf(i).toString();
            char[] chars = value.toCharArray();
            if (value.length() == 1 && Integer.valueOf(value) <= 9) {
                System.out.println(untis[Integer.valueOf(value) - 1]);
            } else if (value.length() == 2 && Integer.valueOf(value) >= 10 && Integer.valueOf(value) <= 19) {
                System.out.println(teens[Integer.valueOf(Character.toString(chars[1]))]);
            }
        }
     */
}

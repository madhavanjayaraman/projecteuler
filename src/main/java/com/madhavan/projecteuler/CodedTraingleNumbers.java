package com.madhavan.projecteuler;

/**
 * date 5/31/2020 , time 12:14 PM
 * project_name projecteuler
 **/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static java.util.stream.Collectors.toList;

/**
 * The nth term of the sequence of triangle numbers is given by, tn = ½n(n+1); so the first ten triangle numbers are:
 * <p>
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * <p>
 * By converting each letter in a word to a number corresponding to its alphabetical position and adding these values we form a word value.
 * For example, the word value for SKY is 19 + 11 + 25 = 55 = t10.
 * If the word value is a triangle number then we shall call the word a triangle word.
 * <p>
 * Using words.txt (right click and 'Save Link/Target As...'), a 16K text file containing nearly two-thousand common English words,
 * how many are triangle words?
 */
public class CodedTraingleNumbers {
    private static Set<Integer> codedTraingleSet;

    public static void main(String[] args) throws IOException {
        getCodedTraingleSet();
        int total = 0;
        for (String name : getNameList()) {
            int countTotal = getTotalCount(name);
            if (codedTraingleSet.contains(countTotal)) {
                total += 1;
            }
        }System.out.println("MY BAD DADDY");
        System.out.println("Overall Total===" + total);
    }

    private static void getCodedTraingleSet() {
        codedTraingleSet = new LinkedHashSet<>();
        int count = 100;
        for (int n = 1; n <= count; n++) {
            int t = (n * (n + 1)) / 2;
            codedTraingleSet.add(t);
        }
        codedTraingleSet.stream().sorted(Comparator.reverseOrder());
       // System.out.println(codedTraingleSet);
    }

    private static int getTotalCount(String txt) {
        char[] txtCharArray = txt.replace("\"","").toCharArray();
        int total = 0;
        for (char a : txtCharArray) {
            int index = (int) a % 32;
            total = total + index;
        }
        return total;
    }

    private static List<String> getNameList() throws IOException {
        String fileName = "E:\\Workspace_Personal\\GitHub\\projecteuler\\src\\main\\resources\\p042_words.txt";
        List<String[]> lines = Files.lines(Paths.get(fileName)).map(l -> l.split(","))
                .collect(toList());
        List<String> listOfString = Arrays.asList(lines.get(0));
        System.out.println("Total Words==="+listOfString.size());
        return listOfString;
    }
}

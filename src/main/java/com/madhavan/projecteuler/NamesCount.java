package main.java.projecteuler;

import java.io.*;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class NamesCount {
    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String fileName = "E:\\Workspace_Personal\\ProjectEuler\\p022_names.txt";
        try {
            List<String[]> lines = Files.lines(Paths.get(fileName)).map(l -> l.split(","))
                    .collect(toList());

            List<String> listOfString = Arrays.asList(lines.get(0));
            listOfString.sort(Comparator.comparing(String::toString));

            int index = 0;
            BigInteger totalscore = new BigInteger("0");
            for(String s : listOfString){
                char[] tempchararray = s.replace("\"","").toLowerCase().toCharArray();

                int countscore=0;
                for (char temp : tempchararray){
                    countscore += alphabet.indexOf(temp)+1;
                }

                int temp = (index+1)* countscore;
                totalscore = totalscore.add(BigInteger.valueOf(temp));

                System.out.println((index+1)+"=="+s+"=="+countscore+"---Total Score "+temp);
                index++;
            }
            System.out.println("Total Score"+totalscore);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

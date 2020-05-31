package main.java.projecteuler;

public class SumSquareDifference {
    public static void main(String[] args) {

        int sumofsquare = 0;
        int squareofsum = 0;
        for (int i = 1; i <= 100; i++) {
            squareofsum = squareofsum + i;
            sumofsquare += Math.pow(i,2);

        }
        System.out.println(sumofsquare);
        System.out.println((int) Math.pow(squareofsum, 2));

        System.out.println((int) Math.pow(squareofsum, 2) - sumofsquare);
    }
}

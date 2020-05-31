package main.java.projecteuler;

public class PythogoronTriplet {

    public static void main(String[] args) {
        int N = 1000;
        for(int a = 1; a <= N; a++){
            for(int b =1; b <= N; b++){
                for(int c=1; c <= N; c++){
                    if (a*a + b*b == c*c) {
                        if(a+b+c == N){
                            System.out.println("Triplet Series="+a + "-" + b + "-" + c);
                            System.out.println("Found Triplet Number and their product is "+a*b*c);
                        }
                    }
                }
            }
        }
    }
}

package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        SquareRoot sr = new SquareRoot();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sr.mySqrt(n));
    }
    public int mySqrt(int x) {
        if(x<=0){
            throw new IllegalArgumentException("Enter value > 0");
        }
        return (int) Math.sqrt(x);
    }
}

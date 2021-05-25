package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args){
        SumOfSquares ss = new SumOfSquares();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ss.judgeSquareSum(n));
}
    public boolean judgeSquareSum(int c) {
        if(c<=0){
            throw new IllegalArgumentException("Enter value > 0");
        }
        for(int b = 0; b <= Math.sqrt(c); b++){
            int diff = (c - b*b);
            double a = Math.sqrt(diff);
            if(Math.ceil(a) == Math.floor(a)) return true;
        }
        return false;
    }
}

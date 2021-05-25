package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        PowerOfFour po = new PowerOfFour();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(po.isPowerOfFour(n));
    }
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            throw new IllegalArgumentException("Enter value > 0");
        }
        double result = Math.log(n) / Math.log(4);
        return (int) result == result;
    }
}

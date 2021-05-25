package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        PowerOfThree po = new PowerOfThree();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(po.isPowerOfThree(n));
    }
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            throw new IllegalArgumentException("Enter value > 0");
        }
        return abc(n);
    }
    public boolean abc(int n){
        if(n == 1)
            return true;
        if(n == 0 || n % 3 > 0)
            return false;
        else
            return abc(n/3);
    }

}

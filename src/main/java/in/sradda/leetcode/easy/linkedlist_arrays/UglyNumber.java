package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        UglyNumber un = new UglyNumber();
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        System.out.println(un.isUgly(n1));
    }
    public boolean isUgly(int n) {
        if(n<0){
            throw new IllegalArgumentException("enter value > 0");
        }
        if(n == 0){
            return false;
        }
        for(int i = 2; i < 6; i++){
            while(n % i == 0){
                n /= i;
            }
        }
        return n == 1;
    }
}


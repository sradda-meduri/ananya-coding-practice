package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class CountOdds {
    public static void main(String[] args) {
        CountOdds co = new CountOdds();
        Scanner sc = new Scanner(System.in);
        int low1 = sc.nextInt();
        int high1 = sc.nextInt();
        System.out.println(co.countOdds(low1,high1));
    }
    public int countOdds(int low, int high) {
        int len=high-low+1;
        if(low % 2 == 0) return (len/2);
        else return (len%2==0? len/2: len/2+1);
    }
}

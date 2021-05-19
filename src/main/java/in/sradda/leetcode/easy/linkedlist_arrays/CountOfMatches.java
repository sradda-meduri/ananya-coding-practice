package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class CountOfMatches {
    public static void main(String[] args) {
        CountOfMatches c = new CountOfMatches();
        System.out.println("enter number of teams");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("number of matches:"+ c.numberOfMatches(n));
    }
    public int numberOfMatches(int n) {
        int res=0;
        int sum=0;
        while(n>1){
            res=n/2;
            sum=sum+res;
            n=n-res;
        }
        return sum;
    }
}

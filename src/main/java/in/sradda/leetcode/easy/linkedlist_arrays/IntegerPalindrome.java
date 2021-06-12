package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class IntegerPalindrome {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        IntegerPalindrome pi = new IntegerPalindrome();
        System.out.println(pi.isIntegerPalindrome(num));
    }
    public boolean isIntegerPalindrome(int x) {
        if(x == 0) {
            return true;
        }
        if(x < 0 || x%10 == 0)
            return false;

        int temp = 0;
        int preX = x;
        while (x > temp) {
            int pop = x%10;
            preX = x;
            x /= 10;

            temp = temp*10 + pop;
        }
        if(x == temp || preX == temp)
            return true;
        else
            return false;
    }
}

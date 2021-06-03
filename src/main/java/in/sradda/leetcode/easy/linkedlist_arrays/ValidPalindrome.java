package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        System.out.println(vp.validPalindrome(inp));
    }
    public boolean validPalindrome(String s) {
        if(s.equals("")){
            throw new IllegalArgumentException("Enter valid string");
        }
        if(s==null || s.length()<2) return true;

        int left = 0, right = s.length()-1;
        while(left<right) {
            if(s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left+1, right) || isPalindrome(s, left, right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(String s, int left, int right) {
        while(left<right) {
            if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}

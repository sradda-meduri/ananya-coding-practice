package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        StringPalindrome p = new StringPalindrome();
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        System.out.println(p.isPalindrome(inp));
    }
    public boolean isPalindrome(String s) {
        if(s.equals("")){
            throw new IllegalArgumentException("Enter valid string");
        }
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]+", "");

        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}

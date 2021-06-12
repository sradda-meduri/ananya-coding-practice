package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        AddDigits ad= new AddDigits();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ad.addDigits(n));
    }
    public int addDigits(int num) {
        if(num==0)
            return 0;
        if(num%9==0)
            return 9;
        return num%9;
    }
}

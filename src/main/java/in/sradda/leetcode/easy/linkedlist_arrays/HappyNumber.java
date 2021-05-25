package in.sradda.leetcode.easy.linkedlist_arrays;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        HappyNumber ha = new HappyNumber();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(ha.isHappy(n));
    }
    public boolean isHappy(int n) {
        if(n<=0){
            throw new IllegalArgumentException("Enter value > 0");
        }
        int sum=0;
        while(n>0){
            sum += Math.pow((n % 10), 2);
            n = n / 10;
        }
        if (sum == 1 || sum == 7) return true;
        if (sum < 10) return false;
        return isHappy(sum);
    }
}

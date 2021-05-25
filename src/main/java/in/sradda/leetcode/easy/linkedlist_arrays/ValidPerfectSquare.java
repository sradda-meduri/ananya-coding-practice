package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        ValidPerfectSquare vp = new ValidPerfectSquare();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(vp.isPerfectSquare(n));
    }
    public boolean isPerfectSquare(int num) {
        if(num<=0){
            throw new IllegalArgumentException("Enter value > 0");
        }
        int i=(num/2);
        boolean flag=false;
        if(num==1){
            flag=true;
        }
        for(int j=0;j<=i;j++){
            if(j*j == num){
                flag=true;
            }
        }
        return flag;
    }
}

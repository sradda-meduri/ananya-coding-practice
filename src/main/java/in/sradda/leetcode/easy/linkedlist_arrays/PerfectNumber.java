package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        PerfectNumber pn = new PerfectNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pn.checkPerfectNumber(n));
    }
    public boolean checkPerfectNumber(int num) {
        if(num<0){
            return false;
        }
        int sum=0;
        for(int i=1;i<=(num/2);i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        return sum==num;
    }
}

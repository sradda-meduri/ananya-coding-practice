package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        PowerOfTwo po = new PowerOfTwo();
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        System.out.println(po.isPowerOfTwo(m));
    }
    public boolean isPowerOfTwo(int n) {
        if(n<0){
            throw new IllegalArgumentException("Enter +ve value");
        }
        if(n==0)
            return false;

        while(n!=1)
        {
            if(n%2!=0)
                return false;

            n=n>>1;
        }
        return true;
    }
}

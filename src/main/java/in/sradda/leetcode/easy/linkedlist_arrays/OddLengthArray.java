package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class OddLengthArray {
    public static void main(String[] args) {
        OddLengthArray o = new OddLengthArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length");
        int l=sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        int res=o.sumOddLengthSubarrays(arr);
        System.out.println(res);
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int s = 1;
        int l = arr.length;
        int tSum = 0;
        int sum=0;

        while(s<=l){
            sum = 0;
            for(int i=0; i<s; i++)
                sum += arr[i];

            tSum += sum;

            for(int i=s; i<l; i++){
                sum += arr[i] - arr[i-s];
                tSum += sum;
            }
            s+=2;
        }
        return tSum;
    }

}

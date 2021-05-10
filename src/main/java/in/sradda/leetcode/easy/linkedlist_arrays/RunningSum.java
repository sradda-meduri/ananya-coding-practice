package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        RunningSum r = new RunningSum();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of an array");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int[] a = r.runningSum(arr);           //obtain the array
        for (int i = 0; i < a.length; i++) { //for loop to print the array
            System.out.print(a[i] + " ");
        }
    }
    public int[] runningSum(int[] nums) {
        int sum=0;
        int len=nums.length;
        int[] l1 = new int[len];
        for(int i=0;i<len;i++){
            sum=sum+nums[i];
            l1[i]=sum;
        }
        return l1;
    }
}

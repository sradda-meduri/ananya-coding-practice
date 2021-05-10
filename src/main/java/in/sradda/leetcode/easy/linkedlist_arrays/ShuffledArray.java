package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class ShuffledArray {
    public static void main(String[] args) {
        ShuffledArray s = new ShuffledArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n= sc.nextInt();
        System.out.println("enter length");
        int len = sc.nextInt();
        int[] l1 = new int[len];
        for(int i=0;i<len;i++){
            l1[i]=sc.nextInt();
        }

        int[] l2 = s.shuffle(l1,n);
        for(int i=0;i<l2.length;i++){
            System.out.println(l2[i]);
        }

    }

    public int[] shuffle(int[] nums, int n) {
        int[] l1 = new int[nums.length];
        int index = 0;
        int temp = 0;
        for (int i = 0; i < nums.length/2; i++) {
            l1[index] = nums[i];
            l1[index+1] = nums[i+n];
            index += 2;
        }
        return l1;
    }
}

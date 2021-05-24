package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfUnique {
    public static void main(String[] args) {
        SumOfUnique su=new SumOfUnique();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        su.inp(n);
    }
    public void inp(int n1){
        if(n1 == 0){
            throw new IllegalArgumentException("length of array cannot be 0");
        }
        int n2=n1;
        Scanner sc = new Scanner(System.in);
        int[] res = new int[n1];
        for(int i=0;i<n1;i++){
            res[i]=sc.nextInt();
        }
        System.out.println(sumOfUnique(res));
    }
    public int sumOfUnique(int[] nums) {
        if(nums.length==0){
            throw new IllegalArgumentException("Empty array cannot be evaluated");
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] != nums[i + 1]) {
                    result += nums[i];
                }
            } else if (i == nums.length - 1) {
                if (nums[i] != nums[i - 1]) {
                    result += nums[i];
                }
            } else {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    result += nums[i];
                }
            }
        }
        return result;
    }
}

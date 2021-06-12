package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] arr= new int[]{1, 1, 2, 3};
        System.out.println(cd.containsDuplicate(arr));
    }
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0){
            throw new IllegalArgumentException("Empty array not allowed");

        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}

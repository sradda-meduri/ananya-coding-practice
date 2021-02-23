package in.sradda.leetcode.easy.linkedlist_arrays;

import java.sql.SQLOutput;

public class RemoveElement {
    public static void main(String[] args){
        RemoveElement removeElement = new RemoveElement();
        int[] nums=new int[]{3,2,2,3};
        int var=3;
        int a=remove1(nums,var);
        System.out.println("The length of the array "+a);
        System.out.println("The array is displayed as ");
        System.out.println("[ ");
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]+" ");
        }
        System.out.println("]");
    }
    public static int remove1(int[] nums,int var)
    {
        int finalArrayLength=0;
        int matchingElement=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=var)
            {
                finalArrayLength++;
            }
            else
            {
                int lastIndex =nums.length - matchingElement - 1;
                int temp = nums[lastIndex];
                nums[lastIndex] = -1;
                nums[i] = temp;
                matchingElement++;
                i--;
            }
        }
        return finalArrayLength;
    }




}

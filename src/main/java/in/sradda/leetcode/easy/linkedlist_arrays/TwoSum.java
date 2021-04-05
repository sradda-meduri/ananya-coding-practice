package in.sradda.leetcode.easy.linkedlist_arrays;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twosum=new TwoSum();
        int[] nums = new int[] {1,4,5,11};
        int target=16;
        int[] a=sum1(nums,target);
        for(int m=0;m<a.length;m++){
            System.out.println(a[m]+"");
        }
    }
    public static int[] sum1(int[] nums,int target)
    {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No 2 sum sol");
    }
}



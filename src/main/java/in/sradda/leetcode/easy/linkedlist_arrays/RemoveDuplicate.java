package in.sradda.leetcode.easy.linkedlist_arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        RemoveDuplicate rd = new RemoveDuplicate();
        int[] nu = new int[]{1,1,2,2,3,5,5};
        System.out.println(rd.removeDuplicates(nu));
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}

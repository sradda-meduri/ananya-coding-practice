package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RelativeSortArray {
    public static void main(String[] args) {
        RelativeSortArray rsa = new RelativeSortArray();
        int[] arr1 = new int[]{2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = new int[]{2,1,4,3,9,6};
        int[] a = rsa.relativeSortArray(arr1,arr2);          //obtain the array
        for (int i = 0; i < a.length; i++) { //for loop to print the array
            System.out.print(a[i] + " ");
        }
    }
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int ans[]=new int[arr1.length];
        int c=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    ans[c]=arr1[j];
                    set.add(ans[c]);
                    c++;
                }
            }
        }
        //compare ans and arr1
        for(int i=0;i<arr1.length;i++) {
            if(!set.contains(arr1[i])){
                ans[c]=arr1[i];
                c++;
            }
        }
        return ans;
    }
}

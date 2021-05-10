package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class RichestCustomer {
    public static void main(String[] args) {
        RichestCustomer r = new RichestCustomer();
        int[][] arr = new int[10][10];
        arr= new int[][] {{1,5},{7,3},{3,5}};
        System.out.println(r.maximumWealth(arr));
    }
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for(int i=0;i<accounts.length;i++)
        {
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum += accounts[i][j];
            }
            res = Math.max(res , sum);
        }
        return res;
    }
}

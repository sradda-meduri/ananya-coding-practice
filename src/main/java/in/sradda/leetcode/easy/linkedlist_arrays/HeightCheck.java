package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HeightCheck {
    public static void main(String[] args) {
        HeightCheck he = new HeightCheck();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        he.inp(n);
    }

    public void inp(int n1) {
        if (n1 == 0) {
            throw new IllegalArgumentException("length of array cannot be 0");
        }
        int n2 = n1;
        Scanner sc = new Scanner(System.in);
        int[] res = new int[n1];
        for (int i = 0; i < n1; i++) {
            res[i] = sc.nextInt();
        }
        System.out.println(heightChecker(res));
    }
    public int heightChecker(int[] heights) {
        if(heights.length==0){
            throw new IllegalArgumentException("Empty array cannot be evaluated");
        }
        int count=0;
        int len=heights.length;
        int[] res=heights.clone();
        Arrays.sort(res);
        for(int i=0;i<len;i++){
            if(heights[i]!=res[i]){
                count++;
            }
        }
        return count;
    }
}

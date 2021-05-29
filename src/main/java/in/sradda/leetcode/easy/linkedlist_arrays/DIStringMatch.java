package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class DIStringMatch {
    public static void main(String[] args) {
        DIStringMatch sm = new DIStringMatch();
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int[] a = sm.diStringMatch(inp);           //obtain the array
        for (int i = 0; i < a.length; i++) { //for loop to print the array
            System.out.print(a[i] + " ");
        }
    }
    public int[] diStringMatch(String s) {
        if(s.equals("")){
            throw new IllegalArgumentException("null values are not accepted");
        }
        int N = s.length();
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            if (s.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }

        ans[N] = lo;
        return ans;
    }
}

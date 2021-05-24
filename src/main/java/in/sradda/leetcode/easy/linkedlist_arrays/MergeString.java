package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class MergeString {
    public static void main(String[] args) {
        MergeString me= new MergeString();
        me.inp();
    }
    public void inp(){
        Scanner sc = new Scanner(System.in);
        String w1=sc.next();
        String w2 = sc.next();
        System.out.println(mergeAlternately(w1,w2));

    }
    public String mergeAlternately(String word1, String word2) {
        if(word1.equals("") || word2.equals("")){
            throw new IllegalArgumentException("empty values are not allowed");
        }

        int n=Math.min(word1.length(),word2.length());
        String ans = "";

        int i = 0;
        for(i=0; i<n; i++){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);
            ans += ch1;
            ans += ch2;
        }
        if(i != word1.length()){
            for(int j = i; j<word1.length(); j++){
                char ch = word1.charAt(j);
                ans += ch;
            }
        }
        if(i != word2.length()){
            for(int j = i; j<word2.length(); j++){
                char ch = word2.charAt(j);
                ans += ch;
            }
        }
        return ans;

    }
}

package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class ToLower {
    public static void main(String[] args) {
        ToLower t = new ToLower();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter word");
        System.out.println(t.toLowerCase(sc.next()));
    }
    public String toLowerCase(String str) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isUpperCase(c))
                res=res.append((char)(c+32));
            else
                res=res.append(c);
        }
        return res.toString();
    }
}

package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class DefanginganIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter valid IP Address");
        String a=sc.nextLine();
        DefanginganIPAddress d = new DefanginganIPAddress();
        String b = d.defangIPaddr(a);
        System.out.println(b);
    }
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}

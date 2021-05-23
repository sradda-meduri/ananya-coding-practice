package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryToDecimal {
    static class ListNode
    {
        int val;
        ListNode next;
    };

    static ListNode newNode(int data)
    {
        ListNode temp = new ListNode();
        temp.val = data;
        temp.next = null;
        return temp;
    }
    public static void main(String args[])
    {
        // Start with the empty list /
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter length");

        ListNode head = newNode(1);
        head.next = newNode(0);
        head.next.next = newNode(1);
        head.next.next.next = newNode(1);

        System.out.print( "Decimal value is "+getDecimalValue(head));
    }
    public static int getDecimalValue(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        int sum=0,j=0;
        for(int i=arr.size()-1;i>=0;i--)
        {
            if(arr.get(i)==1){
                sum+=Math.pow(2,j);
            }
            j++;
        }
        return sum;
    }
}

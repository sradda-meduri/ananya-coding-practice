package in.sradda.leetcode.easy.linkedlist_arrays;

import javax.security.sasl.SaslClient;
import java.util.Scanner;
import java.util.Stack;

public class Base7 {
    public static void main(String[] args) {
        Base7 b7 = new Base7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(b7.convertToBase7(n));
    }
    public String convertToBase7(int num) {
        if(num == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<Integer>();

        boolean isPosi = false;
        if(num >= 0) {
            isPosi = true;
        }

        num = Math.abs(num);
        while(num != 0) {
            if(num < 7) {
                stack.push(num);
                break;
            }
            int remainder = num % 7;
            stack.push(remainder);
            num /= 7;
        }

        StringBuilder sb = new StringBuilder();
        if(isPosi == false) {
            sb.append("-");
        }
        while(!stack.empty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}

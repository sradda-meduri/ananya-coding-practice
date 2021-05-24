package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class SquareIsWhite {
    public static void main(String[] args){
        SquareIsWhite obj= new SquareIsWhite();
        Scanner s = new Scanner(System.in);
        String inp=s.next();
        if(s.equals(" ")){
            throw new IllegalArgumentException("Empty string cannot be taken as Input");
        }
        if(s.equals(null)){
            throw new IllegalArgumentException("null cannot be taken as Input");
        }
        System.out.println(obj.squareIsWhite(inp));
    }
    public boolean squareIsWhite(String coordinates) {
        Character letter = coordinates.charAt(0), num = coordinates.charAt(1);
        int x = letter - 'a' + 1, y = Character.digit(num, 10);
        return (x + y) % 2 == 1;
    }
}

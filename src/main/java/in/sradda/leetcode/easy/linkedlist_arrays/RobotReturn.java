package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class RobotReturn {
    public static void main(String[] args) {
        RobotReturn rr = new RobotReturn();
        Scanner sc = new Scanner(System.in);
        String inp =  sc.next();
        System.out.println(rr.judgeCircle(inp));
    }
    public boolean judgeCircle(String moves) {
        if(moves.equals("")){
            throw new IllegalArgumentException("null input is not accepted");
        }
        int x = 0, y = 0;
        for (char move: moves.toCharArray()) {
            if (move == 'U') y--;
            else if (move == 'D') y++;
            else if (move == 'L') x--;
            else if (move == 'R') x++;
        }
        return x == 0 && y == 0;
    }
}

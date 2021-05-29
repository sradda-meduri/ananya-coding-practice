package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class MaxNumberOfBalls {
    public static void main(String[] args) {
        MaxNumberOfBalls mn = new MaxNumberOfBalls();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(mn.countBalls(m,n));
    }
    public int countBalls(int lowLimit, int highLimit) {
        if(lowLimit <= 0 || highLimit <=0){
            throw new IllegalArgumentException("Enter value > 0");
        }
        int[] box = new int[46];
        int current = boxNumber(lowLimit);
        box[current]++;
        int i = 1;
        while(lowLimit + i<= highLimit){
            if((lowLimit + i - 1 ) % 10 != 9){
                current++;
            }else{
                int k = numOfNinesAtTail(lowLimit + i - 1);
                current += 1 - k * 9;
            }
            box[current]++;
            i++;
        }

        int max = 0;
        for(i = 1; i < 46; i++)
            max = Math.max(max, box[i]);
        return max;

    }

    int boxNumber(int n){
        int boxNumber = 0;
        while(n > 0){
            boxNumber += n % 10;
            n /= 10;
        }
        return boxNumber;
    }

    int numOfNinesAtTail(int n){
        int count = 0;
        while(n % 10 == 9){
            count++;
            n /= 10;
        }
        return count;
    }
}

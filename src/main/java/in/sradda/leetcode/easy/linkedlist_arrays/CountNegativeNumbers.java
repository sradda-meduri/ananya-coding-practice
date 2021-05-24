package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class CountNegativeNumbers {
    public static void main(String[] args) {
        CountNegativeNumbers cou = new CountNegativeNumbers();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        cou.inputmat(m,n);

    }
    public void inputmat(int m1,int n1){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        if (m1 == 0 || n1 == 0) {
            throw new IllegalArgumentException("Null value not allowed");
        }
        System.out.println(countNegatives(matrix));
    }
    public int countNegatives(int[][] grid) {
        int mat[][] = {{}};
        if (grid == mat){
            throw new IllegalArgumentException("Empty Matrices not allowed");

        }
        int n= grid.length;
        int m= grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}

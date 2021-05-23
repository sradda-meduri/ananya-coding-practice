package in.sradda.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;

public class MaxPopulation {
    public static void main(String[] args) {
        MaxPopulation max = new MaxPopulation();

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        max.inputmat(m,n);

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



        System.out.println(maximumPopulation(matrix));

    }
    public int maximumPopulation(int[][] logs) {
        int mat[][] = {{}};
        if (logs == mat){
            throw new IllegalArgumentException("Empty Matrices not allowed");

        }
        int i = 1950;
        int max_pop = Integer.MIN_VALUE;
        int[] year = new int[2100];

        int ans = 0;

        while (i <= 2050) {
            int count = 0;

            for (int[] arr : logs) {
                int birth_year = arr[0];
                int death_year = arr[1];

                if (birth_year <= i && death_year > i)
                    count++;

                year[i] = count;
            }
            i++;
        }

        for (i = 0; i < year.length; i++) {
            if (year[i] > max_pop) {
                max_pop = year[i];
                ans = i;
            }
        }
        return ans;
    }
}

package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class NumberOfPrimes {
    public static void main(String[] args) {
        NumberOfPrimes np = new NumberOfPrimes();
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(np.countPrimes(num));
    }
    public int countPrimes(int n) {
        if(n<0){
            throw new IllegalArgumentException("Enter value > 0");
        }
        if (n <= 2) {
            return 0;
        }

        boolean[] numbers = new boolean[n];
        for (int p = 2; p <= (int)Math.sqrt(n); ++p) {
            if (numbers[p] == false) {
                for (int j = p*p; j < n; j += p) {
                    numbers[j] = true;
                }
            }
        }

        int numberOfPrimes = 0;
        for (int i = 2; i < n; i++) {
            if (numbers[i] == false) {
                ++numberOfPrimes;
            }
        }

        return numberOfPrimes;
    }
}

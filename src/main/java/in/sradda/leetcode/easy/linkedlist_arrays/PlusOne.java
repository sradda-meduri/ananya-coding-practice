package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        po.inp(n);

    }
    public void inp(int m){
        if(m<=0){
            throw new IllegalArgumentException("Enter value > 0");
        }
        Scanner sc = new Scanner(System.in);
        int mat[] = new int[m];
        for(int i=0;i<m;i++){
            mat[i]=sc.nextInt();
        }
        int[] a = plusOne(mat);
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i] + " ");
        }
    }
    public int[] plusOne(int[] digits) {
        if(digits.length==0) {
            throw new IllegalArgumentException("Empty Matrix not allowed");
        }
        int size = digits.length-1;

        for(int i = size ; i>=0; i--){
            if(digits[i] == 9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }

        int array[] = new int[digits.length+1];
        array[0]=1;
        for(int j = 1; j<array.length; j++){
            array[j]=digits[j-1];
        }

        return array;
    }
}

package in.sradda.leetcode.easy.linkedlist_arrays;

import javafx.scene.transform.Scale;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NandItsDouble {
    public static void main(String[] args) {
        NandItsDouble n = new NandItsDouble();
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        n.mat(len);
    }
    public void mat(int m){
        if(m<=0){
            throw new IllegalArgumentException("Enter value > 0");
        }
        int[] mat1 = new int[m];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<m;i++){
            mat1[i]=sc.nextInt();
        }
        System.out.println(checkIfExist(mat1));
    }
    public boolean checkIfExist(int[] arr) {
        if(arr.length==0){
            throw new IllegalArgumentException("Array cannot be empty");
        }
        Boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]*2) == arr[j] || (arr[j]*2) == arr[i]){
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
}

package in.sradda.leetcode.easy.linkedlist_arrays;

import javafx.scene.transform.Scale;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class SumZero {
    public static void main(String[] args) {
        SumZero s = new SumZero();
        s.inp();
    }
    public void inp(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        if(num==0){
//            throw new IllegalArgumentException("num cannot be equal to 0");
//        }
//        if(num<0){
//            throw new IllegalArgumentException("enter value greater than 0");
//        }
        int[] sol=new int[num];
        sol=sumZero(num);
        for(int i=0;i<num;i++){
            System.out.println(sol[i]);
        }
    }
    public int[] sumZero(int n) {
        if(n==0){
            throw new IllegalArgumentException("num cannot be equal to 0");
        }
        if(n<0){
            throw new IllegalArgumentException("enter value greater than 0");
        }

        if(n==1)
            return new int [] {0};
        int[] result = new int[n];
        if(n%2==0){
            int half=n/2;
            for(int i=0;i<half;i++){
                result[i]=i+1;
            }
            int j=1;
            for(int i=half;i<n;i++){
                result[i]=-(j);
                j++;
            }
        }
        else{
            int inc=n/2;
            for(int i = 0 ; i < inc; i++){
                result[i] = i+1;
            }

            result[inc] = 0;
            for(int j = result.length - 1 , i = 1; j > inc; j--, i++){
                result[j] = -(i);
            }
        }
        return result;
    }
}

package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueOccurances {
    public static void main(String[] args) {
        UniqueOccurances uo = new UniqueOccurances();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        uo.inp(n);
    }

    public void inp(int n1) {
        if (n1 == 0) {
            throw new IllegalArgumentException("length of array cannot be 0");
        }
        int n2 = n1;
        Scanner sc = new Scanner(System.in);
        int[] res = new int[n1];
        for (int i = 0; i < n1; i++) {
            res[i] = sc.nextInt();
        }
        System.out.println(uniqueOccurrences(res));
    }
    public boolean uniqueOccurrences(int[] arr) {
        if(arr.length==0){
            throw new IllegalArgumentException("Empty array cannot be evaluated");
        }
        Arrays.sort(arr);
        int len=arr.length;
        HashSet<Integer> occ = new HashSet<>();
        int count=1;
        if(len ==2 && arr[0] != arr[1]){
            return false;
        }

        for(int i=0; i< len-1; i++){
            if(arr[i] == arr[i+1])
                count++;
            else{
                if(!occ.contains(count)){
                    occ.add(count);
                    count=1;
                }

                else {
                    return false;
                }

            }

        }
        return true;
    }
}

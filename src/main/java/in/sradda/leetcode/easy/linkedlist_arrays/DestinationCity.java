package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DestinationCity {
    public static void main(String[] args) {
        DestinationCity des = new DestinationCity();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        des.inputmat(m, n);
    }

    public void inputmat(int m1, int n1) {
        Scanner sc = new Scanner(System.in);
        String[][] matrix = new String[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                matrix[i][j] = sc.next();
            }
        }
        if (m1 == 0 || n1 == 0) {
            throw new IllegalArgumentException("Null value not allowed");
        }
        System.out.println(destCity(matrix));

    }

     public String destCity(String[][] paths) {
        Map<String,String> map = new HashMap<>();
        String result = "";
//        for(String[] list : paths)
//            map.put(list.get(0),list.get(1));
//        for(String[] list : paths){
//            if(!map.containsKey(list.get(1)))
//                result = list.get(1);
//             }
      return result;
    }
}
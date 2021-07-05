package in.sradda.sorting_algorithms;

import java.util.StringTokenizer;

public class SelectionSort {
    public static void main(String[] args) {

        int[] intArray = { 20,35,55,-4,6,60};
        SelectionSort ss = new SelectionSort();
        int[] outputArray = ss.sorting(intArray);

        for (int i=0 ; i< outputArray.length ; i++){
            System.out.println(outputArray[i]);
        }
    }
    public static int[] sorting(int[] intArray){
        for (int lastUnsortedIndex = intArray.length - 1;lastUnsortedIndex > 0 ; lastUnsortedIndex --){
            int largest = 0;

            for(int i = 1 ; i<= lastUnsortedIndex ; i++){
                if(intArray[i] > intArray[largest]){
                    largest = i;
                }
            }

            swap(intArray , largest , lastUnsortedIndex);
        }
        return intArray;
    }

    public static void swap(int[] array , int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

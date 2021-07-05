package in.sradda.sorting_algorithms;

public class BubbleSort {
    public static void main(String[] args) {
         int[] inputArray = { 50,4,23,-8,56,9};
         BubbleSort bs = new BubbleSort();
         int[] outputArray = bs.sorting(inputArray);
         for(int i=0;i<outputArray.length;i++){
             System.out.println(outputArray[i]);
         }
    }

    public static int[] sorting(int[] intArray){
        for (int lastUnsortedIndex= intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            for( int i=0;i<lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i+1]){
                    swap(intArray,i,i+1);
                }
            }
        }
        return intArray;
    }
     public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
     }
}

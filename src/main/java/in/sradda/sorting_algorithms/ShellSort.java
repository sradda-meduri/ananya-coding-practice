package in.sradda.sorting_algorithms;

public class ShellSort {
    public static void main(String[] args) {
         int[] intArray = {5,12,8,60,-9,3};
         ShellSort ss = new ShellSort();

         int[] outputArray = ss.sorting(intArray);

         for(int i = 0 ; i < outputArray.length ; i++){
             System.out.println(outputArray[i]);
         }
    }
     public static int[] sorting(int[] intArray){
         for(int gap = intArray.length/2 ; gap > 0 ; gap /= 2){

             for(int i= gap ; i < intArray.length; i++){
                 int newElement = intArray[i];
                 int j = i;
                 while(j >= gap && intArray[j-gap] > newElement){

                     intArray[j] = intArray[j - gap];
                     j -= gap;
                 }

                 intArray[j] = newElement;
             }
         }
         return intArray;
     }
}

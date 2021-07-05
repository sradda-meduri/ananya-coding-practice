package in.sradda.sorting_algorithms;

public class InsertionSort {
    public static void main(String[] args) {

        int[] intArray = {50,6,-5,23,75,-9};
        InsertionSort is = new InsertionSort();
        int[] outputArray = is.sorting(intArray);

        for(int i =0;i< outputArray.length;i++){
            System.out.println(outputArray[i]);
        }
    }
    public static int[] sorting(int[] inputArray){
        for(int firstUnsortedIndex = 1 ; firstUnsortedIndex < inputArray.length ; firstUnsortedIndex++){
            int newElement = inputArray[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 && inputArray[i - 1] > newElement; i--){
                inputArray[i] = inputArray[i - 1];
            }

            inputArray[i] = newElement;
        }

        return inputArray;
    }
}

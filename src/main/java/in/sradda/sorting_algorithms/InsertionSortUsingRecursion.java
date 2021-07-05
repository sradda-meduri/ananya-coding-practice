package in.sradda.sorting_algorithms;

public class InsertionSortUsingRecursion {

    public static void main(String[] args) {

        int[] intArray = {50,6,-5,23,75,-9};

        insertionSort(intArray , intArray.length);

        for(int i =0;i< intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }

    public static void insertionSort(int[] input , int numItem){
        if(numItem < 2){
            return;
        }

        insertionSort(input, numItem-1);

        int newElement = input[numItem - 1];

        int i;

        for(i = numItem - 1; i > 0 && input[i - 1] > newElement; i--){
            input[i] = input[i - 1];
        }

        input[i] = newElement;

        System.out.println("Result of call when numItem = " + numItem);
        for (i = 0 ; i < input.length; i++){
            System.out.print(input[i]);
            System.out.print(" , ");
        }
        System.out.println("");
        System.out.println("-------------------------");
    }

}

package in.sradda.sorting_algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortDescendingOrderTest {
    @Test
    public  void testCorrectOperation(){
        MergeSortDescendingOrder ms = new MergeSortDescendingOrder();
        int[] arr = {50,4,23,-8,56,9};

        ms.mergeSort(arr,0,arr.length);
        Assertions.assertEquals(arr[0],56);
        Assertions.assertEquals(arr[1],50);
        Assertions.assertEquals(arr[2],23);
        Assertions.assertEquals(arr[3],9);
        Assertions.assertEquals(arr[4],4);
        Assertions.assertEquals(arr[5],-8);

    }
}
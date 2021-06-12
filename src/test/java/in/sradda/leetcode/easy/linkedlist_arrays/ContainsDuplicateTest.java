package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest{
    @Test
    public void validLeagalInput(){
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] arr= new int[]{1, 1, 2, 3};
        boolean result=cd.containsDuplicate(arr);
        Assertions.assertEquals(true,result);
    }

    @Test
    public void testcaseEmptyYears(){
        ContainsDuplicate cd = new ContainsDuplicate();
        int arr[] = {};
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> cd.containsDuplicate(arr));
        Assertions.assertEquals("Empty array not allowed", exception.getMessage());
    }

}
package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfUniqueTest {

    @Test
    public void testcaseLeagalInput(){
        SumOfUnique su = new SumOfUnique();
        int mat1[]= {1,2,3,2};
        int result = su.sumOfUnique(mat1);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testcaseIlleagalInput(){
        SumOfUnique su = new SumOfUnique();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> su.inp(0));
        Assertions.assertEquals("length of array cannot be 0", exception.getMessage());
    }

    @Test
    public void testcaseEmptyArray(){
        SumOfUnique su = new SumOfUnique();
        int mat1[] = {};
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> su.sumOfUnique(mat1));
        Assertions.assertEquals("Empty array cannot be evaluated", exception.getMessage());

    }

}
package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueOccurancesTest {

    @Test
    public void testcaseLeagalInput(){
        UniqueOccurances uo = new UniqueOccurances();
        int mat1[]= {1,3,2};
        boolean result = uo.uniqueOccurrences(mat1);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testcaseIlleagalInput(){
        UniqueOccurances uo = new UniqueOccurances();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> uo.inp(0));
        Assertions.assertEquals("length of array cannot be 0", exception.getMessage());
    }

    @Test
    public void testcaseEmptyArray(){
        UniqueOccurances uo = new UniqueOccurances();
        int mat1[] = {};
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> uo.uniqueOccurrences(mat1));
        Assertions.assertEquals("Empty array cannot be evaluated", exception.getMessage());

    }

}
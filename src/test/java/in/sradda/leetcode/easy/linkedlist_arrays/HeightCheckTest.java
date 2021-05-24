package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightCheckTest {
    @Test
    public void testcaseLeagalInput(){
        HeightCheck he = new HeightCheck();
        int mat1[]= {1,3,2};
        int result = he.heightChecker(mat1);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testcaseIlleagalInput(){
        HeightCheck he = new HeightCheck();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> he.inp(0));
        Assertions.assertEquals("length of array cannot be 0", exception.getMessage());
    }

    @Test
    public void testcaseEmptyArray(){
        HeightCheck he = new HeightCheck();
        int mat1[] = {};
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> he.heightChecker(mat1));
        Assertions.assertEquals("Empty array cannot be evaluated", exception.getMessage());

    }

}
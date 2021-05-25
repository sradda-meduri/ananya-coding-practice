package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    public void testcaseLeagalInput() {
        PlusOne po = new PlusOne();
        int mat1[] = {1, 2, 3, 4};
        int[] result = po.plusOne(mat1);
        Assertions.assertEquals(new int[]{1, 2, 3, 5}, result);
    }

    @Test
    public void testcaseIlleagalInput(){
        PlusOne po = new PlusOne();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> po.inp(0));
        Assertions.assertEquals("Enter value > 0", exception.getMessage());
    }

    @Test
    public void testcaseEmptyArray(){
        PlusOne po = new PlusOne();
        int[] mat1 = {};
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> po.plusOne(mat1));
        Assertions.assertEquals("Empty Matrix not allowed", exception.getMessage());

    }
}
package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NandItsDoubleTest {
    @Test
    public void testcaseLeagalInput() {
        NandItsDouble n = new NandItsDouble();
        int mat1[] = {1, 3, 6, 5};
        boolean result = n.checkIfExist(mat1);
        Assertions.assertEquals(true, result);
    }
    @Test
    public void testcaseIlleagalInput(){
        NandItsDouble n = new NandItsDouble();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> n.mat(0));
        Assertions.assertEquals("Enter value > 0", exception.getMessage());
    }

    @Test
    public void testcaseEmptyArray(){
        NandItsDouble n = new NandItsDouble();
        int[] mat1 = {};
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> n.checkIfExist(mat1));
        Assertions.assertEquals("Array cannot be empty", exception.getMessage());

    }

}
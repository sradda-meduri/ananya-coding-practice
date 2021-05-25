package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {

    @Test
    public void testcaseLeagalInput(){
        PowerOfTwo po = new PowerOfTwo();
        boolean result = po.isPowerOfTwo(32);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testcaseIlleagalInput(){
        PowerOfTwo po = new PowerOfTwo();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> po.isPowerOfTwo(-10));
        Assertions.assertEquals("Enter +ve value", exception.getMessage());
    }

}
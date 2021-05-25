package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {
    @Test
    public void testcaseLeagalInput(){
        PowerOfThree po = new PowerOfThree();
        boolean result = po.isPowerOfThree(27);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testcaseIlleagalInput(){
        PowerOfThree po = new PowerOfThree();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> po.isPowerOfThree(0));
        Assertions.assertEquals("Enter value > 0", exception.getMessage());
    }

}
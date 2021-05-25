package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfFourTest {
    @Test
    public void testcaseLeagalInput(){
        PowerOfFour po = new PowerOfFour();
        boolean result = po.isPowerOfFour(16);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testcaseIlleagalInput(){
        PowerOfFour po = new PowerOfFour();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> po.isPowerOfFour(0));
        Assertions.assertEquals("Enter value > 0", exception.getMessage());
    }

}
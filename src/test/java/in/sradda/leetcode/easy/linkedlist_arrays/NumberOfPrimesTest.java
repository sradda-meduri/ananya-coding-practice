package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfPrimesTest {
    @Test
    public void testcaseLeagalInput(){
        NumberOfPrimes np = new NumberOfPrimes();
        int result = np.countPrimes(10);
        Assertions.assertEquals(4, result);
    }
    @Test
    public void testcaseIlleagalInput(){
        NumberOfPrimes np = new NumberOfPrimes();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> np.countPrimes(-1));
        Assertions.assertEquals("Enter value > 0", exception.getMessage());
    }
}
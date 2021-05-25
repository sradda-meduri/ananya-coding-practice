package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootTest {

    @Test
    public void testcaseLeagalInput(){
        SquareRoot sr = new SquareRoot();
        int result = sr.mySqrt(16);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testcaseIlleagalInput(){
        SquareRoot sr = new SquareRoot();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> sr.mySqrt(0));
        Assertions.assertEquals("Enter value > 0", exception.getMessage());
    }

}
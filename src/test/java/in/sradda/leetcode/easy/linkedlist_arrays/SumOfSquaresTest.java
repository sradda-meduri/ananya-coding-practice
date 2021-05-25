package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfSquaresTest {

    @Test
    public void testcaseLeagalInput(){
        SumOfSquares ss = new SumOfSquares();
        boolean result = ss.judgeSquareSum(5);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testcaseIlleagalInput(){
        SumOfSquares ss = new SumOfSquares();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> ss.judgeSquareSum(-10));
        Assertions.assertEquals("Enter value > 0", exception.getMessage());
    }

}
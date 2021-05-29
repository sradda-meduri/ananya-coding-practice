package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberOfBallsTest {

    @Test
    public void testcaseMoreYears() {
        MaxNumberOfBalls mn = new MaxNumberOfBalls();
        int m = 1;
        int n = 10;
        int result = mn.countBalls(m, n);
        Assertions.assertEquals(2, result);

    }
    @Test
    public void testcaseIlleagalInput(){
        MaxNumberOfBalls mn = new MaxNumberOfBalls();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> mn.countBalls(0,0));
        Assertions.assertEquals("Enter value > 0", exception.getMessage());
    }
}
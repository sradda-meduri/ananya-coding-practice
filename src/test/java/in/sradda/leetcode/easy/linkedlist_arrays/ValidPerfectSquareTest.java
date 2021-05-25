package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPerfectSquareTest {

    @Test
    public void tectcaseLeagalInput(){
        ValidPerfectSquare vp = new ValidPerfectSquare();
        boolean result = vp.isPerfectSquare(36);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testcaseIlleagalInput(){
        ValidPerfectSquare vp = new ValidPerfectSquare();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> vp.isPerfectSquare(-2));
        Assertions.assertEquals("Enter value > 0", exception.getMessage());
    }

}
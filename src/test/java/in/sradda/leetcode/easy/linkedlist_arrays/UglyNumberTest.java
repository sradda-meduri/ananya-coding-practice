package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UglyNumberTest {
    @Test
    public void testcaseLeagalInput(){
        UglyNumber un = new UglyNumber();
        boolean result = un.isUgly(14);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testcaseIlleagalInput(){
        UglyNumber un = new UglyNumber();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> un.isUgly(-5));
        Assertions.assertEquals("enter value > 0", exception.getMessage());
    }

}
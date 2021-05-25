package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    public void testcaseLeagalInput(){
        HappyNumber ha = new HappyNumber();
        boolean result = ha.isHappy(19);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testcaseIlleagalInput(){
        HappyNumber ha = new HappyNumber();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> ha.isHappy(0));
        Assertions.assertEquals("Enter value > 0", exception.getMessage());
    }

}
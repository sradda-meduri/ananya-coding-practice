package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DIStringMatchTest {
    @Test
    public void testcaseMoreYears() {
        DIStringMatch sm = new DIStringMatch();
        String inp = "IDID";
        int[] result = sm.diStringMatch(inp);
        int[] res={0, 4, 1, 3, 2};
        Assertions.assertEquals(res, result);

    }
    @Test
    public void testcaseIlleagalInput(){
        DIStringMatch sm = new DIStringMatch();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> sm.diStringMatch(""));
        Assertions.assertEquals("null values are not accepted", exception.getMessage());
    }

}
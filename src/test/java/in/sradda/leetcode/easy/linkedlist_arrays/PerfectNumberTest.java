package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {
    @Test
    public void testcaseLeagalInput(){
        PerfectNumber pn = new PerfectNumber();
        boolean result = pn.checkPerfectNumber(28);
        Assertions.assertEquals(true, result);
    }

}
package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOddsTest {
    @Test
    public void testcaseLeagalInput(){
        CountOdds co = new CountOdds();
        int result = co.countOdds(3,7);
        Assertions.assertEquals(3, result);
    }

}
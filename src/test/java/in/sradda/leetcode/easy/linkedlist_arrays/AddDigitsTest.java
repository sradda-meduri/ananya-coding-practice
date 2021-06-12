package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDigitsTest {
    @Test
    public void testcaseLeagalInput(){
        AddDigits ad = new AddDigits();
        int result = ad.addDigits(38);
        Assertions.assertEquals(2, result);
    }

}
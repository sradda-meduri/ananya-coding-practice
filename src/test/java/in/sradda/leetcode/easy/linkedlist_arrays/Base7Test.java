package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base7Test {
    @Test
    public void testcaseLeagalInput(){
        Base7 b7 = new Base7();
        String result = b7.convertToBase7(100);
        Assertions.assertEquals("202", result);
    }

}
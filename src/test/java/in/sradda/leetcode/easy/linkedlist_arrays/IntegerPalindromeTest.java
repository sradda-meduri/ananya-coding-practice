package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerPalindromeTest {
    @Test
    public void testcaseLeagalInput(){
        IntegerPalindrome ip = new IntegerPalindrome();
        boolean result = ip.isIntegerPalindrome(-5);
        Assertions.assertEquals(false, result);
    }



}
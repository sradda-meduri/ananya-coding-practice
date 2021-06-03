package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    @Test
    public void testcaseLeagalInput(){
        ValidPalindrome vp = new ValidPalindrome();
        boolean result = vp.validPalindrome("sra");
        Assertions.assertEquals(false, result);
    }
    @Test
    public void testcaseIlleagalInput(){
        ValidPalindrome vp = new ValidPalindrome();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> vp.validPalindrome(""));
        Assertions.assertEquals("Enter valid string", exception.getMessage());
    }

}
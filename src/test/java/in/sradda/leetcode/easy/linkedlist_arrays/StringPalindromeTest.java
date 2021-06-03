package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPalindromeTest {
    @Test
    public void testcaseLeagalInput(){
        StringPalindrome sp = new StringPalindrome();
        boolean result = sp.isPalindrome("sra");
        Assertions.assertEquals(false, result);
    }
    @Test
    public void testcaseIlleagalInput(){
        StringPalindrome sp = new StringPalindrome();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> sp.isPalindrome(""));
        Assertions.assertEquals("Enter valid string", exception.getMessage());
    }

}
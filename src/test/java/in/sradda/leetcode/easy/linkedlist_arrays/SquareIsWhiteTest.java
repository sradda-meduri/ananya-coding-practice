package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SquareIsWhiteTest {

    @Test
    public void testcaseLegalInput(){
        SquareIsWhite s = new SquareIsWhite();
        String ans = "a1";
        Boolean res = s.squareIsWhite(ans);
        Assertions.assertEquals(false , res);

    }

    @Test
    public void testcaseIllegalInput(){
        SquareIsWhite s = new SquareIsWhite();
        String ans = "";
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> s.squareIsWhite(ans));
        Assertions.assertEquals("Empty string cannot be taken as Input", exception.getMessage());


    }

    @Test
    public void testcaseIllegalInput1(){
        SquareIsWhite s = new SquareIsWhite();
        String ans = null;
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> s.squareIsWhite(ans));
        Assertions.assertEquals("null values are not accepted", exception.getMessage());


    }




}
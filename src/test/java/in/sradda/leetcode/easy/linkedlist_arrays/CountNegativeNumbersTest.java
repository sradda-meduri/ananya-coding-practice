package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountNegativeNumbersTest {

    @Test
    public void LeagalInput(){
        CountNegativeNumbers cou = new CountNegativeNumbers();
        int mat1[][] = {{1993,-1999},{-1,2}};
        int result = cou.countNegatives(mat1);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testcaseEmptyYears(){
        CountNegativeNumbers cou = new CountNegativeNumbers();
        int years[][] = {{}};
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> cou.countNegatives(years));
        Assertions.assertEquals("Empty Matrices not allowed", exception.getMessage());
    }

    @Test
    public void testcaseIllegalInput(){
        CountNegativeNumbers cou = new CountNegativeNumbers();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> cou.inputmat(0,0));
        Assertions.assertEquals("Null value not allowed", exception.getMessage());

    }

}
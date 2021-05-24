package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumZeroTest {

    @Test
    public void testcaseLeagalInput(){
        SumZero s= new SumZero();
        int n=5;
        int[] result = s.sumZero(n);
        Assertions.assertEquals(new int[]{1, 2, 0, -2, -1}, result);
    }

    @Test
    public void testcaseIlleagalInput(){
        SumZero s= new SumZero();
        int n=0;
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> s.sumZero(0));
        Assertions.assertEquals("num cannot be equal to 0", exception.getMessage());

    }

    @Test
    public void testcaseIlleagalInput2(){
        SumZero s= new SumZero();
        int n=-2;
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> s.sumZero(-2));
        Assertions.assertEquals("enter value greater than 0", exception.getMessage());

    }


}
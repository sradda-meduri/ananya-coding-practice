package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateTest {
    @Test
    public void testCorrectOperation(){
        RemoveDuplicate rd = new RemoveDuplicate();
        int[] nu = new int[]{1,1,2,3,4};
        int result = rd.removeDuplicates(nu);
        Assertions.assertEquals(4,result);
    }

}
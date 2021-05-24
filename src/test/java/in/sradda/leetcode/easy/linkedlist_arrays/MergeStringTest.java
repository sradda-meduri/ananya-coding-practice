package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringTest {

    @Test
    public void LeagalInput(){
        MergeString me = new MergeString();
        String w1 = "sradda";
        String w2 = "meduri";
        String result = me.mergeAlternately(w1,w2);
        Assertions.assertEquals("smreaddudrai", result);
    }

    @Test
    public void IlleagalInput(){
        MergeString me = new MergeString();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> me.mergeAlternately("",""));
        Assertions.assertEquals("empty values are not allowed", exception.getMessage());
    }



}
package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueUsingStacksTest {
    @Test
    public void testCorrectOperation(){
        QueueUsingStacks stack = new QueueUsingStacks();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(stack.empty(),false);
        Assertions.assertEquals(stack.peek(),1);
        Assertions.assertEquals(stack.pop(),1);
        Assertions.assertEquals(stack.peek(),2);
        Assertions.assertEquals(stack.pop(),2);
        Assertions.assertEquals(stack.peek(),3);
        Assertions.assertEquals(stack.pop(),3);
        Assertions.assertEquals(stack.empty(),true);
    }
}
package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotReturnTest {

    @Test
    public void testcaseMoreYears() {
        RobotReturn rr = new RobotReturn();
        String inp = "LR";
        boolean result = rr.judgeCircle(inp);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testcaseIlleagalInput(){
        RobotReturn rr = new RobotReturn();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> rr.judgeCircle(""));
        Assertions.assertEquals("null input is not accepted", exception.getMessage());
    }
}

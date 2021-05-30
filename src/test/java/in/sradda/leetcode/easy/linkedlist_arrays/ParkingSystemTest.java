package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingSystemTest {

    @Test
    public void testBigOneMediumOneSmallZero(){
        ParkingSystem ps = new ParkingSystem(1,1,0);
        Assertions.assertEquals(ps.addCar(1),true);
        Assertions.assertEquals(ps.addCar(2),true);
        Assertions.assertEquals(ps.addCar(3),false);
        Assertions.assertEquals(ps.addCar(1),false);
    }


}
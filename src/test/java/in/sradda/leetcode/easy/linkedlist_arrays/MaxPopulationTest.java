package in.sradda.leetcode.easy.linkedlist_arrays;
import in.sradda.leetcode.easy.linkedlist_arrays.MaxPopulation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MaxPopulationTest {

    @Test
    public void testcaseIllegalInput(){
        MaxPopulation max = new MaxPopulation();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> max.inputmat(0,0));
        Assertions.assertEquals("Null value not allowed", exception.getMessage());

    }

    @Test
    public void testcaseMoreYears(){
        MaxPopulation max = new MaxPopulation();
        int mat1[][] = {{1993,1999},{2001,2010}};
        int result = max.maximumPopulation(mat1);
        Assertions.assertEquals(1993, result);

    }

    @Test
    public void testcaseEmptyYears(){
        MaxPopulation max = new MaxPopulation();
        int years[][] = {{}};
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> max.maximumPopulation(years));
        Assertions.assertEquals("Empty Matrices not allowed", exception.getMessage());

    }




}
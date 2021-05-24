package in.sradda.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixDiagonalSumTest {
    @Test
    public void testCaseLegalInput() {
        MatrixDiagonalSum mat = new MatrixDiagonalSum();
        int mat1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int result = mat.diagonalSum(mat1);
        Assertions.assertEquals(25, result);

    }

    @Test
    public void testCasePassingEmptyMatrixAsInput() {
        // set up user
        MatrixDiagonalSum mat = new MatrixDiagonalSum();
        int mat1[][] = {{}};
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> mat.diagonalSum(mat1));
        Assertions.assertEquals("Empty Matrix not allowed", exception.getMessage());
    }


}
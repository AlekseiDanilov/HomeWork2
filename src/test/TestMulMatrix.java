package test;

import functions.MulMatrix;
import org.junit.Assert;
import org.junit.Test;

public class TestMulMatrix {

    @Test
    public void testMulMatrixNull() {
        Assert.assertArrayEquals(new MulMatrix().mulMatrix(null, null), new int[][]{});
        Assert.assertArrayEquals(new MulMatrix().mulMatrix(new int[][]{{1, 2}, {1, 5}}, null), new int[][]{});
        Assert.assertArrayEquals(new MulMatrix().mulMatrix(null, new int[][]{{1, 2}, {1, 5}}), new int[][]{});
    }

    @Test
    public void testMulMatrixEmptyLine() {
        Assert.assertArrayEquals(new MulMatrix().mulMatrix(new int[][]{{}, {1, 5}}, new int[][]{{1, 2}, {1, 5}}), new int[][]{});
    }

    @Test
    public void testMulMatrixIsNotMatrix() {
        Assert.assertArrayEquals(new MulMatrix().mulMatrix(new int[][]{{2, 5}, {1, 5, 7}, {3, 5}}, new int[][]{{1, 2}, {1, 5}}), new int[][]{});
    }

    @Test
    public void testMulMatrixLineFirstMatrixNotEqualsColumnSecondMatrix() {
        Assert.assertArrayEquals(new MulMatrix().mulMatrix(new int[][]{{2, 5, 2}, {1, 5, 7}}, new int[][]{{1, 2}, {1, 5}}), new int[][]{});
    }

    @Test
    public void testMulMatrixAllGood() {
        Assert.assertArrayEquals(new MulMatrix().mulMatrix(new int[][]{{2, 5}, {1, 5}}, new int[][]{{1, 2}, {1, 5}}), new int[][]{{7, 29}, {6, 27}});
    }
}
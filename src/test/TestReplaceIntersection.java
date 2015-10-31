package test;

import functions.ReplaceIntersection;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestReplaceIntersection {
    @Test
    public void testReplaceIntersection() {
        Assert.assertArrayEquals(new ReplaceIntersection().replaceIntersection(new double[]{10.1, 1.0}, new double[]{10.1, 2.0}), new double[]{10.1}, 0);
    }

    @Test
    public void testReplaceIntersectionEmptySet() {
        Assert.assertArrayEquals(new ReplaceIntersection().replaceIntersection(new double[]{10.2, 1.0}, new double[]{10.1, 2.0}, new double[]{10.3, 15.0}), new double[]{}, 0);
    }

    @Test
    public void testReplaceIntersectionArraysNull() {
        Assert.assertArrayEquals(new ReplaceIntersection().replaceIntersection(null), new double[]{}, 0);
    }

    @Test
    public void testReplaceIntersectionArrayEmpty() {
        Assert.assertArrayEquals(new ReplaceIntersection().replaceIntersection(new double[]{}, new double[]{10.1, 2.0}), new double[]{}, 0);
    }

}
package test;

import functions.CheckSame;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCheckSame {

    @Test
    public void testCheckSameIsSame() {
        Assert.assertTrue(new CheckSame().checkSame(new String[]{"AA", "b", "AA", "c"}));
    }

    @Test
    public void testCheckSameNotSame() {
        Assert.assertFalse(new CheckSame().checkSame(new String[]{"AA", "b", "c"}));
    }

    @Test
    public void testCheckSameArrayStringsIsNull() {
        Assert.assertFalse(new CheckSame().checkSame(null));
    }

    @Test
    public void testCheckSameStringIsNullNotSame() {
        Assert.assertFalse(new CheckSame().checkSame(new String[]{"AA", null, "c"}));
    }

    @Test
    public void testCheckSameStringIsNullIsSame() {
        Assert.assertTrue(new CheckSame().checkSame(new String[]{null, "c", "c"}));
    }
}
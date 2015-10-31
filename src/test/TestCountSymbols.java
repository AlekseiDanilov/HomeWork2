package test;

import src.functions.CountSymbols;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCountSymbols {
    @Test
    public void testCountSymbolsIsSameSymbols() {
        Assert.assertEquals(new CountSymbols().countSymbols("Mama", 'a'), 2);
    }

    @Test
    public void testCountSymbolsNotSameSymbols() {
        Assert.assertEquals(new CountSymbols().countSymbols("Mama", 'r'), 0);
    }

    @Test
    public void testCountSymbolsEmpty() {
        Assert.assertEquals(new CountSymbols().countSymbols("", 'r'), 0);
    }

    @Test
    public void testCountSymbolsNull() {
        Assert.assertEquals(new CountSymbols().countSymbols(null, 'r'), 0);
    }
}
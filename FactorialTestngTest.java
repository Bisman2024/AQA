package org.testng.NewTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTestngTest {

    @Test
    public void testFactorialZero() {
        Assert.assertEquals(FactorialTestng.calculateFactorial(0), 1, "Факториал 0 должен быть равен 1");
    }

    @Test
    public void testFactorialFive() {
        Assert.assertEquals(FactorialTestng.calculateFactorial(5), 120, "Факториал 5 должен быть равен 120");
    }
}
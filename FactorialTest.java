package org.junit.jupiter.NewTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    void calculateFactorialOfZero_ShouldReturnOne() {
        assertEquals(1, Factorial.calculateFactorial(0), "Факториал 0 должен быть равен 1");
    }

    @Test
    void calculateFactorialOfNine_ShouldReturnCorrectResult() {
        assertEquals(362880, Factorial.calculateFactorial(9), "Факториал 9 должен быть равен 362880");
    }

}

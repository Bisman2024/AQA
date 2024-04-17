package org.testng.NewTest;

public class FactorialTestng {
    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

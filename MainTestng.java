package org.testng.NewTest;

public class MainTestng {
    public static void main(String[] args) {
        int number = 12;
        long factorial = FactorialTestng.calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен " + factorial);
    }
}
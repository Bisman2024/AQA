import org.junit.jupiter.NewTest.Factorial;

public class Main {
    public static void main(String[] args) {
        int number = 9;
        long factorial = Factorial.calculateFactorial(number);
        System.out.println("Факториал числа " + number + " = " + factorial);
    }
}
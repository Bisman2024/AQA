class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}
class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super (message);
    }
}
public class MainException {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            int sum = processArray(correctArray);
            System.out.println("Сумма чисел массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int processArray (String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4х4");
        }
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch(NumberFormatException e) {
                    throw new MyArrayDataException("Неправильные данные в ячейке: [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}

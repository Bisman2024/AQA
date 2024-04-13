class ProcessArray {
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
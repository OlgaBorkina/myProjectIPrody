package calculator;

import calculator.exceptions.ArrayDataException;
import calculator.exceptions.ArraySizeException;

public class ArrayValueCalculator {

    public static int doCalculator(String[][] array) throws ArraySizeException , ArrayDataException {
        if (array.length != 4) {
            throw new ArraySizeException("The array must contain 4 rows.");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new ArraySizeException("Error: string " + i + " must contain 4 elements");
            }
        }

        int sum = 0;
        int temp = 0;
        for ( int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    temp = Integer.parseInt(array[i][j]);
                    sum += temp;
                } catch (NumberFormatException e) {
                    throw new ArraySizeException("Invalid data in cell  [" + i + "][" + j + "]: '" + array[i][j] + "'");
                }
            }
        }

        return sum;
    }
}

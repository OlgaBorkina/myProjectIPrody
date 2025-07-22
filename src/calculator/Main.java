package calculator;

import calculator.exceptions.ArrayDataException;
import calculator.exceptions.ArraySizeException;

public class Main {

    public static void main(String[] args) throws ArraySizeException {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "x", "16"}
        };

        int result = ArrayValueCalculator.doCalculator(array);

        try {
            result = ArrayValueCalculator.doCalculator(array);
            System.out.println("Sum of all array values: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.err.println("Calculation error: " + e.getMessage());

        }


    }
}

package game;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        String[] arrString = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        final int sizeSymbol = 15;
        Random random = new Random();
        System.out.println("I thought of a word");
        int indexWord = random.nextInt(arrString.length);
        String compWord  = arrString[indexWord];
     //   System.out.println(compWord);

        boolean prize = false;
        while(!prize) {
            Scanner scanner = new Scanner(System.in) ;
                System.out.println("Please enter  your word: ");
               String useWord = scanner.next();
                System.out.println("Checking the word");
                int size = compWord.length();
                if (compWord.equals(useWord)) {
                    prize = true;
                    System.out.println("Congratulations, you guessed the word.");
                    scanner.close();
                } else {
                    if (compWord.length() > useWord.length()) {
                        size = useWord.length();
                    }
                    for (int i = 0; i < size; i++) {
                        if (compWord.charAt(i) == useWord.charAt(i)) {
                            System.out.print(compWord.charAt(i));
                        } else {
                            System.out.print("#");
                        }
                    }
                    String start = "#".repeat(sizeSymbol - compWord.length());
                    System.out.print(start);
                    System.out.println();
                }

        }
    }
}

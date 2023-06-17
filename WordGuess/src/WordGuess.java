import java.util.Random;
import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "mango", "strawberry"};
        Random random = new Random();
        String wordToGuess = words[random.nextInt(words.length)];
        MagicWord magicWord = new MagicWord(wordToGuess);

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (!magicWord.isComplete()) {
            attempts++;
            System.out.print("Enter one character or your guess word: ");
            String input = scanner.nextLine();

            if (input.length() == 1) {
                char character = input.charAt(0);
                int correctCount = magicWord.guess(character);
                System.out.println("Attempt " + attempts + ": " + magicWord.getResult());
            } else if (input.equals(wordToGuess)) {
                magicWord.setComplete(true);
                System.out.println("Attempt " + attempts + ": Congratulation!");
            } else {
                System.out.println("Attempt " + attempts + ": Incorrect guess!");
            }
        }

        System.out.println("You got it in " + attempts + " attempts");
    }
}

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int result, guess;
        final int max = 100;
        int attempts = 5; 

        Scanner S = new Scanner(System.in);
        Random R = new Random();

        result = R.nextInt(max) + 1;

        System.out.println("GUESS THE NUMBER BETWEEN 1 TO 100 : ");

        while (attempts > 0) {
            guess = S.nextInt();

            if (guess == result) {
                System.out.println("CONGRATULATIONS! THE NUMBER WAS " + result);
                break; // Exit the loop if guess is correct
            } else if (guess < result) {
                System.out.println("Too low. Try again. Attempts remaining: " + (attempts - 1));
            } else if (guess > result) {
                System.out.println("Too high. Try again. Attempts remaining: " + (attempts - 1));
            }

            attempts--; // Decrement attempts after each guess
        }

        if (attempts == 0) {
            System.out.println("You ran out of attempts. The number was: " + result);
        }

        S.close(); // Close the Scanner resource
    }
}

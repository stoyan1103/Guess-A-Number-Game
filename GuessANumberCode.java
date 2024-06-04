import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();

        System.out.print("Do you want to play a Guess Number game? ");
        String command = scanner.nextLine();

        int level = 1;
        int maxRange = 101;

        boolean isPlayerWon = false;
        boolean isPlayerLost = false;

        while (command.equalsIgnoreCase("yes")) {

            int tries = 0;

            int computerNumber = randomNumber.nextInt(1, maxRange);

            System.out.printf("\n\nLevel: %d\n", level);

            System.out.printf("Guess a number (1-%d): ", maxRange - 1);
            String playerInput = scanner.nextLine();

            boolean isValid = true;

            for (int symbol = 0; symbol < playerInput.length(); symbol++) {

                if (playerInput.charAt(symbol) < 48 || playerInput.charAt(symbol) > 57) {

                    isValid = false;
                    break;
                }
            }


            while (true) {

                if (isValid) {

                    int playerNumber = Integer.parseInt(playerInput);

                    tries++;

                    if (tries >= 10) {
                        System.out.println("Game Over!");
                        isPlayerLost = true;
                        break;
                    }

                    if (playerNumber == computerNumber) {
                        System.out.println("Congratulations! You guessed it of try number: " + tries);
                        isPlayerWon = true;
                        break;
                    }
                    else if (playerNumber > computerNumber) {
                        System.out.println("Too High!");
                    }
                    else {
                        System.out.println("Too Low!");
                    }
                }
                else {
                    System.out.println("Invalid input!");
                    break;
                }

                System.out.printf("Guess a number (1-%d): ", maxRange - 1);
                playerInput = scanner.nextLine();
            }

            if (isPlayerWon) {
                level++;
                maxRange += 100;
                command = "yes";
                isPlayerWon = false;
                continue;
            }

            if (isPlayerLost) {
                isPlayerLost = false;
                System.out.print("Dou you want to play again? ");
                command = scanner.nextLine();
            }

        }

    }
}
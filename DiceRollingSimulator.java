import java.util.Random;
import java.util.Scanner;

public class DiceRollingSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number of dice: ");
            int numDice = scanner.nextInt();
            System.out.print("Enter the number of sides on each die: ");
            int numSides = scanner.nextInt();
            int total = 0;
            for (int i = 0; i < numDice; i++) {
                int roll = random.nextInt(numSides) + 1;
                System.out.println("Die " + (i + 1) + ": " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
            System.out.print("Do you want to roll again? (y/n): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
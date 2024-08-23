import java.util.Random;
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        String[] responses = {"Hello!", "Hi!", "Hey!"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            } else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Chatty: " + responses[random.nextInt(responses.length)]);
            } else {
                System.out.println("Chatty: I didn't understand that.");
            }
        }
    }
}
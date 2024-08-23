import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a calculation (e.g. 2+2): ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\+");
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[1]);
        int result = num1 + num2;
        System.out.println("Result: " + result);
    }
}
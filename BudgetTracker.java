import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BudgetTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> expenses = new HashMap<>();
        double income = 0;
        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add expense");
            System.out.println("2. View budget");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter expense category: ");
                String category = scanner.next();
                System.out.print("Enter expense amount: ");
                double amount = scanner.nextDouble();
                expenses.put(category, amount);
            } else if (choice == 2) {
                double totalExpenses = 0;
                for (double amount : expenses.values()) {
                    totalExpenses += amount;
                }
                double balance = income - totalExpenses;
                System.out.println("Budget:");
                for (Map.Entry<String, Double> entry : expenses.entrySet()) {
                    System.out.println(entry.getKey() + ": $" + entry.getValue());
                }
                System.out.println("Total expenses: $" + totalExpenses);
                System.out.println("Balance: $" + balance);
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
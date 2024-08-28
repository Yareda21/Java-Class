import java.util.Scanner;

public class BudgetTracker {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int days = obj.nextInt();
        double[] expenses = new double[days];
        for (int i = 0; i < days; i++) {

            System.out.println("Enter expenses for day" + (i + 1));
            expenses[i] = obj.nextDouble();
        }
        double totalexpenses = 0;
        for (double expense : expenses) {
            totalexpenses += expense;
        }
        System.out.println("The total expenses of each days is" + totalexpenses);
        double averageexpense = totalexpenses / days;
        System.out.println("the average expense is" + averageexpense);
        double maxexpense = expenses[0];
        int maxday = 1;
        for (int i = 0; i < days; i++) {
            if (expenses[i] > maxexpense) {
                maxexpense = expenses[i];
                maxday = i + 1;
            }
        }
        System.out.println("the day with maximum expense is" + maxday + ":" + maxexpense);
        System.out.println("Days with above average");
        for (int i = 0; i < days; i++) {
            if (expenses[i] > averageexpense) {
                System.out.println("Day" + (i + 1) + ":" + expenses[i]);

            }
        }

    }
}

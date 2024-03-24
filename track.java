import java.util.ArrayList;
import java.util.Scanner;

public class track {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<wallet> expenses = storage.loadExpenses();

        while (true) {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = scanner.next();
                    scanner.nextLine();  // Consume newline left over
                    System.out.print("Enter description: ");
                    String desc = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    expenses.add(new wallet(date, desc, amount));
                    storage.saveExpenses(expenses);
                    break;
                case 2:
                    for (wallet e : expenses) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please select from the menu.");
            }
        }
    }
}
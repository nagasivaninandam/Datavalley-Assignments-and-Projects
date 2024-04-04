import java.util.Scanner;

public class Main {

    public static double calculateExpenses(int quantity, double pricePerItem) {
        double totalExpenses = quantity * pricePerItem;
        double discount;

        if (quantity > 50) {
            discount = 0.1 * totalExpenses;
        } else if (quantity >= 25) {
            discount = 0.05 * totalExpenses;
        } else {
            discount = 0;
        }

        double finalExpenses = totalExpenses - discount;
        return finalExpenses;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the quantity purchased: ");
            int quantity = scanner.nextInt();

            System.out.print("Enter the price per item: ");
            double pricePerItem = scanner.nextDouble();

            if (quantity < 0 || pricePerItem < 0) {
                System.out.println("Invalid input. Quantity and price per item must be non-negative.");
                return;
            }

            double totalExpenses = calculateExpenses(quantity, pricePerItem);
            System.out.println("Total expenses: $" + totalExpenses);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
        }
    }
}

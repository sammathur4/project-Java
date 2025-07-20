import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Shopping Mart!\n");

        // Item 1
        System.out.print("Enter item 1 name: ");
        String item1 = scanner.nextLine();

        System.out.print("Enter item 1 price: ₹");
        double price1 = scanner.nextDouble();

        System.out.print("Enter quantity of " + item1 + ": ");
        int quantity1 = scanner.nextInt();

        scanner.nextLine(); // consume newline

        // Item 2
        System.out.print("\nEnter item 2 name: ");
        String item2 = scanner.nextLine();

        System.out.print("Enter item 2 price: ₹");
        double price2 = scanner.nextDouble();

        System.out.print("Enter quantity of " + item2 + ": ");
        int quantity2 = scanner.nextInt();

        // Calculations
        double subtotal1 = price1 * quantity1;
        double subtotal2 = price2 * quantity2;
        double total = subtotal1 + subtotal2;
        double discount = 0;

        System.out.println("\nCalculating your total...");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Item", "Price", "Quantity", "Subtotal");
        System.out.printf("%-15s ₹%-9.2f %-10d ₹%.2f\n", item1, price1, quantity1, subtotal1);
        System.out.printf("%-15s ₹%-9.2f %-10d ₹%.2f\n", item2, price2, quantity2, subtotal2);
        System.out.println("-------------------------------------------------");
        System.out.printf("Total before discount: ₹%.2f\n", total);

        // Apply discount if over ₹500
        if(total > 500) {
            discount = total * 0.1; // 10% discount
            System.out.printf("Discount (10%%): ₹-%.2f\n", discount);
        } else {
            System.out.println("No discount applicable.");
        }

        double finalTotal = total - discount;
        System.out.printf("Total to Pay: ₹%.2f\n", finalTotal);

        System.out.println("\nThank you for shopping with us!");
        scanner.close();
    }
}

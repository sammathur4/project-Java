import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal, rate, and time
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        double years = scanner.nextDouble();

        // Simple Interest Calculation
        double simpleInterest = (principal * rate * years) / 100;
        double totalSimple = principal + simpleInterest;

        System.out.println("\n--- Simple Interest ---");
        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Total Amount = " + totalSimple);

        // Compound Interest Calculation
        System.out.print("\n--- Compound Interest ---\n");
        System.out.print("Enter compounding frequency per year (e.g. 4 for quarterly): ");
        int n = scanner.nextInt();

        double amount = principal * Math.pow((1 + rate / (100 * n)), n * years);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest = " + compoundInterest);
        System.out.println("Total Amount = " + amount);

        scanner.close();
    }
}

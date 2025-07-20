import java.util.Scanner;

public class UserCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform all basic arithmetic operations
        double sum = num1 + num2;           // Addition
        double difference = num1 - num2;    // Subtraction
        double product = num1 * num2;       // Multiplication
        double quotient = num1 / num2;      // Division
        double remainder = num1 % num2;     // Modulo (Remainder)

        // Output explanations and results
        System.out.println("\nHere are the different arithmetic operations: ");

        System.out.println("Addition (+): " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction (-): " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Multiplication (*): " + num1 + " * " + num2 + " = " + product);
        System.out.println("Division (/): " + num1 + " / " + num2 + " = " + quotient);
        System.out.println("Modulo (%): " + num1 + " % " + num2 + " = " + remainder);

        // More math using the Math class
        System.out.println("\nOther useful math functions (using Math class):");
        System.out.println("Power: Math.pow(" + num1 + ", " + num2 + ") = " + Math.pow(num1, num2));
        System.out.println("Square root of first number: Math.sqrt(" + num1 + ") = " + Math.sqrt(num1));
        System.out.println("Absolute value of first number: Math.abs(" + num1 + ") = " + Math.abs(num1));
        System.out.println("Maximum: Math.max(" + num1 + ", " + num2 + ") = " + Math.max(num1, num2));
        System.out.println("Minimum: Math.min(" + num1 + ", " + num2 + ") = " + Math.min(num1, num2));

        scanner.close();
    }
}

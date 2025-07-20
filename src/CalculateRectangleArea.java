import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        
        double area = length * width;
        
        System.out.println("The area of the rectangle is: " + area);
        
        scanner.close();
    }
}

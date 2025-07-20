import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String user_name = scanner.nextLine();
        
        System.out.println("Enter your age: ");
        int user_age = scanner.nextInt();

        
        System.out.println("Enter your cgpa: ");
        Float user_cgpa = scanner.nextFloat();

        System.out.println("Your name is " + user_name);
        System.out.println("Your age is " + user_age);
        System.out.println("Your cgpa is " + user_cgpa);


        scanner.close();


        
    }
    
}

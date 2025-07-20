import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String user_name = scanner.nextLine();
        System.out.println("Your name is " + user_name);
        scanner.close();


        
    }
    
}

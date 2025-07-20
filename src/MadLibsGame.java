import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for different types of words
        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb ending in -ing: ");
        String verbIng = scanner.nextLine();

        System.out.print("Enter a place: ");
        String place = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective2 = scanner.nextLine();

        // Create the Mad Lib story
        String story = "Today, I went to the " + place + ". "
                + "It was a very " + adjective + " day! "
                + "I saw a " + adjective2 + " " + noun + " "
                + verbIng + " in the park. It made me laugh!";

        // Display the completed story
        System.out.println("\nHere's your Mad Lib story:");
        System.out.println(story);

        scanner.close();
    }
}

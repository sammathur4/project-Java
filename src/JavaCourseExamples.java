import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class JavaCourseExamples {

    // 1. Introduction to Java
    public static void introductionToJava() {
        System.out.println("Welcome to Java!");
    }

    // 2. Variables
    public static void variables() {
        int age = 25;
        String name = "Alice";
        boolean student = true;
        double gpa = 3.8;
        System.out.println("Name: " + name + ", Age: " + age + ", GPA: " + gpa + ", Student: " + student);
    }

    // 3. User Input
    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your city: ");
        String city = scanner.nextLine();
        System.out.println("You entered: " + city);
        scanner.close();
    }

    // 4. Mad Libs Game
    public static void madLibsGame() {
        Scanner s = new Scanner(System.in);
        System.out.print("Adjective: "); String adj = s.nextLine();
        System.out.print("Noun: "); String noun = s.nextLine();
        System.out.print("Verb: "); String verb = s.nextLine();
        System.out.println("Today I saw a " + adj + " " + noun + " " + verb + " on the street.");
        s.close();
    }

    // 5. Arithmetic
    public static void arithmetic() {
        int a = 10, b = 3;
        System.out.println("Add: " + (a + b));
        System.out.println("Sub: " + (a - b));
        System.out.println("Mul: " + (a * b));
        System.out.println("Div: " + (a / b));
    }

    // 6. Shopping Cart
    public static void shoppingCartProgram() {
        double item1 = 2.99, item2 = 5.50;
        double total = item1 + item2;
        System.out.printf("Total: $%.2f\n", total);
    }

    // 7. If Statement
    public static void ifStatements() {
        int age = 20;
        if (age >= 18) System.out.println("Adult");
        else System.out.println("Minor");
    }

    // 8. Random Numbers
    public static void randomNumbers() {
        Random r = new Random();
        int num = r.nextInt(10) + 1;
        System.out.println("Random number: " + num);
    }

    // 9. Math class
    public static void mathClass() {
        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("Abs of -10: " + Math.abs(-10));
    }

    // 10. Printf
    public static void printFormatting() {
        double price = 19.99;
        System.out.printf("Price: $%.2f\n", price);
    }

    // 11. Compound Interest Calculator
    public static void compoundInterestCalculator() {
        double principal = 1000;
        double rate = 0.05;
        int years = 5;
        double amount = principal * Math.pow(1 + rate, years);
        System.out.printf("Amount after %d years: $%.2f\n", years, amount);
    }

    // 12. Nested If
    public static void nestedIfStatements() {
        int score = 85;
        if (score >= 60) {
            if (score >= 90) System.out.println("A grade");
            else System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    // 13. String Methods
    public static void stringMethods() {
        String s = "Java";
        System.out.println(s.toUpperCase());
        System.out.println(s.length());
        System.out.println(s.contains("v"));
    }

    // 14. Substrings
    public static void substrings() {
        String email = "hello@example.com";
        String domain = email.substring(email.indexOf("@") + 1);
        System.out.println("Domain: " + domain);
    }

    // 15. Weight Converter
    public static void weightConverter() {
        double kg = 70;
        double pounds = kg * 2.205;
        System.out.println("Pounds: " + pounds);
    }

    // 16. Ternary
    public static void ternaryOperator() {
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);
    }

    // 17. Temperature Converter
    public static void temperatureConverter() {
        double c = 30;
        double f = (c * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + f);
    }

    // 18. Enhanced Switch
    public static void enhancedSwitchDemo() {
    String day = "Monday";
    switch (day) {
        case "Monday":
            System.out.println("Work day");
            break;
        case "Sunday":
            System.out.println("Weekend");
            break;
        default:
            System.out.println("Midweek");
            break;
            }
        }


    // 19. Calculator
    public static void calculatorProgram() {
        int a = 7, b = 3;
        char op = '+';
        switch (op) {
            case '+': System.out.println("Sum: " + (a + b));
            case '-': System.out.println("Difference: " + (a - b));
        }
    }

    // 20. Logical Operators
    public static void logicalOperators() {
        int age = 25;
        boolean income = true;
        if (age >= 18 && income) {
            System.out.println("Eligible");
        }
    }

    // 21. While Loops
    public static void whileLoops() {
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }
    }

    // 22. Number Guessing
    public static void numberGuessingGame() {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int number = r.nextInt(5) + 1;
        System.out.print("Guess (1-5): ");
        int guess = s.nextInt();
        if (guess == number) System.out.println("Correct!");
        else System.out.println("Wrong! It was " + number);
        s.close();
    }

    // 23. For Loops
    public static void forLoops() {
        for (int i = 1; i <= 5; i++) System.out.println(i);
    }

    // 24. Break & Continue
    public static void breakAndContinue() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            if (i == 5) break;
            System.out.println(i);
        }
    }

    // 25. Nested Loops
    public static void nestedLoops() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }

    // 26. Methods
    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    // 27. Overloaded Methods
    public static int add(int a, int b) { return a + b; }
    public static double add(double a, double b) { return a + b; }

    // 28. Variable Scope
    public static void variableScopeDemo() {
        int x = 10;
        if (true) {
            int y = 5;
            System.out.println(x + y);
        }
    }

    // 29. Banking Program
    public static void bankingProgram() {
        double balance = 1000;
        double withdraw = 250;
        balance -= withdraw;
        System.out.println("Remaining Balance: " + balance);
    }

    // 30. Dice Roller
    public static void diceRollerProgram() {
        Random r = new Random();
        System.out.println("Rolled: " + (r.nextInt(6) + 1));
    }

    // 31. Arrays
    public static void arraysDemo() {
        int[] arr = { 1, 2, 3 };
        for (int n : arr) System.out.println(n);
    }

    // 32. User Input Array
    public static void inputArray() {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + i + ": ");
            arr[i] = s.nextInt();
        }
        s.close();
    }

    // 33. Search Array
    public static void searchArray() {
        int[] arr = { 10, 20, 30 };
        int target = 20;
        for (int i : arr)
            if (i == target)
                System.out.println("Found: " + i);
    }

    // 34. Varargs
    public static int sumVarArgs(int... nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    // 35. 2D Arrays
    public static void twoDimensionalArray() {
        int[][] grid = { {1,2}, {3,4} };
        for (int[] row : grid)
            for (int val : row)
                System.out.println(val);
    }

    // 36. Quiz Game (Short)
    public static void quizGame() {
        Scanner s = new Scanner(System.in);
        System.out.print("Capital of France? ");
        String ans = s.nextLine();
        if (ans.equalsIgnoreCase("Paris")) System.out.println("Correct!");
        else System.out.println("Wrong");
        s.close();
    }

    // 37. Rock Paper Scissors - Full Logic
    public static void rockPaperScissors() {
        Scanner s = new Scanner(System.in);
        String[] options = {"rock", "paper", "scissors"};
        Random r = new Random();

        System.out.print("Enter rock, paper, or scissors: ");
        String userInput = s.nextLine().trim().toLowerCase();

        // Check for valid input
        if (!userInput.equals("rock") && !userInput.equals("paper") && !userInput.equals("scissors")) {
            System.out.println("Invalid input! Please choose rock, paper, or scissors.");
            return;
        }

        String computerChoice = options[r.nextInt(3)];

        System.out.println("User chooses: " + userInput);
        System.out.println("Computer chooses: " + computerChoice);

        if (userInput.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userInput.equals("rock") && computerChoice.equals("scissors")) ||
                   (userInput.equals("scissors") && computerChoice.equals("paper")) ||
                   (userInput.equals("paper") && computerChoice.equals("rock"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
        s.close();
    }

    // 38. Slot Machine
    public static void slotMachine() {
        Random r = new Random();
        System.out.println(r.nextInt(9) + " " + r.nextInt(9) + " " + r.nextInt(9));
    }

    // 39. OOP Demo
    static class Car {
        String brand;
        public void drive() {
            System.out.println(brand + " is driving");
        }
    }

    public static void objectOrientedProgramming() {
        Car c = new Car();
        c.brand = "Honda";
        c.drive();
    }

    // 40. Constructors
    static class Person {
        String name;
        Person(String n) { name = n; }
    }

    // 41. Overloaded Constructors
    static class Book {
        String title;
        Book() { title = "Unknown"; }
        Book(String t) { title = t; }
    }

    // 42. Array of Objects
    public static void arrayOfObjects() {
        Person[] people = {
            new Person("Alice"),
            new Person("Bob")
        };
        for (Person p : people)
            System.out.println(p.name);
    }

    // 43. Static
    static class Counter {
        static int count = 0;
        Counter() { count++; }
    }

    // 44. Inheritance
    static class Animal {
        void speak() { System.out.println("Animal speaks"); }
    }
    static class Dog extends Animal {
        void bark() { System.out.println("Woof"); }
    }

    // 45. Super
    static class Parent {
        Parent() { System.out.println("Parent constructor"); }
    }
    static class Child extends Parent {
        Child() { super(); }
    }

    // 46. Overriding
    static class Shape {
        void draw() { System.out.println("Drawing shape"); }
    }
    static class Circle extends Shape {
        @Override void draw() { System.out.println("Drawing circle"); }
    }

    // 47. toString()
    static class Movie {
        String name = "Oppenheimer";
        public String toString() {
            return "Movie: " + name;
        }
    }

    // 48. Abstraction
    abstract static class Animal2 {
        abstract void makeSound();
    }
    static class Cat extends Animal2 {
        void makeSound() { System.out.println("Meow"); }
    }

    // 49. Interface
    interface Drawable {
        void draw();
    }
    static class Square implements Drawable {
        public void draw() { System.out.println("Drawing square"); }
    }

    // 50. Polymorphism
    public static void polymorphismDemo() {
        Shape s = new Circle();
        s.draw();
    }

    // 51. Runtime Polymorphism
    public static void runtimePolymorphism() {
        Animal a = new Dog();
        a.speak();
    }

    // 52. Getters and Setters
    static class Student {
        private String name;
        public void setName(String name) { this.name = name; }
        public String getName() { return name; }
    }

    // 53. Aggregation 
    static class Department {
        String name;
        Department(String name) {
            this.name = name;
        }
    }

    static class AggregationStudent {
        String name;
        Department department; // Aggregation
        AggregationStudent(String name, Department department) {
            this.name = name;
            this.department = department;
        }
    }

    public static void aggregationExample() {
        Department cs = new Department("Computer Science");
        AggregationStudent student = new AggregationStudent("John", cs);
        System.out.println(student.name + " studies in " + student.department.name + " department.");
    }

    // 54. Composition
    static class Engine {
        public void start() {
            System.out.println("Engine starts...");
        }
    }

    static class Vehicle {
        private Engine engine = new Engine();
        public void drive() {
            engine.start(); // tightly coupled
            System.out.println("Driving the vehicle...");
        }
    }

    public static void compositionExample() {
        Vehicle car = new Vehicle();
        car.drive();
    }

    // 55. Wrapper Classes
    public static void wrapperClassExample() {
        int primitive = 5;
        Integer wrapper = primitive; // autoboxing
        int unboxed = wrapper; // unboxing
        System.out.println("Wrapper: " + wrapper + ", Unboxed: " + unboxed);
    }

    // 56. ArrayLists
    public static void arrayListExample() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("Fruits: " + fruits);
        System.out.println("Second fruit: " + fruits.get(1));
    }

    // 57. Exception Handling
    public static void exceptionHandlingExample() {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } finally {
            System.out.println("This block always executes.");
        }
    }

    // 58. Write to File
    public static void writeFileExample() {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, file world!");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    // 59. Read from File
    public static void readFileExample() {
        try {
            File file = new File("output.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    // 60. Music Player (Simulated Audio) 🎼
    public static void musicPlayerSimulated() {
        System.out.println("♫ Playing music... ♫ (Simulated)");
    }

    // 61. Hangman
    public static void hangmanGame() {
        String word = "java";
        char[] guessed = {'_', '_', '_', '_'};
        Scanner sc = new Scanner(System.in);
        int attempts = 5;

        while (attempts > 0) {
            System.out.print("Word: ");
            for (char c : guessed) System.out.print(c + " ");
            System.out.print("\nGuess a letter: ");
            char letter = sc.next().charAt(0);
            boolean found = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter) {
                    guessed[i] = letter;
                    found = true;
                }
            }
            if (!found) attempts--;
            if (new String(guessed).equals(word)) {
                System.out.println("You guessed it: " + word);
                return;
            }
        }
        System.out.println("Out of attempts! The word was: " + word);
        sc.close();
    }

    // 62. Dates & Times
    public static void dateAndTimeExample() {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);
    }

    // 63. Anonymous Classes
    public static void anonymousClassExample() {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class thread running.");
            }
        };
        new Thread(task).start();
    }

    // 64. TimerTasks
    public static void timerTaskExample() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Timer executed at: " + new Date());
                timer.cancel();
            }
        };
        timer.schedule(task, 3000); // Run after 3 sec
    }

    // 65. Countdown Timer
    public static void countdownTimerExample() {
        for (int i = 5; i >= 0; i--) {
            System.out.println("Countdown: " + i);
            try {
                Thread.sleep(1000); // wait 1 sec
            } catch (InterruptedException e) {
                System.err.println("Interrupted");
            }
        }
        System.out.println("Time's up!");
    }

    // 66. Generics
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    // 67. HashMap
    public static void hashMapExample() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Math", 90);
        map.put("Science", 85);
        map.put("History", 75);
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    // 68. Enums
    enum Day { MONDAY, TUESDAY, FRIDAY }

    public static void enumExample() {
        Day today = Day.FRIDAY;
        switch (today) {
            case MONDAY: System.out.println("Start of the week");
            case FRIDAY: System.out.println("Weekend's here!");
            default: System.out.println("Midweek day");
        }
    }

    // 69. Threading
    static class MyThread extends Thread {
        public void run() {
            System.out.println("Thread is running...");
        }
    }

    public static void threadingExample() {
        MyThread t = new MyThread();
        t.start();
    }

    // 70. Multithreading
    static class Countdown extends Thread {
        int count = 5;
        public void run() {
            try {
                while (count > 0) {
                    System.out.println("Count: " + count--);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void multiThreadingExample() {
        Countdown c1 = new Countdown();
        Countdown c2 = new Countdown();
        c1.start();
        c2.start();
    }

    // 71. Alarm Clock
    public static void alarmClockExample() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set alarm (seconds from now): ");
        int seconds = sc.nextInt();
        System.out.println("Alarm set for " + seconds + " seconds from now.");
        try {
            Thread.sleep(seconds * 1000);
            System.out.println("⏰ Alarm! Time's up!");
        } catch (InterruptedException e) {
            System.out.println("Alarm interrupted!");
        }
        sc.close();
    }


    public static void main(String[] args) {
    introductionToJava();
    variables();
    arithmetic();
    shoppingCartProgram();
    ifStatements();
    randomNumbers();
    mathClass();
    printFormatting();
    compoundInterestCalculator();
    nestedIfStatements();
    stringMethods();
    substrings();
    weightConverter();
    ternaryOperator();
    temperatureConverter();
    enhancedSwitchDemo();
    calculatorProgram(); // note: missing breaks; will fall through
    logicalOperators();
    whileLoops();
    forLoops();
    breakAndContinue();
    nestedLoops();
    greet("Alice");
    System.out.println("Add int: " + add(2, 3));
    System.out.println("Add double: " + add(2.5, 3.7));
    variableScopeDemo();
    bankingProgram();
    diceRollerProgram();
    arraysDemo();
    searchArray();
    System.out.println("Sum varargs: " + sumVarArgs(1, 2, 3, 4));
    twoDimensionalArray();
    objectOrientedProgramming();
    arrayOfObjects();
    Counter c1 = new Counter(); Counter c2 = new Counter();
    System.out.println("Counter: " + Counter.count);
    Dog d = new Dog(); d.speak(); d.bark();
    new Child(); // Super demo
    Shape shape = new Circle(); shape.draw();
    Movie m = new Movie(); System.out.println(m);
    Cat cat = new Cat(); cat.makeSound();
    Square sq = new Square(); sq.draw();
    polymorphismDemo();
    runtimePolymorphism();
    Student st = new Student(); st.setName("Rita"); System.out.println(st.getName());
    aggregationExample();
    compositionExample();
    wrapperClassExample();
    arrayListExample();
    exceptionHandlingExample();
    writeFileExample();
    readFileExample();
    musicPlayerSimulated();
    dateAndTimeExample();
    anonymousClassExample();
    timerTaskExample();
    countdownTimerExample();
    printArray(new Integer[]{1, 2, 3});
    hashMapExample();
    enumExample();
    threadingExample();
    multiThreadingExample();
    System.out.println("Function completed");
}

}

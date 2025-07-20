public class Main {
    public static void main(String[] args){
        System.out.println("BettleJuice");

        // Primitive data types
        byte b = 100;
        short s = 10000;
        int i = 123456789;
        long l = 12345678910L;
        float f = 12.34f;
        double d = 123.456789;
        char c = 'A';
        boolean bool = true;

        // Reference data types
        String str = "Hello, Java!";
        int[] arr = {1, 2, 3, 4, 5};

        // Printing all data types
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + str);
        System.out.print("Array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}

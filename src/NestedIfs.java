public class NestedIfs {
    public static void main(String[] args) {
    int num  = 10;
    if (num > 0) { 
        if (num % 2 == 0) {
            if (num > 100) { 
                System.out.println("The number is positive, even, and greater than 100.");
            } else {
                System.out.println("The number is positive and even, but not greater than 100.");
            }
        } else {
            System.out.println("The number is positive but not even.");
        }
    } else {
        System.out.println("The number is not positive.");
    }
}

    
}

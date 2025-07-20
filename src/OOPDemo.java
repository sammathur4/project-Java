abstract class Animal {
    // Encapsulation: private data, with public getter/setter
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Abstract method (must be implemented by child classes)
    public abstract void makeSound();

    // Concrete method
    public String getName() {
        return name;
    }

    // Method Overloading: Polymorphism (compile-time)
    public void eat() {
        System.out.println(name + " is eating generic food.");
    }
    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }
}

// Inheritance & Polymorphism: Derived classes
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Method Overriding: Polymorphism (run-time)
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}

// Usage example
public class OOPDemo {
    public static void main(String[] args) {
        // Using Abstraction and Inheritance
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Kitty");

        // Polymorphism: upcasting and dynamic method dispatch
        myDog.makeSound(); // Buddy says: Woof!
        myCat.makeSound(); // Kitty says: Meow!

        // Polymorphism: method overloading
        myDog.eat();
        myCat.eat("fish");

        // Encapsulation: fields are private but accessed safely
        System.out.println("Dog's name (encapsulated): " + myDog.getName());
        System.out.println("Cat's name (encapsulated): " + myCat.getName());
    }
}

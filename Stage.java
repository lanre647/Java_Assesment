// Abstraction in Java is a concept that allows you to represent complex real-world entities as
// simplified and more manageable models in your code. It involves hiding the internal details
// and complexities of an object and exposing only the essential features and behaviors to the outside world.

// In Java, abstraction is achieved through abstract classes and interfaces.

// 1. Abstract Class:
// An abstract class is a class that cannot be instantiated. It serves 
// as a blueprint for other classes to inherit from. It can contain both abstract and non-abstract methods.

// Here's an example:

abstract class Animal {
    public abstract void makeSound();
    
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

public class Stage {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();     // Output: Dog is barking
        dog.sleep();         // Output: Animal is sleeping
    }
}

// In the above example, the `Animal` class is an abstract class with an abstract
// method `makeSound()` and a non-abstract method `sleep()`. The `Dog` class extends the
// `Animal` class and provides an implementation for the abstract method `makeSound()`. 
// We can create an instance of `Dog` and call both the overridden method `makeSound()` 
// and the inherited method `sleep()`.

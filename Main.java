// Method Overriding:

// Method overriding is the process of providing a different implementation for a 
// method in a subclass that is already defined in its superclass. The method in 
// the subclass must have the same name, return type, and parameters as the method
//  in the superclass. Here's an example:

class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();                 // Output: Animal is making a sound
        
        Dog dog = new Dog();
        dog.makeSound();                    // Output: Dog is barking
        
        Animal animalDog = new Dog();
        animalDog.makeSound();              // Output: Dog is barking
    }
}


// In the above example, the `Animal` class has a method `makeSound()`, which is overridden in the `Dog` class. 
// When we create an instance of `Dog`, the `makeSound()` method in the `Dog` class is invoked, providing a different
//  implementation. Additionally, when we assign a `Dog` object to an `Animal` reference, the overridden method in the
// `Dog` class is still invoked, demonstrating dynamic method dispatch.

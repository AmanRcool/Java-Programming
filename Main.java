// Base class Animal
class Animal {
    // Method in the base class
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class Dog
class Dog extends Animal {
    // Overriding the makeSound() method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Animal
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  // Output: Animal makes a sound

        // Creating an object of Dog
        Dog myDog = new Dog();
        myDog.makeSound();  // Output: Dog barks

        // Using a reference of Animal to refer to a Dog object
        Animal myAnimalDog = new Dog();
        myAnimalDog.makeSound();  // Output: Dog barks
    }
}

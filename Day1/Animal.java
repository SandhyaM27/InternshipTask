package Day1;

// Base class
public class Animal {
    void makeSound() {
        System.out.println("Animals always make sound !!!!");
    }

    void sleep() {
        System.out.println("Animals always have a deep sleep after food");
    }
}


class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dogs!! always bark");
    }

    void eat() {
        System.out.println("Dog Loves Chicken");
    }
}


class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cats always make soft sound");
    }
}

// Main class to run the program
class Main {
    public static void main(String[] args) {
        Animal example = new Animal();
        example.makeSound(); // From Animal

        Animal myDog = new Dog();
        myDog.makeSound();   // Overridden in Dog

        Animal myCat = new Cat();
        myCat.makeSound();   // Overridden in Cat
    }
}

package Polymorphism;

interface Animal {
    void makeSound();
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

public class InterfacePolymorphism {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.makeSound();  // Output: The cat meows
        animal2.makeSound();  // Output: The dog barks
    }
}


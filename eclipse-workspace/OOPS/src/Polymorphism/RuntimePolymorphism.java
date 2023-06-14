package Polymorphism;

class Animal1 {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Cat1 extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

class Dog1 extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal1 animal1 = new Cat1();
        Animal1 animal2 = new Dog1();

        animal1.makeSound();  // Output: The cat meows
        animal2.makeSound();  // Output: The dog barks
    }
}


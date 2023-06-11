package Interface;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class ex4 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();
    }
}

package Polymorphism;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(3, 4);              // Uses the int version of add()
        double sum2 = calculator.add(2.5, 3.7);       // Uses the double version of add()

        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
    }
}

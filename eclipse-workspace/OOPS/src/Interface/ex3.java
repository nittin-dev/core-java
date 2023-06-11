package Interface;

interface maths {
    int calculate(int num1, int num2);
}

class Addition implements maths {
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}

class Subtraction implements maths {
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}

public class ex3{
    public static void main(String[] args) {
        maths addition = new Addition();
        System.out.println("Addition: " + addition.calculate(5, 3));

        maths subtraction = new Subtraction();
        System.out.println("Subtraction: " + subtraction.calculate(7, 2));
    }
}


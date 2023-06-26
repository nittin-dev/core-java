package Abstraction;

abstract class Player {
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void play();
}

class FootballPlayer extends Player {
    public FootballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("Football player " + getName() + " is playing football.");
    }
}

class Goalkeeper extends Player {
    public Goalkeeper(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("Goalkeeper " + getName() + " is defending the goal.");
    }
}

public class abs2 {
    public static void main(String[] args) {
        Player player1 = new FootballPlayer("John", 25);
        Player player2 = new Goalkeeper("Michael", 28);

        player1.play();
        player2.play();
    }
}

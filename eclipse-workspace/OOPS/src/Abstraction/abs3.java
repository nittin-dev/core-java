package Abstraction;

abstract class FootballClub {
    private String name;

    public FootballClub(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void train();

    public abstract void playMatch();
}

class Barcelona extends FootballClub {
    public Barcelona(String name) {
        super(name);
    }

    @Override
    public void train() {
        System.out.println(getName() + " is training for the upcoming match.");
    }

    @Override
    public void playMatch() {
        System.out.println(getName() + " is playing a football match.");
    }
}

class RealMadrid extends FootballClub {
    public RealMadrid(String name) {
        super(name);
    }

    @Override
    public void train() {
        System.out.println(getName() + " is having a practice session.");
    }

    @Override
    public void playMatch() {
        System.out.println(getName() + " is competing in a football match.");
    }
}

public class abs3 {
    public static void main(String[] args) {
        FootballClub club1 = new Barcelona("FC Barcelona");
        FootballClub club2 = new RealMadrid("Real Madrid");

        club1.train();
        club1.playMatch();

        club2.train();
        club2.playMatch();
    }
}

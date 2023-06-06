package Inheritance;

public class inherit {
    protected String name;
    protected int jerseyNumber;

    public inherit(String name, int jerseyNumber) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Jersey Number: " + jerseyNumber);
    }
 class Goalkeeper extends inherit {
        private int saves;

        public Goalkeeper(String name, int jerseyNumber, int saves) {
            super(name, jerseyNumber);
            this.saves = saves;
        }

        public void performSave() {
            saves++;
            System.out.println(name + " made a save!");
        }

        public void displayStats() {
            display();
            System.out.println("Saves: " + saves);
        }
    }
 class Defender extends inherit {
        private int tackles;

        public Defender(String name, int jerseyNumber, int tackles) {
            super(name, jerseyNumber);
            this.tackles = tackles;
        }

        public void performTackle() {
            tackles++;
            System.out.println(name + " made a tackle!");
        }

        public void displayStats() {
            display();
            System.out.println("Tackles: " + tackles);
        }
    }
    public static void main(String args[]){
        // Example usage:
        inherit obj = new inherit("neymar",11);
        Goalkeeper goalkeeper = obj.new Goalkeeper("Neymar", 11, 10);
        goalkeeper.display();
        goalkeeper.performSave();
        goalkeeper.displayStats();

        Defender defender = obj.new Defender("Ramos", 4, 20);
        defender.display();
        defender.performTackle();
        defender.displayStats();

    }
}

// since both the class are with the inherit class
// they are inner classes , so instance should be created with the inherit class
// with the instance the objects can be created and the methods can be accessed





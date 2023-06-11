package Interface;

interface ex2{
    void print();
}

class Document implements ex2 {
    public void print() {
        System.out.println("Printing document...");
    }
}

class Image implements ex2 {
    public void print() {
        System.out.println("Printing image...");
    }
}

public class print {
    public static void main(String[] args) {
        ex2 document = new Document();
        document.print();

        ex2 image = new Image();
        image.print();
    }
}

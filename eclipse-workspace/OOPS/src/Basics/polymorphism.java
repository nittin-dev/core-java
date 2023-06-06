package Basics;
class vehicle{
    public void move(String s){
      System.out.println(s);
    }
}
class Bicyle extends vehicle{
    @Override
    public void move(String s){
        System.out.println(s);
    }
}
public class polymorphism {
     public static void main (String args[]) {
         String s = "Basics";
         String s1 = "Ronaldo";
         vehicle obj = new vehicle();
         Bicyle obj1 = new Bicyle();
         obj.move(s);
         obj1.move(s1);
     }
}

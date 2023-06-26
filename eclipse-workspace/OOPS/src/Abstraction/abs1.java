package Abstraction;
import java.util.*;
 abstract class Vehicle {
     protected int fuelC;
     protected int fuelE;
      abstract void calculateMileage(int fuelC,int fuelE);

}
class Car extends Vehicle{
    Car(int fuelC,int fuelE){
        this.fuelC= fuelC;
        this.fuelE = fuelE;
    }
    void calculateMileage(int fuelC,int fuelE){
      System.out.println(fuelC * fuelE);
    }
}
class Truck extends Vehicle{
    Truck(int fuelC,int fuelE){
        this.fuelC = fuelC;
        this.fuelE = fuelE;
    }
    void calculateMileage(int fuelC,int fuelE){
     System.out.println(fuelC * fuelE);
    }
}
public class abs1{
     public static void main (String args[]){
         Scanner sc= new Scanner(System.in);
         String v = sc.next();
         if(v.equals("Car")){
             int fuelC = sc.nextInt();
             int fuelE = sc.nextInt();
             Car obj = new Car(fuelC,fuelE);
             obj.calculateMileage(fuelC,fuelE);
         }else{
             int fuelC = sc.nextInt();
             int fuelE = sc.nextInt();
             Truck obj = new Truck(fuelC,fuelE);
             obj.calculateMileage(fuelC,fuelE);
         }
     }
}


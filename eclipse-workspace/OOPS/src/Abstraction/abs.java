package Abstraction;

import java.util.Scanner;

public abstract class abs {
    abstract void career(String name);
    abstract void hobby(String name,int age);
    public static void main(String args[]){
        abs obj =new son();
        obj.career("Doctor");
    }
}
 class son extends abs{
     @Override
    void career(String name){
         System.out.println("I will be a"+name);
     }
     @Override
     void hobby(String name,int age){
         System.out.println("my hobby is to play football");
     }
}


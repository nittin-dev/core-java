package Basics;
class shape{
     int l;
     int b;
    void setwidth(int len){
        l = len;
    }
    void setbreadth(int ben) {
        b = ben;
    }
}
class trianglearea extends shape{
     int getArea(){
        return l * b;
     }
}
class rectangle extends shape{

    int getArea(){
        return (l * b)/2;
    }
}
public class area{
    public static void main (String args[]){
         shape obj = new shape();
         obj.setwidth(7);
         obj.setbreadth(5);
         trianglearea t = new trianglearea();
         rectangle r = new rectangle();
         System.out.println(obj.l);
         System.out.println(t.getArea());
         System.out.println(r.getArea());
    }
}

package Inheritance;

 class Baseclass
{
    int x = 20;
    // Overridden method.
    void msg()
    {
        System.out.println("Base class method");
    }
}
 class Childclass extends Baseclass
{
    int x = 50;
    int y = 100;
    // Overriding method.
    void msg()
    {
        System.out.println("Child class first method");
    }
    void msg2()
    {
        System.out.println("Child class second method");
    }
}
public class Inherit2 extends Childclass {
    public static void main(String[] args)
    {
        Childclass obj = new Childclass();
        System.out.println("Value of x: " +obj.x);
        obj.msg();
        obj.msg2();

        Baseclass obj2 = new Childclass();
        System.out.println("Value of x: " +obj2.x);

        obj2.msg();
    }
}
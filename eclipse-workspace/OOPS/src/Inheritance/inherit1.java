package Inheritance;

 class P{
    int a = 30;
}
class Q extends P
{
    int a = 50;
}
public class inherit1 extends Q {
    public static void main(String[] args)
    {
        Q q = new Q();
        System.out.println(" Value of a: " +q.a);


        P p = new Q();
        System.out.println("Value of a: " +p.a);
    }
}
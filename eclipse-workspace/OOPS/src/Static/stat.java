package Static;

public class stat {
    static int a=10 ;
    static int b ;

    static{
         b = a * 7;
     }
    public static void main(String args[]){
         stat obj = new stat();
         System.out.println(obj.b);
         stat.b+=3;
         stat obj1 = new stat();
         System.out.println(obj1.b);
    }
}

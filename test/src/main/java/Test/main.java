package Test;

class Outer{
    int a = 5;
    static int b = 10;
     public Outer(){

     }
     static class Inner{
         public Inner() {
//             System.out.println(a);
             System.out.println(b);
         }
     }
}
public class main {
}

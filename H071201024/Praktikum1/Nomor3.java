import java.util.Scanner;
class Nomor3 {
     public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
         double h;
         double a;
         double b;
         h = obj.nextDouble();
         a = obj.nextDouble();
         b = obj.nextDouble();
         
        
        double Tana;
        Tana =  Math.tan(Math.toRadians(a));
        double Tanb;
        Tanb =  Math.tan(Math.toRadians(b));
        double x;
        double y;
        y = h * Tana;
        x = y - (h * Tanb);
        System.out.printf("%.1f m", x);
                 

             }
    }
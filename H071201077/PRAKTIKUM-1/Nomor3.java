import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int h,a,b;
        double ai,bi;
       
        System.out.println("Masukkan h a dan b");
        h=x.nextInt();
        a=x.nextInt();
        b=x.nextInt();

        ai=Math.tan(Math.toRadians(a));
        bi=Math.tan(Math.toRadians(b));
    
        double kapal =(h*ai)-(h*bi);
      
        System.out.printf("%.1f m",kapal);
    }
}

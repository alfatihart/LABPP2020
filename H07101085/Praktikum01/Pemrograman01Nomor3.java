import java.util.Scanner;

import java.util.Scanner;
public class Pemrograman01Nomor3 {

    public static void main(String[] args) {
        Scanner vina = new Scanner (System.in);
        System.out.println ("masukkan ketinggian menara, sudut elevasi ujung depan kapal, dan sudut elevasi belakang kapal");
        double T = vina.nextDouble();
        double a = vina.nextDouble();
        double b = vina.nextDouble();

        double Y = Math.tan(Math.toRadians(b))*T;
        Double panjangKapal = ( Math.tan(Math.toRadians(a))*(double)T)- Y;

        System.out.printf ("panjangKapal : "+"%.1f",panjangKapal);
        System.out.printf ("meter");

        
    }
    
}

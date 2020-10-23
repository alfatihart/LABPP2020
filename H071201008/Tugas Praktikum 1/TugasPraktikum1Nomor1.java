import java.util.Scanner;
public class TugasPraktikum1Nomor1 {
    public static void main(String[] args) {

       //efisiesi bensin 14Km/Liter
       Scanner kmh = new Scanner(System.in);
       double kecepatan = 1;
       double waktu = 1;

       System.out.println("Masukkan Waktu Perjalanan (dalam Jam): ");
       waktu = kmh.nextDouble();
       System.out.println("Masukkan Kecepatan Perjalanan : ");
       kecepatan = kmh.nextDouble();

       double jarak = kecepatan * waktu;//Rumus jarak.
       double bensin = jarak/14;  //Setiap 14 kilometer, digunakan 1 liter bensin.

       System.out.println("Total Bensin yang Digunakan" + bensin );
    }

}
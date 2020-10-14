import java.util.Scanner;
public class Nomor01 {


    public static void main(String[] args) {

        final int efesiensi = 14;

        Scanner obj1 = new Scanner(System.in);
       
        System.out.printf("Masukkan waktu tempuh perjalanan (jam) = ");
        int time = obj1.nextInt();

        System.out.printf("Masukkan kecepatan rata-rata (km/jam) = ");
        int velocity = obj1.nextInt();
    
        float bensin = ((velocity*time)/(float) efesiensi);

        System.out.printf("Bensin yang digunakan = " + String.format("%.3f", bensin) + " L" );

    }



}

import java.util.Scanner;
public class Pemrograman01Nomor2 {
    public static void main(String[] args) {
        Scanner vina = new Scanner (System.in);
        System.out.print("masukkan total waktu dalam sekon");
        int totalWaktu = vina.nextInt();

        int jam = totalWaktu/3600;
        int menit = ((totalWaktu%3600)/60);
        int sekon = totalWaktu%60;

        System.out.println ("hasil konversi jam:menit:sekon");
        System.out.println(jam + ":" + menit + ":" + sekon);


    }
    
}

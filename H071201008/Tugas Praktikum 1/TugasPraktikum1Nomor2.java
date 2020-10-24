import java.util.Scanner;
public class TugasPraktikum1Nomor2 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Masukkan jumlah detik");
        
        int detik;
        detik = t.nextInt();
        int menit;
        int jam;

        System.out.println("Masukkan jumlah detik :" );

        jam = detik / (60*60);
        detik = detik - ((60*60) * jam);
        menit = detik / 60;
        detik = detik - (60*menit);

        System.out.println (jam + ":" + menit + ":" + detik);
    }
}
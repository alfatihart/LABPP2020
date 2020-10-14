import java.util.Scanner;
public class Nomor02 {
    
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.printf("Masukkan waktu (detik) = ");
        int waktu = d.nextInt();

        int jam = (waktu/3600), sisaJam = (waktu%3600);
        int menit = (sisaJam/60), sisaMenit = (sisaJam%60);
        int detik = (sisaMenit);

        System.out.printf("Jam:Menit:Detik = " + String.format("%02d", jam) + ":" + String.format("%02d", menit) + ":" + String.format("%02d",detik));
    }
}
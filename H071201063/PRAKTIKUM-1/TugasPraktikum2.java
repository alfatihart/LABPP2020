import java.util.Scanner;
public class TugasPraktikum2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Masukan detik");
        int detik = x.nextInt();

        int jam,menit;
        jam = detik / (60 * 60);
        detik = detik -((60 * 60) * jam);
        menit = detik / 60;
        detik = detik - (60 * menit);

        System.out.println(jam + ":" + menit + ":" + detik);

        x.close();


    }
    
}

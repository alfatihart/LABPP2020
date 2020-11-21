import java.util.Scanner;

public class Nomor05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {

            float m = scan.nextFloat();
            int jam = 0, menit = 0, detik = 0;
            int dSementara = (int) (m * 240);

            if (m >= 0 && m < 360) {
                while (dSementara > 0) {
                    if (dSementara - 3600 >= 0) {
                        dSementara -= 3600;
                        jam++;
                    } else if (dSementara - 60 >= 0) {
                        dSementara -= 60;
                        menit++;
                    } else {
                        dSementara -= 1;
                        detik++;
                    }
                }
                jam += 6;

                if (jam >= 24)
                    jam -= 24;

                if (jam <= 10) {
                    System.out.println("selamat pagi");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } else if (jam <= 14) {
                    System.out.println("selamat siang");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } else if (jam <= 18) {
                    System.out.println("selamat sore");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } else {
                    System.out.println("selamat malam");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                }
            } else
                System.out.println("harap masukkan 0<=nilai<360");
        }
    }
}

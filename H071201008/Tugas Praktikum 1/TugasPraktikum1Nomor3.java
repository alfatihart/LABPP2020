import java.util.Scanner;
public class TugasPraktikum1Nomor3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Masukkan ketinggian mernara");
        int h = x.nextInt();
        System.out.println("Masukkan sudut elevasi dalam kapal");
        int a = x.nextInt();
        System.out.println("Masukkan susut elevasi belakang kapal");
        int b = x.nextInt();
        double BD,CD,BC;

        BD =Math.tan(Math.toRadians(a))*(double)h;
        CD =Math.tan(Math.toRadians(b))*(double)h;
        BC = BD - CD;
        System.out.printf("BC - %.1f", BC);
        System.out.printf("m");


    }
}
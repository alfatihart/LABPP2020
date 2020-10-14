import java.util.Scanner;
public class TugasPraktikum3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double panjangKapal;
        double h = x.nextDouble();
        double a = x.nextDouble();
        double b = x.nextDouble();

        panjangKapal = h * Math.tan(Math.toRadians(a)) - h / Math.tan(Math.toRadians(b));

        System.out.println(String.format("%.1f", panjangKapal) + " m");

        x.close();
    }
}

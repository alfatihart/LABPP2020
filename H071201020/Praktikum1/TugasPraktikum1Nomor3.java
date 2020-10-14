import java.util.Scanner;
public class TugasPraktikum1Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double h;
        System.out.println("Masukkan nilai h :");
        h = input.nextDouble();
        double a;
        System.out.println("Masukkan nilai a :");
        a = input.nextDouble();
        double b;
        System.out.println("Masukkan nilai b :");
        b = input.nextDouble();

        if (90 > a && a > b) {
            double TANa;
            TANa = (double) Math.tan(Math.toRadians(a));
            double TANb;
            TANb = (double) Math.tan (Math.toRadians(b));
            double x;
            double y;
            y = h * TANa;
            x = y - (h * TANb);
            System.out.printf("Maka panjang kapal adalah :");
            System.out.printf("%.1f m", x);
        }
        else{
            System.out.printf("Error!");
        }
    }
}
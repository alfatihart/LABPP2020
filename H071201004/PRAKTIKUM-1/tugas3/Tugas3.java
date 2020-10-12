import java.util.Scanner;

class Tugas3 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in); System.out.print("Masukkan tinggi: ");
        int h = ax.nextInt();
        Scanner bx = new Scanner(System.in); System.out.print("Masukkan sudut a: ");
        double a = bx.nextDouble();
        Scanner cx = new Scanner(System.in); System.out.print("Masukkan sudut b: ");
        double b = cx.nextDouble();
        
        double belakangKapal = h * Math.sin (Math.toRadians(a)) / Math.sin (Math.toRadians(180 - (90+a)));
        double depanKapal = h * Math.sin (Math.toRadians(b)) / Math.sin (Math.toRadians(180 - (90+a)));

        double panjangKapal = belakangKapal - depanKapal;

        System.out.printf("%.1f m", panjangKapal);

    }
}
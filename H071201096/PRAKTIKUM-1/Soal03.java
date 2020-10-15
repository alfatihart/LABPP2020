import java.util.Scanner;
class Soal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tinggi Menara");
        int h = input.nextInt();
        System.out.println("Sudut Elevasi Terhadap Ujung Depan Kapal");
        int a = input.nextInt();
        System.out.println("Sudut Elevasi Terhadap Ujung Belakang Kapal");
        int b = input.nextInt();
        // x = jarak antara belakang kapal dan menara
        double x = h*(Math.tan(Math.toRadians(a)));
        // y = jarak antara depan kapal dan menara
        double y = h*(Math.tan(Math.toRadians(b)));
        double z = x-y;

        System.out.printf("Panjang Kapal = %.1f", z);
        System.out.print(" m ");
    }
}
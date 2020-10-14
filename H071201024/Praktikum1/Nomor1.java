import java.util.Scanner;
class Nomor1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);   
        System.out.print("Waktu :");
        double waktu = obj.nextDouble();
        System.out.print("Kecepatan Mobil :");
        double kecepatan = obj.nextDouble();

        double bensin = ( kecepatan * waktu ) / 14;
        System.out.printf("Bensin : %.3fL ", bensin);


    }
}

import java.util.Scanner;

public class TugasPraktikum1 {

    public static void main(String[] args) {
        Scanner liter = new Scanner(System.in);

        double bensin;
        System.out.println("Masukan waktu yang ditempuh!");
        int waktu = liter.nextInt();

        System.out.println("Masukan kecepatan rata rata!");
        int kecepatan = liter.nextInt();

        bensin = (kecepatan * waktu) / 14f ;
        System.out.println(String.format("%.3f", bensin) + " L");

        liter.close();
    }
    
}

import java.util.Scanner;
public class Pemrograman01Nomor1 {
    
    public static void main(String[] args) {
        Scanner vina = new Scanner(System.in);
        double Jam , Kecepatan , Efisiensi = 14;

        System.out.println("masukkan jam");
        double T = vina.nextDouble();
        System.out.println("masukkan kecepatan");
        double K = vina.nextDouble();
    
        double bensin = ((T*K)/14);
        System.out.println("bensin yang digunakan");
        System.out.printf("%.3f Liter", + bensin);
        
    }
}

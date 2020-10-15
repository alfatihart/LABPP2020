import java.util.Scanner;

public class tugas01 {
     
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);

        System.out.print("waktu = ");
        int t = sum.nextInt();
        System.out.print("Kecepatan rata - rata  = ");
        int V = sum.nextInt();

        float bensin_yang_digunakan = (float)V*t/14;

        System.out.print("Bensin Yang Digunakan : ");

        System.out.printf("%.3f",bensin_yang_digunakan);
        System.out.print(" L");



        
    }
    
}

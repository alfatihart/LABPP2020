import java.util.Scanner;
public class Soal01 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Waktu yang ditempuh dalam perjalanan");
        int W = input.nextInt();
        System.out.println("Kecepatan rata-rata dalam perjalanan");
        int K = input.nextInt();
        double J = (double) W*K;
        double Bensin = J/14;
        System.out.printf("Bensin Yang Digunakan = %.3f",Bensin);

        
    } 
}
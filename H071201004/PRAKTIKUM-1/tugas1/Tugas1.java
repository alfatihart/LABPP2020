import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        System.out.println("Input waktu dan kecepatan rata-rata:");
        int t = ax.nextInt();       //t = waktu tempuh
        int v = ax.nextInt();       //v = kecepatan rata-rata
        
        double f = (double) v * t / 14;

        System.out.printf("Bensin yang digunakan: %.3f %s", f, "L");
    }
}
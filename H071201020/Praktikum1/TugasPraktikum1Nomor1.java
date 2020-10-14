import java.util.Scanner;
public class TugasPraktikum1Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int Velocity;
        System.out.println("Masukkan kecepatan rata-rata (dalam km) :");
        Velocity = input.nextInt();
        int Time;
        System.out.println("Masukkan waktu yang ditempuh (dalam jam) :");
        Time = input.nextInt();

        
        float Bensin = (Velocity * Time) / 14.0f;
        System.out.printf("Bensin Yang Digunakan : " + "%.3f L", Bensin);
    }
}
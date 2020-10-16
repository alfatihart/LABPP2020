

import java.util.Scanner;
public class Tugaspratikumno1 {
public static void main(String[] args) {
    Scanner inn = new Scanner(System.in);
    System.out.println("Masukkan waktu yang ditempuh");
    int T = inn.nextInt();
    System.out.println("Masukkan kecepatan rata-rata");
    int K = inn.nextInt();

    float A = ( T* K) / 14f;
    System.out.printf( "Bensin yang digunakan %.3f L" , A );

}
}

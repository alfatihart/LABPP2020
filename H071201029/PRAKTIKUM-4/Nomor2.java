package Pratikum4;
import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();

        int[][] matriksA = new int[i][j];
        int[][] matriksB = new int[j][k];
        int[][] hasil = new int[i][k];

        System.out.println("Masukkan Matriks A");
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {
                matriksA[a][b] = input.nextInt();
            }
        }
        System.out.println("Masukkan Matriks B");
        for (int a = 0; a < j; a++) {
            for (int b = 0; b < k; b++) {
                matriksB[a][b] = input.nextInt();
            }
        }
        System.out.println();
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < k; b++) {
                for (int c = 0; c < j; c++) {
                    hasil[a][b] += matriksA[a][c] * matriksB[c][b];
                }
                System.out.print(hasil[a][b] + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class TugasPraktikum4Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        int[][] matriksA = new int[i][j];
        int[][] matriksB = new int[j][k];
        int[][] hasil = new int[i][k];

        System.out.println("Input Matriks A");
        for (int x = 0; x < i; x++) {
            for (int y = 0; y < j; y++) {
                matriksA[x][y] = input.nextInt();
            }
        }
        System.out.println("Input Matriks B");
        for (int x = 0; x < j; x++) {
            for (int y = 0; y < k; y++) {
                matriksB[x][y] = input.nextInt();
            }
        }

        for (int x = 0; x < hasil.length; x++) {
            for (int y = 0; y <= matriksA.length; y++) { // matriksA.length == baris matriksA == 3
                for (int z = 0; z < matriksA[0].length; z++) { // matriksA[0].length == kolom matriksA == 2
                    hasil[x][y] += (matriksA[x][z] * matriksB[z][y]);
                }
            }
        }

        System.out.println("Hasil Pekalian Matriks :");
        for (int x = 0; x < i; x++) {
            for (int y = 0; y < k; y++) {
                System.out.printf("%d\t", hasil[x][y]);
            }
            System.out.println();
        }

    }
}

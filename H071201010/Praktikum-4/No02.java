import java.util.*;
public class No02{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int[][] A = new int[a][b];
        int[][] B = new int[b][c];
        int[][] hasil = new int [a][c];

        System.out.println();

        // matriks pertama
        System.out.println("Masukkan Matriks " + a+ "x" +b);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                A[i][j]= scan.nextInt();
            }
        }
        System.out.println();

        //matriks kedua
        System.out.println("Masukkan Matriks " + b+ "x" +c);
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j]= scan.nextInt();
            }
        }

        System.out.println();
        System.out.println("Hasil perkalian matriks:");

        //output
        for(int i = 0; i < a; i++){
            for(int j = 0; j < c; j++){
                for(int k = 0; k < b; k++){
                    hasil[i][j] += A[i][k]*B[k][j];
                }
                System.out.print(hasil[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
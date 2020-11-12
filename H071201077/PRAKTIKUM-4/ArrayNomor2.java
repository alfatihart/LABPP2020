import java.util.Scanner;
public class ArrayNomor2 {
  public static void main(String[] args) {
    int i, j, k, m, n, p;
   
    int matriks1[][] = new int[10][10];
    int matriks2[][] = new int[10][10];
    int hasil[][] = new int[10][10];
    
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai i: ");
    m = input.nextInt();
    System.out.print("Masukkan nilai j: ");
    n = input.nextInt();
    System.out.print("Masukkan nilai k: ");
    p = input.nextInt();

      System.out.println("Masukkan elemen matriks pertama: ");
      for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
          matriks1[i][j] = input.nextInt();
        }
      }
      System.out.println("Masukkan elemen matriks kedua: ");
      for (i = 0; i < n; i++) {
        for (j = 0; j < p; j++) {
          matriks2[i][j] = input.nextInt();
        }
      }
      System.out.println("\nHasil perkalian matriks:");
      for (i = 0; i < m; i++) {
        for (j = 0; j < p; j++) {
          for (k = 0; k < n; k++) {
            hasil[i][j] += matriks1[i][k] * matriks2[k][j];
          }
          System.out.print(hasil[i][j] + " ");
        }
        System.out.println();
      }
      input.close();
    }
  }

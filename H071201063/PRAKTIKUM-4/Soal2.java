import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan nilai i, j, dan k");
        int x = sc.nextInt(); // x = i
        int y = sc.nextInt(); // y = j
        int z = sc.nextInt(); // z = k
        System.out.println("Masukan Matrix A " + x + " x " + y);
        int[][] matriksA = new int[x][y];
        int[][] matriksB = new int[y][z];
        int[][] matriksC = new int[x][z];
        for(int i = 0; i<matriksA.length;i++){
            for(int j = 0; j<matriksA[i].length;j++){
                matriksA[i][j] = sc.nextInt();
            }
        }
        System.out.println("Masukan Matrix B " + y + " x " + z);
        for(int i = 0; i<matriksB.length;i++){
            for(int j = 0; j<matriksB[i].length;j++){
                matriksB[i][j] = sc.nextInt();
            }
        }
        //perkalian matriksA x matriksB
        for(int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    matriksC[i][k] += matriksA[i][j] * matriksB[j][k];
                }
            }
        }
        System.out.println("Hasilnya adalah Matrix C "+ x + " x " + z );
        for(int[] hasil1 : matriksC) {
            for (int hasil2 : hasil1) {
                System.out.print(hasil2 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

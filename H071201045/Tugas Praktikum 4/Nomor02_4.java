import java.util.Scanner;
public class Nomor02_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();

		int[][] matriksA = new int[i][j];
		int[][] matriksB = new int[j][k];
		int[][] matriksC = new int[i][k];

		for (int m = 0; m < i; m++){
			for (int n = 0; n < j; n++){
				matriksA[m][n] = scan.nextInt();
			}
		}
		for (int m = 0; m < j; m++){
			for (int n = 0; n < k; n++){
				matriksB[m][n] = scan.nextInt();
			}
		}
		for (int m = 0; m < i; m++){
			for (int n = 0; n < k; n++){
				for (int o = 0; o < j; o++){
					matriksC[m][n] += matriksA[m][o] * matriksB[o][n];
				}

			}
		}
		for (int m = 0; m < i; m++){
			for (int n = 0; n < k; n++){
				System.out.print(matriksC[m][n] + " ");
			}
			System.out.println("\n");
		}
    }
}

import java.util.Scanner;

class TPP4Nomor02 {
	public static void main(String[] args) {
		System.out.println("\n-----Perkalian Matriks-----\n");
		Scanner obj = new Scanner(System.in);

		System.out.println("Input nilai i j dan k: ");
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();


		//#Input matriks A
		System.out.println("\nInput matriks A orde " + a + " x " + b + ": ");
		int[][] matriksA = new int[a][b];

		for (int i = 0 ; i < a ; i++) {
			for (int j = 0 ; j < b ; j++) {
				matriksA[i][j] = obj.nextInt();
			}
		}

		//#Input matriks B
		System.out.println("\nInput matriks B orde " + b + " x " + c + ": ");
		int[][] matriksB = new int[b][c];

		for (int i = 0 ; i < b ; i++) {
			for (int j = 0 ; j < c ; j++) {
				matriksB[i][j] = obj.nextInt();
			}
		}


		//#Operasi perkalian matriks
		int[][] matriksHasil = new int[a][c];
		int hasil = 0;
		for (int i = 0 ; i < a ; i++) {
			for (int j = 0 ; j < c ; j++) {
				hasil = 0;
				for (int k = 0 ; k < b ; k++) {
					hasil += (matriksA[i][k] * matriksB[k][j]);
				}

				matriksHasil[i][j] = hasil;
				hasil = 0; 
			}
		}



		//#Tampilkan hasil perkalian matriks
		System.out.println("\nHasil perkalian matriks: ");
		for (int i = 0 ; i < a ; i++) {
			for (int j = 0 ; j < c ; j++) {
				System.out.print(matriksHasil[i][j] + "  ");
			}
			System.out.println();
		}




	}
}
import java.util.Scanner;
public class Soal2{
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Masukkan Input");
		int i = read.nextInt();
		int j = read.nextInt();
		int k = read.nextInt();
		int[][] matriksA = new int[i][j];
		int[][] matriksB = new int[j][k];

        //matriks A
        System.out.printf("\nMasukkan elemen Matriks A(%d,%d)\n" , i,j);
		for(int a = 0; a < i; a++){
			for(int b = 0; b < j; b++){
				matriksA[a][b] = read.nextInt();
			}
        }
        
        //matriks B
        System.out.printf("\nMasukkan elemen Matriks B(%d,%d)\n" , j,k);
		for(int b = 0; b < j; b++){
			for(int c = 0; c < k; c++){
				matriksB[b][c] = read.nextInt();
			}
        }
        System.out.printf("\nHasil Perkalian = Matriks C(%d,%d)\n" ,i,k);
		//Perkalian matriks
		for(int a = 0; a < i; a++){
			for(int b = 0; b < k; b++){
				int total = 0;
				for(int c = 0; c < j; c++){
					total = total + matriksA[a][c] * matriksB[c][b];
					//matriksC[a][c] = matriksA[a][b] + matriksB[b][c];
					//total += matriksC[a][c];*/
                }
				System.out.print(total + " ");
			}
			System.out.println();
		}
	}
}
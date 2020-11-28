import java.util.Scanner;

class TPP6Nomor02 {
	public static void main(String[] args) {
		System.out.println("\n-----Program Membuat Matriks Berisi Karakter Unik-----\n");

		//Input string
		System.out.println("Input String: ");
		Scanner obj = new Scanner(System.in);
		String inputString = obj.nextLine();
 
		//Manipulasi string menjadi karakter unik
		String karakterUnik = ""; 
		for (int i = 0 ; i < inputString.length() ; i++ ) {
			if (i%2==0) {
				karakterUnik += inputString.charAt(i);
			} else {
				karakterUnik += Character.codePointAt(inputString,i);
			}
		}

		int suku = (karakterUnik.length()/16)+1;
		int sumSuku = 0; 

		String[][] matriksKarakterUnik = new String[4][4];

		//Mengubah karakter unik menjadi matriks
		for (int i = 0 ; i < 4 ; i++) {
			for (int j = 0 ; j < 4 ; j++) {
				matriksKarakterUnik[i][j] = "";
				for (int k = 0 ; k < suku ; k++) {
					if (sumSuku<karakterUnik.length()) {
						matriksKarakterUnik[i][j] += karakterUnik.charAt(sumSuku);
					} else {
						matriksKarakterUnik[i][j] += "?";
					}
					
					sumSuku++;
				}

			}
		}

		//Menampilkan matriks karakter unik
		System.out.println("\nTampilkan matriks karakter unik: ");
		for (int i = 0 ; i < 4 ; i++ ) {
			for (int j = 0 ; j < 4 ; j++) {
				System.out.print(matriksKarakterUnik[i][j] + "  ");	
			}
			System.out.println();
			
		}

		



	}
}
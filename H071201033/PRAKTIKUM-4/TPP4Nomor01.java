import java.util.Scanner;

class TPP4Nomor01 {
	public static void main(String[] args) {
		System.out.println("\n-----Saling Relatif Prima Satu Sama Lain-----\n");
		//syarat koprima adalah FPB bilangan = 1
		Scanner obj = new Scanner(System.in);

		//#Input paanjang array
		System.out.print("Input panjang array: ");
		int n = obj.nextInt();
		int fpb = 0;

		//#Input isi dari array
		System.out.println("\nInput isi dari array integer: ");
		int[] array = new int[n];

		for (int i = 0 ; i < n ; i++) {
			array[i] = obj.nextInt();
		}

		//#Cetak 2 elemen yang koprima
		System.out.println("\nCetak setiap 2 elemen yang saling prima satu sama lain: ");
		for (int i = 0 ; i < n ; i++) {
			for (int j = (i + 1) ; j < n ; j++) {

				if (array[i]<=array[j]){
					for (int k = 1 ; k <= array[j] ; k++) {
						if (array[i]%k==0 && array[j]%k==0)
							fpb = k;				
					}
						if (fpb == 1) 
							System.out.println(array[i] + " " + array[j]);
						
				} else {
					for (int k = 1 ; k <= array[i] ; k++) {
						if (array[i]%k==0 && array[j]%k==0)
							fpb = k;				
					}
						if (fpb == 1) 
							System.out.println(array[i] + " " + array[j]);
				}
						
							
			}
		}

		
	}
}
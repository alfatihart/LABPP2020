import java.util.Scanner;

class TPP5Nomor01 {
	//Method utama
	public static void main(String[] args) {
		System.out.println("\n-----Menentukan FEB Dua Bilangan-----\n");
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Input 2 bilangan:");
		int m = obj.nextInt();
		int n = obj.nextInt();

		System.out.println("\nFPB dari " + m + " dan " + n + " = " + cariFPB(m, n));
	}

	//Method cariFPB
	static int cariFPB(int m, int n) {
		int fpb = 0;
		if (m <= n) {
			for (int i = 1 ; i <= n ; i++) {
				if (m%i == 0 && n%i == 0) 
					fpb = i;
			}
	
		} else {
			for (int i = 1 ; i <= m; i++) {
				if (m%i == 0 && n%i == 0) 
					fpb = i;
			}
		}
		return fpb;
	}
}
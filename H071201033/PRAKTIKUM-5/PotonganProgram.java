import java.util.Scanner;
import java.util.Random;

class PotonganProgram {
	public static void main(String[] args) {
		System.out.println("\n-----Program Membuat Serial Number-----\n");
		Scanner scanner = new Scanner(System.in);


		System.out.println("Input panjang blok (n) dan digit bilangan (m): ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String serialNumber = generateSerial(n, m);
		System.out.println("\nTampilan serial number: ");
		System.out.println(serialNumber);
	}

	public static String generateSerial(int n, int m) {
		//Lengkapi
		Random random = new Random();
		String str = "";
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < m ; j++) {
				int number = random.nextInt(10);
				str += String.valueOf(number);
			}

			if ((n - 1) > i) 
				str += "-";
				
		}

		return str;
			
	

	}




}
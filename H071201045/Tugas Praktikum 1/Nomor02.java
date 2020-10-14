import java.util.Scanner;

public class Nomor02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int detik;
		int menit;
		int jam;
		
		System.out.print("Masukkan detik : ");
		
		detik = input.nextInt();
		jam = detik/3600;
		menit = (detik%3600)/60;
		detik = detik%60;
		
		System.out.printf(String.format("%02d:%02d:%02d", jam , menit, detik));
		
			
	}

}

// modulos give us the REMAINDER
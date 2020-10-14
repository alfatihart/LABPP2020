import java.util.Scanner;

public class Nomor01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kecepatan : ");
		double v = input.nextInt();
		
		System.out.println("Waktu : ");
		double t = input.nextInt();
		
		double s = v*t;
		double a =(s/14);
		System.out.printf("Bensin yang digunakan = %.3f L", a);
		
		
    }
}

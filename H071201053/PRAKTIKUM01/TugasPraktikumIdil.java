import java.util.Scanner;

public class TugasPraktikumIdil {
	
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		double Jam , Kecepatan , efisiensi = 14;
		
		System.out.println("Masukkan jam dan kecepatan");
	    double jam= x.nextDouble();
	    double kecepatan= x.nextDouble();
		
		double bensin=((jam*kecepatan)/14);
		
		System.out.println("Bensin Yang Digunakan:");
		System.out.printf("%.3f Liter", +bensin);
		
		
		
	}
	
}
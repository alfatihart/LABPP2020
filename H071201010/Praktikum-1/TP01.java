import java.util.Scanner;
	public class TP01{
		public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.print("Masukkan lama waktu yang ditempuh= ");
		double t= x.nextDouble();									// t=waktu
		System.out.print("Masukkan percepatannya= ");									
		double a= x.nextDouble();									// a=percepatan

		 double b;
		 b= t*a/14;													//b=bensin

		 System.out.printf("Bensin yang digunakan= %.3f", b);
		 System.out.println(" L");

		}
			
		}
	

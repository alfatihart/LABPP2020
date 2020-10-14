import java.util.Scanner;
public class TP02{
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.print("Masukkan berapa detik= ");
		int detik= x.nextInt();									
		int s;
		s= (detik%3600)%60;										//s= detik

		int m;
		m= (detik%3600)/60;										//m= menit
		
		int h;
		h=detik/3600;											//h= jam
		System.out.println("jam:menit:detik");

		System.out.printf("%02d", + h);
		System.out.printf(":");
		System.out.printf("%02d", + m);
		System.out.printf(":");
		System.out.printf("%02d", + s);

	}
}
import java.util.Scanner;
public class PraktikumWaktu {
	
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);	
        System.out.println("Masukkan total waktu dalam detik");   
        int totalWaktu = x.nextInt();

        int jam = totalWaktu/3600;
        int menit = ((totalWaktu%3600)/60);
        int detik = totalWaktu%60;
		
		System.out.println("Hasil konversi (jam:menit:detik)");
		System.out.printf(jam + ":" + menit + ":" + detik);
		
		
		
	}
	
}
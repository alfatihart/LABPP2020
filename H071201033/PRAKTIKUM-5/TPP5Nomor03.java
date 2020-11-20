import java.util.Scanner;

class TPP5Nomor03 {
	public static void main(String[] args) {
		System.out.println("\n-----Konversi Hari ke Tahun Bulan dan Hari-----\n");
		Scanner obj = new Scanner(System.in);

		System.out.print("Input umur dalam hari: ");
		int umur = obj.nextInt();

		System.out.println("\nUmur dalam tahun bulan dan tahun: ");
		System.out.println(MyYear(umur) + " tahun");
		System.out.println(MyMonth(umur) + " bulan");
		System.out.println(MyDay(umur) + " hari");


	}

	static int MyYear(int umur) {
		int tahun = umur/365;
		return tahun;

	}

	static int MyMonth(int umur) {
		int bulan = (umur%365)/30;
		return bulan;
		

	}

	static int MyDay(int umur) {
		int hari = ((umur%365)%30);
		return hari;

	}


}
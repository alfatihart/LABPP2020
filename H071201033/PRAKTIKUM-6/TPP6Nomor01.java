import java.util.Scanner;

class TPP6Nomor01 {
	public static void main(String[] args) {
		System.out.println("\n-----Program Membuat Kode Unik-----\n");
		System.out.println("Input Stringg: ");

		//Input string
		Scanner obj = new Scanner(System.in);
		String kalimat = obj.nextLine();


		int panjang = kalimat.length();

		//Konversi ke heksadesimal
		int desimal = panjang*panjang;
		String hex = "";
		while (desimal!=0) {
			int hexValue = desimal%16;
			char hexDigit =(0 <= hexValue && hexValue <= 9)? (char)(hexValue + '0'):(char)(hexValue - 10 + 'a');
			hex = hexDigit+ hex;
			desimal = desimal/16;
  
		}

		
		int length = panjang;
		if (panjang%2==0){
			length = panjang;
		} else {
			length++;
		}

		//Membuat palindrome
		String palindrome =  kalimat.toUpperCase().substring(0, length/2);
		palindrome = palindrome.concat(new StringBuffer(palindrome.substring(0, palindrome.length()-1)).reverse().toString());
		palindrome = palindrome.replaceAll(" ", "");

		//konversi ke oktal
		String octal = "";

			octal += String.valueOf(panjang/8);
			octal += String.valueOf(panjang%8);

		//Tampilkan simbol
		String simbol = "";
		String karakterAwal = hex.substring(0,1);
				if (karakterAwal.equals("0") || karakterAwal.equals("1") || karakterAwal.equals("2") || karakterAwal.equals("3") || karakterAwal.equals("4") || karakterAwal.equals("5") || karakterAwal.equals("6") || karakterAwal.equals("7") || karakterAwal.equals("8") || karakterAwal.equals("9")) {
					simbol = "!";
				} else {
					simbol = "?";
				}	

		
		//Tampilkan kode unik
		System.out.println("\nTampilkan kode unik: ");
		System.out.println("#" + hex + palindrome + octal + simbol);
		
	}
} 
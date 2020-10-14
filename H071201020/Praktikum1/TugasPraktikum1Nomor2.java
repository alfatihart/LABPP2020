import java.util.Scanner;
public class TugasPraktikum1Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah detik yang akan dikonversi :" );
        int n;
        n = input.nextInt();
        
        int jam = n/3600;
        int menit = (n-jam*3600)/60;
        int detik = n-jam*3600-menit*60;

        System.out.print("Maka hasilnya adalah :");
        System.out.printf("%02d:%02d:%02d",jam,menit,detik);
    }
}
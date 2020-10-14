import java.util.Scanner;
class Nomor2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Masukkan Sekon :");
        int s = obj.nextInt();     // s = detik yang diinput
        int jam;
        int menit;
        int detik;

        jam = s / 3600;
        menit = (s % 3600) / 60;
        detik = (s % 3600) % 60;
        System.out.print("Hasil Konversi :");
        System.out.printf("%02d : %02d : %02d", jam , menit, detik);
        
 
    } 
        
    
}
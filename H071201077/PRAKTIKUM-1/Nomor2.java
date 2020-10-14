import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner Waktu = new Scanner (System.in);
        
        int  jam, menit, detik, totaldetik;
        
        System.out.print("Masukan total detik :");
        totaldetik = Waktu.nextInt();
        jam=totaldetik/3600;
        menit=totaldetik%3600/60;
        detik=totaldetik%60;
        System.out.println(jam+" Jam : "+menit+" Menit : "+detik+" Detik");
    }
}

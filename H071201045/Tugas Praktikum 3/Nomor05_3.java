package tugaspraktikum3;
import java.util.Scanner;

public class Nomor05_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1 hari = 360*
        // hh:mm:ss
        // 1 derajat = 4 menit -- 1 jam = 6 lewat 4 menit -- detik =240 
        // 24 jam = 24*3600 detik
        // 1 derajat = 240 detik
           
        int jam = 0;
        int menit = 0;
        int detik = 0;
        int detik1;
        

        while(input.hasNext()) {
           float m = input.nextFloat();
            
                if (m >= 0 && m < 360) {
                     
                    detik1 = (int) m*240;
                    
                     jam = detik1/3600;
                     menit = (detik%3600)/60;
                     detik =  detik%60;
                     jam += 6;

                     if (jam >= 24)
                        jam -= 24;

                    if (jam<11) {
                        System.out.println("Selamat Siang!");
                        System.out.printf("%02d : %02d : %02d", jam, menit, detik);
                    }
                    else if (jam<15) {
                        System.out.println("Selamat Sore!");
                        System.out.printf("%02d : %02d : %02d", jam, menit, detik);
                    }
                    else if (jam<7) {
                        System.out.println("Selamat sore!");
                        System.out.printf("%02d : %02d : %02d", jam, menit, detik);
                    }
                    else {
                        System.out.println("Selamat malam!");
                        System.out.printf("%02d : %02d : %02d", jam, menit, detik);
                    }
                } else {
                    System.out.println("Masukkan derajat dengan benar!");
                }   
        
        }
    
    }
}

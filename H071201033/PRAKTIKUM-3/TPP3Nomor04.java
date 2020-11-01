import java.util.Scanner;

public class TPP3Nomor04 {
    public static void main(String[] args) {

        Scanner Kembalian = new Scanner(System.in);
        System.out.println("\n-------------Menghitung Kembalian-------------\n");
        System.out.println("Masukkan harga barang dan uang yang dibayarkan!");

        int harga = Kembalian.nextInt();
        int uang = Kembalian.nextInt();

        int kembalian = (uang - harga);
        int kurang = (harga - uang);
        
        int seratus = 0, limaPuluh = 0, duaPuluh = 0, sepuluh = 0, limaRibu = 0, duaRibu = 0, seribu = 0, kembalianSisa = 0; 

            if (harga<=uang) {
                if (harga==uang)
                System.out.println("\nUang anda pas, tidak lebih dan tidak kurang");
                System.out.println("\nPecahan uang kembalian sebagai berikut:");

                while(kembalian > 0) {
                    if(kembalian >= 100000) {
                        kembalian -= 100000;
                        seratus++;
                    } else if(kembalian >= 50000){
                        kembalian -= 50000;
                        limaPuluh++; 
                    } else if(kembalian >= 20000) {
                        kembalian -= 20000;
                        duaPuluh++;
                    } else if(kembalian >= 10000) {
                        kembalian -= 10000;
                        sepuluh++;
                    } else if(kembalian >= 5000) {
                        kembalian -= 5000;
                        limaRibu++;
                    } else if(kembalian >= 2000) {
                        kembalian -= 2000;
                        duaRibu++;
                    } else if (kembalian >= 1000) {
                        kembalian -= 1000;    
                        seribu++;
                    } else {
                        kembalianSisa = kembalian;
                        kembalian = 0;
                    }
                }
                System.out.println(seratus + " uang Rp100.000");
                System.out.println(limaPuluh + " uang Rp50.000");
                System.out.println(duaPuluh + " uang Rp20.000");
                System.out.println(sepuluh+" uang Rp10.000");
                System.out.println(limaRibu+" uang Rp5.000");
                System.out.println(duaRibu+" uang Rp2.000");
                System.out.println(seribu+" uang Rp1.000");
                System.out.println("uang receh Rp" + kembalianSisa + "\n");
            } else {
            System.out.println("\nMohon maaf uang anda kurang. Mohon menambah uang sebesar Rp" + kurang + "!\n");
            }
    }
    
}

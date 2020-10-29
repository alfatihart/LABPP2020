package tugaspraktikum3;
import java.util.Scanner;

public class Nomor04_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // mencari kembalian
        int hargabarang = input.nextInt(); 
        int nilaiuang = input.nextInt();
        int kembalian = nilaiuang - hargabarang;
        int seratus = 0;
        int limapuluh = 0;
        int duapuluh = 0;
        int sepuluh = 0;
        int limaribu = 0;
        int duaribu = 0;
        int seribu = 0;

        if (hargabarang<=nilaiuang) {
            while(kembalian > 0) {
            if (kembalian-100000>=0){
                kembalian -= 100000;
                seratus++; }
            else if (kembalian-50000>=0){
                kembalian -= 50000;
                limapuluh++; }
            else if (kembalian-20000>=0){
                kembalian -= 20000;
                duapuluh++; }
            else if (kembalian-10000>=0){
                kembalian -= 10000;
                sepuluh++; }    
            else if (kembalian-5000>=0) {
                kembalian -= 50000;
                limaribu++; }
            else if (kembalian-2000>=0) {
                kembalian -= 2000;
                duaribu++; }
            else if (kembalian-1000>=0) {
                kembalian -= 1000;
                seribu++; }
            }
          System.out.println(seratus + " uang Rp100.000");

          System.out.println(limapuluh + " uang Rp50.000");

          System.out.println(duapuluh + " uang Rp20.000");

          System.out.println(sepuluh + " uang Rp10.000");

          System.out.println(limaribu + " uang Rp5.000");

          System.out.println(duaribu + " uang Rp2.000");

          System.out.println(seribu + " uang Rp1.000");
        } else {
            System.out.println("uang tidak cukup");
        }
    }
}

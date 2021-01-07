package Pratikum3;
import java.util.Scanner;
public class Nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah pembelian");
        int a = input.nextInt();
        System.out.println("Masukkan jumlah pembayaran");
        int b = input.nextInt();
        int sisa,i,jumlah;
        int t=0;

        sisa = b - a;
        for (i=1;i<=7;i++){
            switch (i){
                case 1 :
                    jumlah = sisa / 100000;
                    System.out.println(jumlah+ " " + " uang Rp.100000 ");
                    t=sisa - (jumlah*100000);
                break;
                case 2 : jumlah = t / 50000;
                    System.out.println(jumlah+ " " + " uang Rp.50000 ");
                    t=t-(jumlah*50000);
                break;
                case 3 : jumlah = t / 20000;
                    System.out.println(jumlah+ " " + " uang Rp.20000 ");
                    t=t-(jumlah*20000);
                break;
                case 4 : jumlah = t / 10000;
                    System.out.println(jumlah+ " " + " uang Rp.10000 ");
                    t=t-(jumlah*10000);
                break;
                case 5 : jumlah = t / 5000;
                    System.out.println(jumlah+ " " + " uang Rp.5000 ");
                    t=t-(jumlah*5000);
                break;
                case 6 : jumlah = t / 2000;
                    System.out.println(jumlah+ " " + " uang Rp.2000 ");
                    t=t-(jumlah*2000);
                break;
                case 7 : jumlah = t / 1000;
                    System.out.println(jumlah+ " " + " uang Rp.1000 ");
                    t=t-(jumlah*1000);
                break;
                
            }

            
        }
    }
}

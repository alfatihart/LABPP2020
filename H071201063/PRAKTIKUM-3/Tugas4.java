import java.util.Scanner;
class Tugas4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("*************Selamat datang*************");
        System.out.println("***Masukan harga barang dan uang anda***");
        int harga = x.nextInt();
        int uang = x.nextInt();
        int total = uang - harga;
        
        do{
            int jumlah1 = total/100000;
            total-= jumlah1*100000;
            
            int jumlah2 = total/50000;
            total-= jumlah2*50000;

            int jumlah3 = total/20000;
            total-= jumlah3*20000;
            
            int jumlah4 =  total/10000;
            total-= jumlah4*10000;

            int jumlah5 = total/5000;
            total-= jumlah5*5000;

            int jumlah6 = total/2000;
            total-= jumlah6*2000;

            int jumlah7 = total/1000;
            total-= jumlah7*1000;

            System.out.println(jumlah1 + " uang Rp. 100.000");
            System.out.println(jumlah2 + " uang Rp. 50.000");
            System.out.println(jumlah3 + " uang Rp. 20.000");
            System.out.println(jumlah4 + " uang Rp. 10.000");
            System.out.println(jumlah5 + " uang Rp. 5.000");
            System.out.println(jumlah6 + " uang Rp. 2.000");
            System.out.println(jumlah7 + " uang Rp. 1.000");
        }while(total > 0);
        x.close();
    }
}
import java.util.Scanner;
public class TPP3Nomor05 {


    public static void main(String[] args) {
        // 1 hari = 24 jam
        // 24 jam = 24(3600) detik
        // mis : 24(3600) detik = 360 derajat
        // 1 derajat = 240 detik
        
        System.out.println("\n------------Mengonversi derajat ke dalam waktu-------------\n");
        Scanner scan = new Scanner(System.in);
       

        System.out.println("Masukkan posisi matahari atau bulan dalam satuan derajat!");

        while (scan.hasNextFloat()) {
           
            float derajat = scan.nextFloat();
            
            int waktu = (int)(derajat * 240);

            int jam, sisaJam, menit, sisaMenit, detik;

            jam = (6 + (waktu/3600));
            sisaJam = (waktu%3600);
            menit = (sisaJam/60);
            sisaMenit = (sisaJam%60);
            detik = (sisaMenit);

            if (0 <= derajat && derajat < 360) {
                if (jam >= 24)
                    jam = (jam - 24);
               
                if (0 <= jam && jam < 12) {
                    System.out.println("Selamat Pagi");
                } else if (12 <= jam && jam < 15) {
                    System.out.println("Selamat Siang"); 
                } else if (15 <= jam && jam < 18) {
                    System.out.println("Selamat Sore");
                } else if (18 <= jam && jam < 24) {
                    System.out.println("Selamat Malam");
                }                    
            System.out.println(String.format("%02d", jam) + ":" + String.format("%02d", menit) + ":" + String.format("%02d" , detik));
            

        } else {
            System.out.println("Inputan invalid, mohon masukkan inputan 0<=derajat<360!\n");
        }
        

        } 
        scan.close();
        System.out.println("\nEnd of file\n");
    }

    
    


}

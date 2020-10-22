import java.util.Scanner;

public class TPP2Nomor02 {

    public static void main(String[] args) {
        Scanner bangun = new Scanner(System.in);
        System.out.println("\n------------------Menu Utama--------------------");
        System.out.println("Silahkan memilih program yang ingin Anda gunakan:");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.print("\nMasukkan nomor program yang anda pilih = ");
        int umum = bangun.nextInt();

        if ( umum == 1){
            System.out.println("\n-------------------Menu Pilihan--------------------");
            System.out.println("Silahkan memilih bangun datar:");
            System.out.println("1. Segitiga");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Jajar Genjang");
            System.out.println("5. Trapesium");
            System.out.println("6. Belah Ketupat");
            System.out.println("7. Layang-Layang");
            System.out.println("8. Lingkaran");

            System.out.print("\nMasukkan nomor bangun datar yang anda pilih = ");
            int pilihan1 = bangun.nextInt();
            
            switch (pilihan1) {
                case 1:
                System.out.print("Masukkan alas dan tinggi segitiga = ");
                int alas = bangun.nextInt();
                int tinggi = bangun.nextInt();

                float luas = (((float)alas*tinggi)/2);
                System.out.println("Luas segitiga = " + String.format("%.2f", luas));
                break;
                
                case 2:
                System.out.print("Masukkan panjang sisi persegi = ");
                int sisi = bangun.nextInt();
              

                luas = (sisi*sisi);
                System.out.println("Luas persegi = " + luas);
                break;

                case 3:
                System.out.print("Masukkan panjang dan lebar persegi panjang = ");
                int panjang = bangun.nextInt();
                int lebar = bangun.nextInt();

                luas = (panjang*lebar);
                System.out.println("Luas persegi Panjang = " + luas);
                break;

                case 4:
                System.out.print("Masukkan alas dan tinggi jajar genjang = ");
                alas = bangun.nextInt();
                tinggi = bangun.nextInt();

                luas = (alas*tinggi);
                System.out.println("Luas Jajar Genjang = " + luas);
                break;

                case 5:
                System.out.print("Masukkan panjang dua sisi sejajar dan tinggi trapesium = ");
                sisi = bangun.nextInt();
                int sisi2 = bangun.nextInt();
                tinggi = bangun.nextInt();

                luas = (((float)(sisi+sisi2)*tinggi)/2);
                System.out.println("Luas trapesium = " + String.format("%.2f", luas));
                break;

                case 6:
                System.out.print("Masukkan panjang diagonal1 dan diagonal2 belah ketupat = ");
                int diagonal1 = bangun.nextInt();
                int diagonal2 = bangun.nextInt();
                
                luas = (((float)diagonal1*diagonal2)/2);
                System.out.println("Luas belah ketupat = " + String.format("%.2f", luas));
                break;

                case 7:
                System.out.print("Masukkan panjang diagonal1 dan diagonal2 layang-layang = ");
                diagonal1 = bangun.nextInt();
                diagonal2 = bangun.nextInt();
                
                luas = (((float)diagonal1*diagonal2)/2);
                System.out.println("Luas layang-layang = " + String.format("%.2f", luas));
                break;

                case 8:
                System.out.print("Masukkan jari-jari lingkaran = ");
                int jari_jari = bangun.nextInt();
                
                luas = ((float)22/7*jari_jari*jari_jari);
                System.out.println("Luas lingkaran = " + String.format("%.2f", luas));
                break;

                default:
                System.out.println("Nomor bangun datar tidak ditemukan, mohon masukkan nomor bangun datar dengan benar"); 
                break;            

            }

        } else if ( umum == 2){
            System.out.println("\n-------------------Menu Pilihan--------------------");
            System.out.println("Silahkan memilih bangun ruang:");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Kerucut");
            System.out.println("4. Tabung");
            System.out.println("5. Bola");
            

            System.out.print("\nMasukkan nomor bangun ruang yang anda pilih = ");
            int pilihan2 = bangun.nextInt();

            switch (pilihan2){
            case 1:
            System.out.print("Masukkan panjang rusuk kubus = ");
            int rusuk = bangun.nextInt();

            float volume = (rusuk*rusuk*rusuk);
            System.out.println("Volume kubus = " +  volume);
            break;
            
            case 2:
            System.out.print("Masukkan panjang, lebar, dan tinggi balok ");
            int panjang = bangun.nextInt();
            int lebar = bangun.nextInt();
            int tinggi = bangun.nextInt();

            volume = (panjang*lebar*tinggi);
            System.out.println("Volume balok = " + volume);
            break;

            case 3:
            System.out.print("Masukkan jari-jari alas dan tinggi kerucut");
            int jari = bangun.nextInt();
            tinggi = bangun.nextInt();

            volume = ((float)(3.14*jari*jari*tinggi)/3);
            System.out.println("Volume kerucut = " + String.format("%.2f", volume));
            break;

            case 4:
            System.out.print("Masukkan jari-jari alas dan tinggi tabung = ");
            jari = bangun.nextInt();
            tinggi = bangun.nextInt();

            volume = ((float)3.14*jari*jari*tinggi);
            System.out.println("Volume tabung = " + String.format("%.2f", volume));
            break;

            case 5:
            System.out.print("Masukkan jari-jari bola = ");
            jari = bangun.nextInt();

            double volumed = ((double)4*(3.14*jari*jari*jari)/3);
            System.out.println("Luas trapesium = " + String.format("%.2f", volumed));
            break;

            default:
            System.out.println("Nomor bangun ruang tidak ditemukan, mohon masukkan nomor bangun ruang dengan benar");
            break;
        }

     } else {
        System.out.println("Nomor program tidak ditemukan, mohon masukkan nomor program dengan benar");
    }
    System.out.print("\n");
    
}

}

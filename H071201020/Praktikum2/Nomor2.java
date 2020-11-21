import java.util.Scanner;

class Nomor2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Menu :");
        System.out.println("1.Luas bangun datar");
        System.out.println("2.Volume bangun Ruang");
        System.out.println("Masukkan angka yang akan dipilih :");
        int menu = x.nextInt();
        int tinggi, alas, jariJari;
        double phi = 3.14;
        switch (menu) {
            case 1 :
            System.out.println("Pilih bangun datar :");
            System.out.println("1.Persegi");
            System.out.println("2. Persegi panjang");
            System.out.println("3.Segitiga");
            System.out.println("4.Lingkaran");
            System.out.println("5.Jajar genjang");
            System.out.println("6.Trapesium");
            System.out.println("7.Belah ketupat");
            System.out.println("8.Layang - layang");
            
            int Bangun = x.nextInt();
            switch (Bangun) {
                case 1 :
                System.out.println("Panjang sisi :");
                int sisi = x.nextInt();
                double luasPersegi = sisi * sisi;
                System.out.println( "Luas persegi" +  luasPersegi);
                break;
                case 2 :
                System.out.println("Panjang :");
                int panjang = x.nextInt();
                System.out.println("Lebar :");
                int lebar = x.nextInt();
                double luasPersegiPanjang = panjang * lebar;
                System.out.println("Luas persegi panjang :" + luasPersegiPanjang);
                break;
                case 3 :
                System.out.println("Alas :");
                alas = x.nextInt();
                System.out.println("Tinggi :");
                tinggi = x.nextInt();
                double luasSegitiga = (alas * tinggi) / 2;
                System.out.println("Luas segitiga :" + luasSegitiga );
                break;
                case 4 :
                System.out.println("Jari jari");
                jariJari = x.nextInt();
                phi = 3.14;
                double luasLingkaran = phi * jariJari * jariJari ; 
                System.out.println("Luas lingkaran :" + luasLingkaran);
                break;
                case 5 :
                System.out.println("Alas :");
                alas = x.nextInt();
                System.out.println("Tinggi :");
                tinggi = x.nextInt();
                double luasJajarGenjang = alas*tinggi;
                System.out.println("Luas jajargenjang :" + luasJajarGenjang);
                break;
                case 6 :
                System.out.println("Sisi Atas :");
                int atas = x.nextInt();
                System.out.println("Sisi bawah :");
                int bawah = x.nextInt();
                System.out.println("Tinggi :");
                tinggi = x.nextInt();
                double luasTrapesium = (atas+bawah) * 1/2 * tinggi;
                System.out.println("Luas Trapesium :" + luasTrapesium);
                break;
                case 7 :
                System.out.println("Diagonal 1 :");
                int diagonal1 = x.nextInt();
                System.out.println("Diagonal 2 :");
                int diagonal2 = x.nextInt();
                double luasBelahKetupat = (diagonal1 / diagonal2) / 2;
                System.out.println("Luas belah ketupat :" + luasBelahKetupat);
                break;
                case 8 :
                System.out.println("Diagonal 1 :");
                int d1 = x.nextInt();
                System.out.println("Diagonal 2 :");
                int d2 = x.nextInt();
                double luasLayangLayang = (d1 * d2) / 2;
                System.out.println("Luas layang layang" + luasLayangLayang);
                break;

                default :
                System.out.println("Inputan tidak valid");
                break;
            }
                break;
                case 2 :
                System.out.println("Pilih bangun ruang :");
                System.out.println("1.Bola");
                System.out.println("2.Kubus");
                System.out.println("3.Prisma segitiga");
                System.out.println("4.Balok");
                System.out.println("5.Tabung");
                System.out.println("6.Kerucut");
                
                int BangunRuang = x.nextInt();
                switch (BangunRuang) {
                case 1 :
                System.out.println("Jari jari :");
                jariJari = x.nextInt();
                System.out.println("phi :");
                phi = 3.14;
                double volumeBola = 4 * phi * jariJari *jariJari * jariJari / 3;
                System.out.println("Volume bola : " + volumeBola);
                break;
                case 2 :
                System.out.println("Sisi :");
                int sisi = x.nextInt();
                double volumeKubus = sisi * sisi * sisi;
                System.out.println("Volume kubus :" + volumeKubus);
                break;
                case 3 :
                System.out.println("Luas alas :");
                int luasalas = x.nextInt();
                System.out.println("Tinggi :");
                tinggi = x.nextInt();
                double volumePrismaSegitiga = luasalas * tinggi;
                System.out.println("Volume prisma segitiga :" +volumePrismaSegitiga);
                break;
                case 4 :
                System.out.println("Panjang :");
                int panjang = x.nextInt();
                System.out.println("Lebar :");
                int lebar = x.nextInt();
                System.out.println("Tinggi :");
                tinggi = x.nextInt();
                double volumeBalok = panjang * lebar * tinggi;
                System.out.println("Volume balok :" + volumeBalok);
                break;
                case 5 :
                System.out.println("Jari jari :");
                jariJari = x.nextInt();
                System.out.println("Tinggi :");
                tinggi = x.nextInt();
                phi = x.nextDouble();
                double volumeTabung = phi * jariJari * jariJari * tinggi;
                System.out.println("Volume balok :" + volumeTabung);
                break;
                case 6 :
                System.out.println("Jari jari :");
                jariJari = x.nextInt();
                System.out.println("Tinggi :");
                tinggi = x.nextInt();
                phi = x.nextDouble();
                double volumeKerucut = 1 * phi * jariJari *jariJari * tinggi;
                System.out.println("Volume kerucut :" + volumeKerucut);
                break;

                default :
                System.out.println("Inputan tidak valid");
                break;
              
                
                 
                }


            }


        }
    }


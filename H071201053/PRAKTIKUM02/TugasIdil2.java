import java.util.Scanner;
public class TugasIdil2 {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        System.out.println("** MENU **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("");
        System.out.println("Input Angka Sesuai Dengan Menu Yang Diinginkan :");
        int b = baca.nextInt();
        System.out.println("");
            if (b == 1) {
                System.out.println("** Pilih Bangun Datar **");
                System.out.printf("1.Persegi\n2.Lingkaran\n3.Segitiga\n");
                System.out.println("");
                System.out.println("Input Angka Sesuai Dengan Bangun Datar Yang Diinginkan :");
                int bangunDatar = baca.nextInt();
                System.out.println("");
                if (bangunDatar == 1){
                    System.out.println("Input Panjang");
                    double panjang = baca.nextDouble();
                    System.out.println("Input Lebar");
                    double lebar = baca.nextDouble();
                    double luasPersegi = (panjang*lebar);
                    System.out.printf("Luas persegi panjang = %.2f" ,luasPersegi);
                }else if (bangunDatar ==2){
                    System.out.println("Input jari-jari lingkaran");
                    double r = baca.nextDouble();
                    double luasLingkaran = ((Math.PI)*(Math.pow(r, 2)));
                    System.out.printf("Luas Lingkaran = %.2f" ,luasLingkaran);
                }else if (bangunDatar == 3){
                    System.out.println("Input Alas");
                    double a = baca.nextDouble();
                    System.out.println("Input Tinggi");
                    double tinggi = baca.nextDouble();
                    double luasSegitiga = ((a*tinggi)/2);
                    System.out.printf("Luas Segitiga = %.2f" ,luasSegitiga);
                }else {
                    System.out.println("Masukan Salah");
                }
            }else if (b == 2){
                System.out.println("** Pilih Bangun Ruang **");
                System.out.printf("1.Kubus\n2.Kerucut\n3.Bola\n");
                System.out.println(" ");
                System.out.println("Input Angka Sesuai Dengan Bangun Ruang Yang Diinginkan :");
                int bangunRuang = baca.nextInt();
                System.out.println("");
                if (bangunRuang == 1){
                    System.out.println("Masukkan Sisi");
                    double s = baca.nextDouble();
                    double volumeKerucut = Math.pow(s, 3);
                    System.out.printf("Volume Persegi = %.2f" ,volumeKerucut);
                }else if (bangunRuang == 2){
                    System.out.println("Masukkan Tinggi");
                    double tinggiKerucut = baca.nextDouble();
                    System.out.println("Masukkan Jari-Jari Lingkaran Alas");
                    double rKerucut = baca.nextDouble();
                    double volumeKerucut = ((Math.PI*rKerucut*rKerucut*tinggiKerucut)/3);
                    System.out.printf("Volume Kerucut = %.2f" ,volumeKerucut);
                }else if (bangunRuang == 3){
                    System.out.println("Masukkan Jari-Jari Bola");
                    double rBola = baca.nextDouble();
                    double volumeBola = ((4*(Math.PI)*(Math.pow(rBola, 3)))/3);
                    System.out.printf("Volume Bola = %.2f" ,volumeBola);
                }else {
                    System.out.println("Masukan Salah");
                }
            }else {
                System.out.println("Masukan Salah");
            }
        baca.close();
    }
}

import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("** MENU **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("");
        System.out.println("Input Angka Sesuai Dengan Menu Yang Diinginkan :");
        int b = read.nextInt();
        System.out.println("");

            if (b == 1) {
                System.out.println("** Pilih Bangun Datar **");
                System.out.printf("1.Persegi Panjang\n2.Segitiga\n3.Lingkaran\n");
                System.out.println("");
                System.out.println("Input Angka Sesuai Dengan Bangun Datar Yang Diinginkan :");
                int bd = read.nextInt();
                System.out.println("");
                if (bd == 1){
                    System.out.println("Input Panjang");
                    double pp = read.nextDouble();
                    System.out.println("Input Lebar");
                    double lp = read.nextDouble();
                    double luasp = (pp*lp);
                    System.out.printf("Luas persegi panjang = %.1f" ,luasp);
                }else if (bd ==2){
                    System.out.println("Input Alas");
                    double a = read.nextDouble();
                    System.out.println("Input Tinggi");
                    double t = read.nextDouble();
                    double luass = ((a*t)/2);
                    System.out.printf("Luas Segitiga = %.1f" ,luass);
                }else if (bd == 3){
                    System.out.println("Input jari-jari lingkaran");
                    double r = read.nextDouble();
                    double luasl = ((Math.PI)*r*r);
                    System.out.printf("Luas Lingkaran = %.1f" ,luasl);
                }else {
                    System.out.println("Inputan Salah");
                }
            }else if (b == 2){
                System.out.println("** Pilih Bangun Ruang **");
                System.out.printf("1.Kubus\n2.Kerucut\n3.Bola\n");
                System.out.println(" ");
                System.out.println("Input Angka Sesuai Dengan Bangun Ruang Yang Diinginkan :");
                int br = read.nextInt();
                System.out.println("");
                if (br == 1){
                    System.out.println("Masukkan Sisi");
                    double s = read.nextDouble();
                    double vk = Math.pow(s, 3);
                    System.out.printf("Volume Persegi = %.1f" ,vk);
                }else if (br == 2){
                    System.out.println("Masukkan Tinggi");
                    double tk = read.nextDouble();
                    System.out.println("Masukkan Jari-Jari Lingkaran Alas");
                    double rk = read.nextDouble();
                    double vkc = ((Math.PI*rk*rk*tk)/3);
                    System.out.printf("Volume Kerucut = %.1f" ,vkc);
                }else if (br == 3){
                    System.out.println("Masukkan Jari-Jari Bola");
                    double rb = read.nextDouble();
                    double vb = ((4*(Math.PI)*(Math.pow(rb, 3)))/3);
                    System.out.printf("Volume Bola = %.1f" ,vb);
                }else {
                    System.out.println("Inputan Salah");
                }
            }else {
                System.out.println("Inputan Salah");
            }
        read.close();
    }
}

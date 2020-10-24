import java.util.Scanner;

public class Tpp04 {
    public static void main(String[] args) {
        Scanner woi = new Scanner(System.in);
        System.out.println("**Menu**");
        System.out.println("1.Mencari Luas Bangun Datar");
        System.out.println("2.Mencari Volume Bangun Ruang");
        System.out.println("Input Angka Sesuai Dengan Menu Yang diinginkan : ");

        int a = woi.nextInt();
        if(a==1){
            System.out.println("** Pilih Bangun Datar **");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar Genjang");
            System.out.println("6. Trapesium");
            System.out.println("7. Belah Ketupat");
            System.out.println("8. Layang - Layang");
            System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan : ");
            int x  = woi.nextInt();
            if (x==1){
                System.out.println("Input Sisi");
                double q = woi.nextDouble();
                double L = q*q;
                System.out.println("Luas Persegi = " + L);
            }else if (x==2){
                System.out.println("Input Panjang");
                double w = woi.nextDouble();
                System.out.println("Input Lebar");
                double e = woi.nextDouble();
                double L = w*e;
                System.out.println("Luas Persegi Panjang = " + L);
            }else if (x==3){
                System.out.println("Input Alas");
                double r = woi.nextDouble();
                System.out.println("Input Tinggi");
                double t = woi.nextDouble();
                double L = (double) (r*t)/2;
                System.out.println("Luas Segitiga = " + L);
            }else if (x==4){
                System.out.println("Input Jari - Jari");
                double u = woi.nextDouble();
                double L = Math.PI*u*u;
                System.out.printf("Luas Lingkaran = " + L);
            }else if (x==5){
                System.out.println("Input alas");
                double i = woi.nextDouble();
                System.out.println("Input Tinggi");
                double o = woi.nextDouble();
                double L = i*o;
                System.out.println("Luas Jajar Genjang = " + L);
            }else if (x==6){
                System.out.println("Input Sisi AB");
                double p = woi.nextDouble();
                System.out.println("Input Sisi DC");
                double s = woi.nextDouble();
                System.out.println("Input Tinggi");
                double d = woi.nextDouble();
                double L = ((p+s)*d)/2;
                System.out.println("Luas Trapesium = " + L);
            }else if (x==7){
                System.out.println("Input Diagonal 1");
                double f = woi.nextDouble();
                System.out.println("Input Diagonal 2");
                double g = woi.nextDouble();
                double L = (f*g)/2;
                System.out.println("Luas Belah Ketupat = " + L);
            }else if (x==8){
                System.out.println("Input Diagonal 1");
                double h = woi.nextDouble();
                System.out.println("Input Diagonal 2");
                double j = woi.nextDouble();
                double L = (h*j)/2;
                System.out.println("Luas Layang - Layang = " + L);
            }
        }else if (a==2){
            System.out.println("** Pilih Bangun Ruang **");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Limas");
            System.out.println("4. Prisma");
            System.out.println("5. Tabung");
            System.out.println("6. Kerucut");
            System.out.println("7. Bola");
            System.out.println("Input angka sesuai dengan nomor bangun ruang yang diinginkan : ");
            int y = woi.nextInt();
            if (y==1){
                System.out.println("Input Sisi");
                double a1 = woi.nextDouble();
                double L = a1*a1*a1;
                System.out.println("Volume Kubus = " + L); 
            }else if (y==2){
                System.out.println("Input Panjang");
                double b1 = woi.nextDouble();
                System.out.println("Input Lebar");
                double b2 = woi.nextDouble();
                System.out.println("Input Tinggi");
                double b3 = woi.nextDouble();
                double L = b1*b2*b3;
                System.out.println("Volume Balok = " + L);
            }else if (y==3){
                System.out.println("Input Luas alas");
                double c1 = woi.nextDouble();
                System.out.println("Input Tinggi");
                double c2 = woi.nextDouble();
                double L = (c1*c2)/3;
                System.out.println("Volume Limas = " + L);
            }else if (y==4){
                System.out.println("Input Luas alas");
                double d1 = woi.nextDouble();
                System.out.println("Input Luas Selimut");
                double d2 = woi.nextDouble();
                double L = (d1+d2)*2;
                System.out.println("Volume Prisma = " + L);
            }else if (y==5){
                System.out.println("Input Jari - Jari");
                double e1 = woi.nextDouble();
                System.out.println("Input Tinggi");
                double e2 = woi.nextDouble();
                double L = Math.PI*e1*e1*e2;
                System.out.println("Volume Tabung = " + L);
            }else if (y==6){
                System.out.println("Input Jari - Jari ");
                double f1 = woi.nextDouble();
                System.out.println("Input Tinggi");
                double f2 = woi.nextDouble();
                double L = (Math.PI*f1*f1*f2)/3;
                System.out.println("Volume Kerucut = " + L);
            }else if (y==7){
                System.out.println("Input Jari - Jari");
                double g = woi.nextDouble();
                double L = (Math.PI*g*g*g)*4/3;
                System.out.println("Volume Bola = " + L);
            }
        }
    }
    
}

import java.util.*;
public class TP02 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.printf("2. Mencari Volume Bangun Ruang\n\n");

        double luas, volume;

        System.out.print("Input angka sesuai dengan Menu Yang diinginkan: ");
        int pilihan= input.nextInt();

        switch(pilihan){
            case 1:{
                System.out.println("** Pilih Bangun Datar **");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("5. Jajar Genjang");
                System.out.println("6. Trapesium");
                System.out.println("7. Bela Ketupat");
                System.out.printf("8. Layang-layang\n\n");
                
                System.out.print("Input angka sesuai dengan nomor bangun datar yang diinginkan: ");
                int pilihan2 = input.nextInt();
                switch(pilihan2){
                    case 1:{
                        System.out.print("Input sisi pertama: ");
                        double sisi1= input.nextDouble();
                        System.out.print("Input sisi kedua: ");
                        double sisi2= input.nextDouble();

                        luas= sisi1*sisi2;
                        int pembulatan = 1;
                        double temp = Math.pow(10, pembulatan);
                        double p = (double)Math.round(luas*temp)/temp;

                        System.out.println("Luas Persegi: "+p);
                        break;

                    }case 2:{
                        System.out.print("Input Panjang: ");
                        double panjang= input.nextDouble();
                        System.out.print("Input Lebar: ");
                        double lebar= input.nextDouble();

                        luas= panjang*lebar;
                        int pembulatan = 1;
                        double temp = Math.pow(10, pembulatan);
                        double p = (double)Math.round(luas*temp)/temp;

                        System.out.println("Luas Persegi Panjang: "+p);
                        break;

                    }case 3:{
                        System.out.print("Input Alas: ");
                        double a= input.nextDouble();
                        System.out.print("Input Tinggi: ");
                        double t= input.nextDouble();

                        luas= a*t/2;
                        int pembulatan = 1;
                        double temp = Math.pow(10, pembulatan);
                        double p = (double)Math.round(luas*temp)/temp;

                        System.out.println("Luas Segitiga: "+p);
                        break;

                    }case 4:{
                        System.out.print("Input Jari-jari: ");
                        double r= input.nextDouble();

                        luas= 3.141259266*r*r;
                        int pembulatan = 1;
                        double temp = Math.pow(10, pembulatan);
                        double p = (double)Math.round(luas*temp)/temp;

                        System.out.println("Luas Lingkaran: "+p);
                        break;

                    }case 5:{
                        System.out.print("Input Alas: ");
                        double a= input.nextDouble();
                        System.out.print("Input Tinggi: ");
                        double t= input.nextDouble();

                        luas= a*t;
                        int pembulatan = 1;
                        double temp = Math.pow(10, pembulatan);
                        double p = (double)Math.round(luas*temp)/temp;

                        System.out.println("Luas Jajar Genjang: "+p);
                        break;

                    }case 6:{
                        System.out.print("Input Sisi Atas: ");
                        double a= input.nextDouble();
                        System.out.print("Input Sisi Bawah: ");
                        double b= input.nextDouble();
                        System.out.print("Input Tinggi: ");
                        double t= input.nextDouble();
                        

                        luas= (a+b)*t/2;
                        int pembulatan = 1;
                        double temp = Math.pow(10, pembulatan);
                        double p = (double)Math.round(luas*temp)/temp;

                        System.out.println("Luas Trapesium: "+p);
                        break;

                    }case 7:{
                        System.out.print("Input Diagonal Pertama: ");
                        double d1= input.nextDouble();
                        System.out.print("Input Diagonal Kedua: ");
                        double d2= input.nextDouble();

                        luas= d1*d2/2;
                        int pembulatan = 1;
                        double temp = Math.pow(10, pembulatan);
                        double p = (double)Math.round(luas*temp)/temp;

                        System.out.println("Luas Belah Ketupat: "+p);
                        break;

                    }case 8:{
                        System.out.print("Input Diagonal Pertama: ");
                        double d1= input.nextDouble();
                        System.out.print("Input Diagonal Kedua: ");
                        double d2= input.nextDouble();

                        luas= d1*d2/2;
                        int pembulatan = 1;
                        double temp = Math.pow(10, pembulatan);
                        double p = (double)Math.round(luas*temp)/temp;

                        System.out.println("Luas Layang-layang: "+p);
                        break;
                    }
                }
                break;

            }case 2:{
                System.out.println("** Pilih Bangun Ruang **");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Kerucut Lingkaran");
                System.out.println("4. Bola");
                System.out.println("5. Prisma Segitiga");
                System.out.println("6. Limas Segitiga");
                System.out.println("7. Tabung Lingkaran\n\n");

                System.out.print("Input angka sesuai dengan Menu Yang diinginkan: ");
                int pilihan3= input.nextInt();

                switch(pilihan3){
                    case 1:{
                        System.out.print("Input sisi pertama: ");
                        double sisi1= input.nextDouble();
                        System.out.print("Input sisi kedua: ");
                        double sisi2= input.nextDouble();
                        System.out.print("Input sisi ketiga: ");
                        double sisi3= input.nextDouble();

                        volume= sisi1*sisi2*sisi3;
                        int pembulatan = 1;
                        double temp = Math.pow(10, pembulatan);
                        double a = (double)Math.round(volume*temp)/temp;

                        System.out.println("Volume Kubus: "+a);
                        break;

                    }case 2:{
                        System.out.print("Input Panjang: ");
                        double p= input.nextDouble();
                        System.out.print("Input Lebar: ");
                        double l= input.nextDouble();
                        System.out.print("Input Tinggi: ");
                        double t= input.nextDouble();

                        volume= p*l*t;
                        int pembulatan = 1;
                        double temp = Math.pow(10, pembulatan);
                        double a = (double)Math.round(volume*temp)/temp;

                        System.out.println("Volume Balok: "+a);
                        break;

                    }case 3:{
                        System.out.print("Input Tinggi: ");
                        double t= input.nextDouble();
                        System.out.print("Input Jari-jari: ");
                        double r= input.nextDouble();

                        volume=3.141259266*r*r*t/3;
                        int pembulatan = 1;
                        double temp = Math.pow(10, pembulatan);
                        double a = (double)Math.round(volume*temp)/temp;

                        System.out.println("Volume Kerucut: "+a);
                        break;

                    }case 4:{
                        System.out.print("Input Jari-jari: ");
                        double r= input.nextDouble();

                        volume=3.141259266*r*r*r*4/3;
                        int pembulatan = 1;
                        double temp = Math.pow(10, pembulatan);
                        double a = (double)Math.round(volume*temp)/temp;

                        System.out.println("Volume Bola: "+a);
                        break;

                    }case 5:{
                        System.out.print("Input Alas Segitiga: ");
                        double a= input.nextDouble();
                        System.out.print("Input Tinggi Segitiga: ");
                        double t1= input.nextDouble();
                        System.out.print("Input Tinggi Prisma: ");
                        double t2= input.nextDouble();

                        volume= a*t1*t2/2;
                        int pembulatan = 1;
                        double temp = Math.pow(10, pembulatan);
                        double b = (double)Math.round(volume*temp)/temp;

                        System.out.println("Volume Prisma: "+b);
                        break;

                    }case 6:{
                        System.out.print("Input Alas Segitiga: ");
                        double a= input.nextDouble();
                        System.out.print("Input Tinggi Segitiga: ");
                        double t1= input.nextDouble();
                        System.out.print("Input Tinggi Limas: ");
                        double t2= input.nextDouble();

                        volume= a*t1*t2/6;
                        int pembulatan = 1;
                        double temp = Math.pow(10, pembulatan);
                        double b = (double)Math.round(volume*temp)/temp;

                        System.out.println("Volume Limas: "+b);
                        break;

                    }case 7:{
                        System.out.print("Input Jari-jari: ");
                        double r= input.nextDouble();
                        System.out.print("Input Tinggi Tabung: ");
                        double t= input.nextDouble();

                        volume= 3.141259266*r*r*t/3;
                        int pembulatan = 1;
                        double temp = Math.pow(10, pembulatan);
                        double b = (double)Math.round(volume*temp)/temp;
                        System.out.println("Volume Tabung: "+b);
                    }
                }
                break;
            }
        }
        }
        
    }


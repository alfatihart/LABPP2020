package PRATIKUM;
import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih ;
        
        System.out.println("**Menu**");
        System.out.println("1.Luas Bangun Datar");
        System.out.println("2.Volume Bangun Ruang");
        System.out.println("Input angka sesuai dengan Menu Yang diinginkan");
        pilih = input.nextInt();

        if (pilih == 1){
            System.out.println("Pilih Bangun Datar");
            System.out.println("1.Persegi");
            System.out.println("2.Persegi panjang");
            System.out.println("3.Segitiga");
            System.out.println("4.Lingkaran");
            System.out.println("5.Jajargenjang");
            System.out.println("6.Trapesium");
            System.out.println("7.Belah ketupat");
            System.out.println("8.Layang-layang");
            pilih = input.nextInt();{
                if(pilih == 1){
                    //persegi
                    float  luas , s ;
                    System.out.println("Input sisi");
                    s = input.nextFloat();
                    luas = s*s ;
                    System.out.println("Luas Persegi :" + luas);
                }else if(pilih == 2){
                    //persegi panjang
                    float   p,l,luas;
                    System.out.println("Input panjang");
                    p = input.nextFloat();
                    System.out.println("Input lebar");
                    l = input.nextFloat();
                    luas = p*l ;
                    System.out.println("Luas Persegi Panjang :" + luas);
                }else if(pilih == 3){
                     //segitiga
                     float   a,t,luas;
                     System.out.println("Input alas");
                     a = input.nextFloat();
                     System.out.println("Input tinggi");
                     t = input.nextFloat();
                     luas = a*t /2 ;
                     System.out.println("Luas Segitiga :" + luas);
                }else if(pilih == 4){
                     //lingkaran
                     float  r,luas ;
                     System.out.println("Input jari-jari");
                     r = input.nextFloat();
                     luas = 3.14f*r*r ;
                     System.out.println("Luas Lingkaran :" + luas);
                } else if(pilih == 5){
                    ///jajargenjang
                    float a,t,luas;
                    System.out.println("Input alas");
                    a = input.nextFloat();
                    System.out.println("Input tinggi");
                    t = input.nextFloat();
                    luas = a*t ;
                    System.out.println("Luas Jajargenjang :" + luas);
                }else if(pilih == 6) {//trapesium
                    float  s1 ,s2,t,luas ;
                    System.out.println("Input sisi pertama");
                    s1 = input.nextFloat();
                    System.out.println("Input sisi kedua");
                    s2 = input.nextFloat();
                    System.out.println("Input tinggi");
                    t = input.nextFloat();
                    luas = (s1+s2)*t/2 ;
                    System.out.println("Luas Trapesium :" + luas);
                }else if(pilih == 7){
                    //belahketupat
                    float  d1,d2,luas;
                    System.out.println("Input diagonal 1");
                    d1 = input.nextFloat();
                    System.out.println("Input diagonal 2");
                    d2 = input.nextFloat();
                    luas = d1*d2 /2;
                    System.out.println("Luas Belah Ketupat :" + luas);
                }else if(pilih == 8){
                    //layang-layang
                    float d1,d2,luas;
                    System.out.println("Input diagonal 1");
                    d1 = input.nextFloat();
                    System.out.println("Input diagonal 2");
                    d2 = input.nextFloat();
                    luas = d1*d2 /2;
                    System.out.println("Luas Layang-layang :" + luas);
                }
            }   
        }
        else {
            System.out.println("Kembali ke Menu Utama");
        }
    }
}

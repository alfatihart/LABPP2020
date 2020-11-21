package Pratikum5;

import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan pertama");
        int bil1 = input.nextInt();
        System.out.println("Masukkan bilangan kedua");
        int bil2 = input.nextInt();
        int fpb = cariFPB(bil1,bil2);
        System.out.println("FPB dari " + bil1 + " dan " + bil2 + " = " + fpb);
    }
    public static int cariFPB(  int bil1, int bil2){
        int besar, kecil;
        int fpb=0;
        besar = bil1;
        kecil = bil2;
        if (bil1 < bil2) {
            besar = bil2;
            kecil = bil1;
        }
        for (int i = kecil; i > 0; i--) {
            if (kecil % i == 0 && besar % i == 0) {
                fpb = i;
            }
        }return fpb;
    }
}

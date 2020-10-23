package PRATIKUM;
import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        int genap = 0;
        int ganjil = 0;
        int positif= 0 ;
        int negatif= 0 ;
        
        try {
        Scanner bil = new Scanner(System.in);
        System.out.print("Masukkan angka");
        int a = bil.nextInt();
        int b = bil.nextInt();
        int c = bil.nextInt();
        int d = bil.nextInt();
        int e = bil.nextInt();

        //a
        if ( a %2 == 0 ){
           genap = genap + 1;
        }else {
            ganjil = ganjil + 1;
        }
        if ( a > 0 ){
            if ( a >= 1)
           positif = positif + 1;
        }else if (a == 0 ){
            positif = positif + 0;
        }
        else {
           negatif = negatif + 1;
        }
        //b
        if ( b %2 == 0 ){
            genap = genap + 1;
         }else {
             ganjil = ganjil + 1;
         }
         
         if ( b > 0 ){
            if ( b >= 1)
           positif = positif + 1;
        }else if (b == 0 ){
            positif = positif + 0;
        }else {
            negatif = negatif + 1;
         }
        //c
        if ( c %2 == 0 ){
            genap = genap + 1;
         }else {
             ganjil = ganjil + 1;
         }
         
         if ( c > 0 ){
            if ( c >= 1)
           positif = positif + 1;
        }else if (c == 0 ){
            positif = positif + 0;
        }else {
            negatif = negatif + 1;
         }
        //d
        if ( d %2 == 0 ){
            genap = genap + 1;
         }else {
             ganjil = ganjil + 1;
         }
         
         if ( d > 0 ){
            if ( d >= 1)
           positif = positif + 1;
        }else if (d == 0 ){
            positif = positif + 0;
        }else {
            negatif = negatif + 1;
         }
        //e
        if ( e %2 == 0 ){
            genap = genap + 1;
         }else {
             ganjil = ganjil + 1;
         }
         
         if ( e > 0 ){
            if ( e >= 1)
           positif = positif + 1;
        }else if (e == 0 ){
            positif = positif + 0;
        }else {
            negatif = negatif + 1;
         } 
         
         System.out.println(genap + " angka genap");
         System.out.println(ganjil + " angka ganjil");
         System.out.println(positif + " angka positif");
         System.out.println(negatif + " angka negatif");
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }
}

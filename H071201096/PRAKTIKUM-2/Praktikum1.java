import java.util.InputMismatchException;
import java.util.Scanner;
public class Praktikum1{
    public static void main(String[]args) {
        Scanner ilkom = new Scanner(System.in);

        try {
            int a, b, c, d, e;
            a = ilkom.nextInt();
            b = ilkom.nextInt();
            c = ilkom.nextInt();
            d = ilkom.nextInt();
            e = ilkom.nextInt();


        // Jumlah banyaknya bilangan genap dan ganjil
        
        int jmlGenapa = 0;
        int jmlGenapb = 0;
        int jmlGenapc = 0;
        int jmlGenapd = 0;
        int jmlGenape = 0;

        int jmlGanjila = 0;
        int jmlGanjilb = 0;
        int jmlGanjilc = 0;
        int jmlGanjild = 0;
        int jmlGanjile = 0;

        if(a % 2 == 0) {
            jmlGenapa = 1;
            jmlGanjila = 0;
        } else {
            jmlGenapa = 0;
            jmlGanjila = 1;
        } 

        if(b % 2 == 0) {
            jmlGenapb = 1;
            jmlGanjilb = 0;
        } else {
            jmlGenapb = 0;
            jmlGanjilb = 1;
        } 

        if(c % 2 == 0) {
            jmlGenapc = 1;
            jmlGanjilc = 0;
        } else {
            jmlGenapc = 0;
            jmlGanjilc = 1;
        } 

        if(d % 2 == 0) {
            jmlGenapd = 1;
            jmlGanjild = 0;
        } else {
            jmlGenapd = 0;
            jmlGanjild = 1;
        } 

        if(e % 2 == 0) {
            jmlGenape = 1;
            jmlGanjile = 0;
        } else {
            jmlGenape = 0;
            jmlGanjile = 1;
        } 

        int totalGenap = jmlGenapa + jmlGenapb + jmlGenapc + jmlGenapd + jmlGenape;
        int totalGanjil = jmlGanjila + jmlGanjilb + jmlGanjilc + jmlGanjild + jmlGanjile;

        // Jumlah banyaknya bilangan positif dan negatif

        int jmlPositifa = 0;
        int jmlPositifb = 0;
        int jmlPositifc = 0;
        int jmlPositifd = 0;
        int jmlPositife = 0;

        int jmlNegatifa = 0;
        int jmlNegatifb = 0;
        int jmlNegatifc = 0;
        int jmlNegatifd = 0;
        int jmlNegatife = 0;

        
        if(a > 0) {
            jmlPositifa = 1;
            jmlNegatifa = 0;
        } else {
            if(a == 0) {
                jmlPositifa = 0;
                jmlNegatifa = 0;
            } else {
                jmlPositifa = 0;
                jmlNegatifa = 1;
            }
        } 

        if(b > 0) {
            jmlPositifb = 1;
            jmlNegatifb = 0;
        } else {
            if(b == 0) {
                jmlPositifb = 0;
                jmlNegatifb = 0;
            } else {
                jmlPositifb = 0;
                jmlNegatifb = 1;
            }
        } 

        if(c > 0) {
            jmlPositifc = 1;
            jmlNegatifc = 0;
        } else {
            if(c == 0) {
                jmlPositifc = 0;
                jmlNegatifc = 0;
            } else {
                jmlPositifc = 0;
                jmlNegatifc = 1;
            }
        } 

        if(d > 0) {
            jmlPositifd = 1;
            jmlNegatifd = 0;
        } else {
            if(d == 0) {
                jmlPositifd = 0;
                jmlNegatifd = 0;
            } else {
                jmlPositifd = 0;
                jmlNegatifd = 1;
            }
        } 

        if(e > 0) {
            jmlPositife = 1;
            jmlNegatife = 0;
        } else {
            if(e == 0) {
                jmlPositife = 0;
                jmlNegatife = 0;
            } else {
                jmlPositife = 0;
                jmlNegatife = 1;
            }
        } 
        int totalPositif = jmlPositifa + jmlPositifb + jmlPositifc + jmlPositifd + jmlPositife;
        int totalNegatif = jmlNegatifa + jmlNegatifb + jmlNegatifc + jmlNegatifd + jmlNegatife;

        System.out.println(totalGenap + " Angka Genap");
        System.out.println(totalGanjil + " Angka Ganjil");
        System.out.println(totalPositif + " Angka Positif");
        System.out.println(totalNegatif + " Angka Negatif");

    } catch (InputMismatchException ime) {
        System.out.println("Inputan Tidak Valid");
    } finally {
        ilkom.close();
    }

    }
}
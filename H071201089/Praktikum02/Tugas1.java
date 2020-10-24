import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int a, b, c, d, e;
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            d = input.nextInt();
            e = input.nextInt();

        //banyaknya bilangan genap dan ganjil

        int jmlGenapA = 0;
        int jmlGenapB = 0;
        int jmlGenapC = 0;
        int jmlGenapD = 0;
        int jmlGenapE = 0;

        int jmlGanjilA = 0;
        int jmlGanjilB = 0;
        int jmlGanjilC = 0;
        int jmlGanjilD = 0;
        int jmlGanjilE = 0;

        //penambahan jumlah keseluruhan angka genap
        if(a % 2 == 0) {
            jmlGenapA = 1;  
        } else {
            jmlGanjilA = 1;
        } 

        if(b % 2 == 0) {
            jmlGenapB = 1;
        } else {
            jmlGanjilB = 1;
        } 

        if(c % 2 == 0) {
            jmlGenapC = 1;
        } else {
            jmlGanjilC = 1;
        } 

        if(d % 2 == 0) {
            jmlGenapD = 1;
        } else {
            jmlGanjilD = 1;
        } 

        if(e % 2 == 0) {
            jmlGenapE = 1;
        } else {
            jmlGanjilE = 1;
        } 

        int totalGenap = jmlGenapA + jmlGenapB + jmlGenapC + jmlGenapD + jmlGenapE;
        int totalGanjil = jmlGanjilA + jmlGanjilB + jmlGanjilC + jmlGanjilD + jmlGanjilE;

        //banyaknya bilangan positif dan negatif
        int jmlPositifA = 0;
        int jmlPositifB = 0;
        int jmlPositifC = 0;
        int jmlPositifD = 0;
        int jmlPositifE = 0;

        int jmlNegatifA = 0;
        int jmlNegatifB = 0;
        int jmlNegatifC = 0;
        int jmlNegatifD = 0;
        int jmlNegatifE = 0;

        if(a > 0) {
            jmlPositifA = 1;
            jmlNegatifA = 0;
        } else if(a == 0) {
                jmlPositifA = 0;
                jmlNegatifA = 0;
            } else {
                jmlPositifA = 0;
                jmlNegatifA = 1;
            }

        if(b > 0) {
            jmlPositifB = 1;
            jmlNegatifB = 0;
        } else if(b == 0) {
                jmlPositifB = 0;
                jmlNegatifB = 0;
            } else {
                jmlPositifB = 0;
                jmlNegatifB = 1;
            }

        if(c > 0) {
            jmlPositifC = 1;
            jmlNegatifC = 0;
        } else if(c == 0) {
                jmlPositifC = 0;
                jmlNegatifC = 0;
            } else {
                jmlPositifC = 0;
                jmlNegatifC = 1;
            }

        if(d > 0) {
            jmlPositifD = 1;
            jmlNegatifD = 0;
        } else if(d == 0) {
                jmlPositifD = 0;
                jmlNegatifD = 0;
            } else {
                jmlPositifD = 0;
                jmlNegatifD = 1;
            }

        if(e > 0) {
            jmlPositifE = 1;
            jmlNegatifE = 0;
        } else if(e == 0) {
                jmlPositifE = 0;
                jmlNegatifE = 0;
            } else {
                jmlPositifE = 0;
                jmlNegatifE = 1;
            } 

        int totalPositif = jmlPositifA + jmlPositifB + jmlPositifC + jmlPositifD + jmlPositifE;
        int totalNegatif = jmlNegatifA + jmlNegatifB + jmlNegatifC + jmlNegatifD + jmlNegatifE;

        System.out.println(totalGenap + " Angka Genap");
        System.out.println(totalGanjil + " Angka Ganjil");
        System.out.println(totalPositif + " Angka Positif");
        System.out.println(totalNegatif + " Angka Negatif");

    } catch(InputMismatchException ime) {
        System.out.println("Inputan Tidak Valid");    
    }finally {
        input.close();
    }
    }
}
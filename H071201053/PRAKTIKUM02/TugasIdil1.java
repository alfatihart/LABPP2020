import java.util.InputMismatchException;
import java.util.Scanner;

public class TugasIdil1 {
    public static void main(String[] args) {
        Scanner cinta = new Scanner(System.in);

        try {
            int a, b, c, d, e;
            a = cinta.nextInt();
            b = cinta.nextInt();
            c = cinta.nextInt();
            d = cinta.nextInt();
            e = cinta.nextInt();

        // Hitungan banyaknya bilangan genap dan ganjil

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

        if(a % 2 == 0) {
            jmlGenapA = 1; //menambahkan jumlah keseluruhan angka genap 
            jmlGanjilA = 0;
        } else {
            jmlGenapA = 0;
            jmlGanjilA = 1;
        } 

        if(b % 2 == 0) {
            jmlGenapB = 1;
            jmlGanjilB = 0;
        } else {
            jmlGenapB = 0;
            jmlGanjilB = 1;
        } 

        if(c % 2 == 0) {
            jmlGenapC = 1;
            jmlGanjilC = 0;
        } else {
            jmlGenapC = 0;
            jmlGanjilC = 1;
        } 

        if(d % 2 == 0) {
            jmlGenapD = 1;
            jmlGanjilD = 0;
        } else {
            jmlGenapD = 0;
            jmlGanjilD = 1;
        } 

        if(e % 2 == 0) {
            jmlGenapE = 1;
            jmlGanjilE = 0;
        } else {
            jmlGenapE = 0;
            jmlGanjilE = 1;
        } 

        int totalGenap = jmlGenapA + jmlGenapB + jmlGenapC + jmlGenapD + jmlGenapE;
        int totalGanjil = jmlGanjilA + jmlGanjilB + jmlGanjilC + jmlGanjilD + jmlGanjilE;

        // Hitungan banyaknya bilangan positif dan negatif

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
        cinta.close();
    }
    }
}
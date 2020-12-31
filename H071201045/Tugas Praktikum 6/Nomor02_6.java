import java.util.Scanner;
public class Nomor02_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata = input.nextLine();
        String[][] array = new String[4][4];

        if (kata.length() >= 16) {
            kata = charCodePointAt(kata);
            int count = 0;
            int karakter = charArray(kata);
            
         // Array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = "";
                for (int k = 0; k < karakter; k++) {
                    if (count < kata.length()) {
                    array[i][j] += kata.charAt(count);
                    } else {
                    array[i][j] += '?';
                    }
                    count++;
                    }
                }
            }
            // Print Array
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(array[i][j] + " ");
                }
                        System.out.println();
            }
        }
    }
    // konversi Character.codePointAt(String, index)
    static String charCodePointAt(String a) {
        int ganjil;
        char genap;
        String stringbaru = "";
        for (int i = 0; i < a.length(); i++) {
            if (i % 2 != 0) {
                ganjil = Character.codePointAt(a, i);
                stringbaru += ganjil;
            } else {
                genap = a.charAt(i);
                stringbaru += genap;
            }
        }
        return stringbaru;
    }

    // karakter setiap arraynya
    static int charArray(String a) {
        int karakter = 0;
        while ((16 * karakter) < a.length()) {
            karakter++;
        }
        return karakter;
    }
}

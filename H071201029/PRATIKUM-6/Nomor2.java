package Pratikum6;

import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String karakter = input.nextLine();
        String[][] array = new String[4][4];

        if (karakter.length() >= 16) {
            karakter = charCodePointAt(karakter);
            int count = 0;
            int character = charArray(karakter);
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    array[i][j] = "";
                    for (int k = 0; k < character; k++) {
                        if (count < karakter.length()) {
                            array[i][j] += karakter.charAt(count);
                        } else {
                            array[i][j] += '?';
                        }
                        count++;
                    }
                }
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    static String charCodePointAt(String m) {
        int ganjil;
        char genap;
        String kataBaru = "";
        for (int i = 0; i < m.length(); i++) {
            if (i % 2 == 0) {
                genap = m.charAt(i);
                kataBaru += genap;
            } else {
                ganjil = Character.codePointAt(m, i);
                kataBaru += ganjil;
                
            }
        }
        return kataBaru;
    }

    static int charArray(String m) {
        int character = 0;
        while ((16 * character) < m.length()) {
            character++;
        }
        return character;
    }
}
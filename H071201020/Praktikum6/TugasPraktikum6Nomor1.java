import java.util.Scanner;

public class TugasPraktikum6Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kata = input.nextLine().toUpperCase();
        System.out.print("#" + hexadecimal(kata) + palindromString(kata) + octal(kata));
        // Symbol
        char hexChar = String.valueOf(hexadecimal(kata)).charAt(0);
        if (hexChar >= 'a' && hexChar <= 'z') {
            System.out.print("?");
        } else {
            System.out.print("!");
        }
    }

    // Membagi kata
    static String setengahKata(String a) {
        String kataBaru = a.replaceAll(" ", "");
        int kataLength = kataBaru.length() / 2;
        kataBaru = kataBaru.substring(0, kataLength);
        return kataBaru;
    }

    // Membuat Palindrom
    static String palindromString(String a) {
        String kata = setengahKata(a);
        String palindrome = "";
        for (int i = kata.length() - 2; i >= 0; i--) {
            palindrome += kata.charAt(i);
        }
        String kataBaru = kata.concat(palindrome);
        return kataBaru;
    }

    // Convert ke hexadecimal
    static String hexadecimal(String a) {
        int kataLength = a.length();
        int decimal = kataLength * kataLength;
        String hex = String.format("%x", decimal);
        return hex;
    }

    // Convert ke octal
    static String octal(String a) {
        int kataLength = a.length();
        String oct = String.format("%o", kataLength);
        return oct;
    }

}

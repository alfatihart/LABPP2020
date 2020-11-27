import java.util.Scanner;

public class Praktikum6No1 {
    public static void main(String[] args) {
        Scanner ia = new Scanner(System.in);
        System.out.print("Masukkan Kalimat = ");
        String kalimat = ia.nextLine();
        String hurufBesar = kalimat.toUpperCase();
        String tidakSpasi = hurufBesar.replaceAll(" ", "");
        int bagiKalimat = tidakSpasi.length() / 2;
        String seperkalimat = tidakSpasi.substring(0, bagiKalimat);
        char[] indeksseperkalimat = seperkalimat.toCharArray();
        int jumlahKalimat = kalimat.length() * kalimat.length();
        String cetakKalimat = "";
        System.out.println("");

        for (int i = indeksseperkalimat.length - 2; i >= 0; i--) {
            cetakKalimat += indeksseperkalimat[i];
        }

        String hexa = String.format("#%x", jumlahKalimat);
        System.out.printf(hexa);
        char a[] = hexa.toCharArray();
        System.out.print(seperkalimat);
        System.out.print(cetakKalimat);
        System.out.printf("%o", kalimat.length());
        int huruf = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'A' && a[i] <= 'z') {
                huruf++;
                break;
            }
        }
        System.out.printf("%c", huruf == 1 ? '?' : '!');
    }
}
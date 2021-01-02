
import java.io.*;
import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FileWriter fileWrite = null;
        PrintWriter printWrite = null;

        try {
            System.out.print("Masukkan Nama File : ");
            String fileName = scan.nextLine() + ".txt";
            System.out.print("Jumlah Asisten : ");
            int numberAssistance = scan.nextInt();
            String[] nameList = new String[numberAssistance];
            String[] nimList = new String[numberAssistance];
            int[] angkatanList = new int[numberAssistance];

            for (int i = 0; i < numberAssistance; i++) {
                scan.nextLine();
                System.out.print("Nama = ");
                nameList[i] = scan.nextLine();
                System.out.print("NIM = ");
                nimList[i] = scan.next();
                System.out.print("Angkatan = ");
                angkatanList[i] = scan.nextInt();
            }

            fileWrite = new FileWriter(fileName);
            printWrite = new PrintWriter(fileWrite);
            int panjang = 0;
            for (int i = 0; i < nameList.length; i++) {
                if (nameList[i].length() > panjang)
                    panjang = nameList[i].length();
            }
            printWrite.printf("+%s+===========+===========+\n", penampil(panjang));
            panjang -= 4;
            printWrite.printf("|NAMA%" + panjang + "s|NIM         |ANGKATAN  |\n", " ");
            panjang += 4;
            printWrite.printf("+%s+===========+===========+\n", penampil(panjang));
            for (int j = 0; j < numberAssistance; j++) {
                panjang -= nameList[j].length();
                printWrite.printf("|%s", nameList[j]);
                for (int x = 0; x < panjang; x++) {
                    printWrite.print(" ");
                }
                printWrite.printf("| %-10s | %-8s |\n", nimList[j], angkatanList[j]);
                panjang += nameList[j].length();
            }
            printWrite.printf("+%s+===========+===========+\n", penampil(panjang));

        } catch (IOException ioe) {
            System.out.println("Gagal");
            scan.nextLine();
        } finally {
            try {
                if (printWrite != null) {
                    System.out.println("Berhasil");
                    printWrite.close();
                }
                if (fileWrite != null) {
                    fileWrite.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }

    public static String penampil(int a) {
        String str = "";
        for (int i = 0; i < a; i++) {
            str += "=";
        }
        return str;
    }
}
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class IoNomor3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        FileWriter fileWrite = null;
        PrintWriter printWrite = null;
        
        try {
            
            String fileName = obj.nextLine() + ".txt";
            ArrayList<String> nama = new ArrayList<>();
            ArrayList<String> nim = new ArrayList<>();
            ArrayList<String> angkatan = new ArrayList<>();

            int asisten = obj.nextInt();
            obj.nextLine();

            for (int i = 0; i < asisten; i++) {
                System.out.print("Masukkan Nama = ");
                nama.add(obj.next());
                System.out.print("Masukkan Nim = ");
                nim.add(obj.next());
                System.out.print("Masukkan Angkatan = ");
                angkatan.add(obj.next());
            }

            fileWrite = new FileWriter(fileName);
            printWrite = new PrintWriter(fileWrite);
            printWrite.printf("+----------------------+--------------+-------------+\n");
            printWrite.printf("|         NAMA         |     NIM      |   ANGKATAN  |\n");
            printWrite.printf("+----------------------+--------------+-------------+\n");
            for (int j = 0; j < asisten; j++) {
                printWrite.printf("| %-20s | %-12s | %-10s  |\n", nama.get(j), nim.get(j), angkatan.get(j));
            }
            printWrite.printf("+----------------------+--------------+-------------+\n");

        } catch (IOException ioe) {
            System.out.println("Gagal");
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
                System.out.println("Gagal");
            }
        }
        obj.close();
    }
} 
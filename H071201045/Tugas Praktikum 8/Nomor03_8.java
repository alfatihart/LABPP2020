import java.io.*;
import java.util.*;

public class Nomor03_8 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    FileWriter fileWriter = null;
    PrintWriter printWriter = null;
    
    try{

        String namaFile = scan.nextLine() + ".txt";
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> nim = new ArrayList<>();
        ArrayList<String> angkatan = new ArrayList<>();

        int asisten = scan.nextInt();
        scan.nextLine();

        for(int i =0; i<asisten; i++){
            System.out.println("Masukkan Nama : ");
            nama.add(scan.next());
            System.out.println("Masukkan NIM : ");
            nim.add(scan.next());
            System.out.println("Masukkan angkatan : ");
            angkatan.add(scan.next());
        }

        fileWriter = new FileWriter(namaFile);
        printWriter = new PrintWriter(fileWriter);
        printWriter.printf("+----------------------+------------+----------+\n");
        printWriter.printf("| Nama                 | NIM        |Angkatan  |\n");
        printWriter.printf("+----------------------+------------+----------+\n");

        for(int j=0; j<asisten; j++){
            printWriter.printf("| %-20s | %-12s | %-10s  |\n", nama.get(j), nim.get(j), angkatan.get(j));
        }
        printWriter.printf("+----------------------+------------+----------+\n");
    } catch (IOException e){
        System.out.println("Gagal");
    } finally {
        try {
            if (printWriter != null){
                System.out.println("Berhasil");
                printWriter.close();
            }
            if (fileWriter != null){
                fileWriter.close();
            }
        } catch (IOException e) {
                System.out.println("gagal");
        }
    }
            scan.close();
    }
}

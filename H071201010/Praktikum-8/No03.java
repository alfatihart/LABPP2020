import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class No03{
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        FileWriter fileOuput = null;

        try {
            System.out.print("Masukkan nama file : ");
            String file = scan.next() + ".txt";
            System.out.print("Jumlah \t\t   : ");
            int jumlah = scan.nextInt();

            System.out.println();

            ArrayList<String> Nama = new ArrayList<>();
            ArrayList<String> NIM = new ArrayList<>();
            ArrayList<String> Angkatan = new ArrayList<>();

            System.out.println("Tidak menggunakan spasi (Jika terdapat spasi, gunakan underscore “_” )");

            for (int i = 0; i < jumlah; i++) {
                
                System.out.print("Nama   \t : ");
                String name = scan.next();
                
                System.out.print("NIM    \t : ");
                String nim = scan.next();
                
                System.out.print("Angkatan : ");
                String year = scan.next();
                if(name.length() <= 20){
                    NIM.add(nim);
                    Nama.add(name);
                    Angkatan.add(year);
                } else {
                    System.out.println("Panjang nama tidak lebih dari 20 karakter.");
                }
                System.out.println();
            }
            
            fileOuput = new FileWriter(file);

            fileOuput.write("+----------------------+------------+----------+\n");
            fileOuput.write("| Nama                 | NIM        | Angkatan |\n");
            fileOuput.write("+----------------------+------------+----------+\n");
            
            for (int i = 0; i < jumlah; i++) {
            fileOuput.write(String.format("| %-20s | %-10s | %-8s |\n", Nama.get(i), NIM.get(i), Angkatan.get(i)));   
            }
            fileOuput.write("+----------------------+------------+----------+\n");
            System.out.println("Berhasil");
            
        } catch (Exception e) {
            System.out.println("Gagal");
        } finally {
            if(fileOuput!=null){
                fileOuput.close();
            }
        }
        scan.close();
    }
}
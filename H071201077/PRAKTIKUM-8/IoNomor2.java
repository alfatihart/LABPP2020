import java.util.*;
import java.io.*;

public class IoNomor2 {
    public static void main(String[] args)  {
        Scanner obj = new Scanner(System.in);
        FileWriter write = null;
        PrintWriter printWrite = null;
        FileReader read = null;
        BufferedReader buffRead = null;

        try {
            String x = obj.next();
            String y = obj.next();

            read = new FileReader(String.format("%s.txt", x));
            buffRead = new BufferedReader(read);
            write = new FileWriter(String.format("%s.txt", y));
            printWrite = new PrintWriter(write);

            String data;
            
            int b = 0;
            while ((data = buffRead.readLine()) != null) {
                b = data.length() > b ? data.length() : b;
            }
            read = new FileReader(String.format("%s.txt", x));
            buffRead = new BufferedReader(read);

            String dataBaru;

            while ((dataBaru = buffRead.readLine()) != null) {
                printWrite.write(String.format("%" + b + "s\n", dataBaru));
            }

        } catch (IOException ioe) {
            System.out.println("Gagal");
        } finally {
            try {
                if (write != null) {
                    System.out.println("Berhasil");
                    write.close();
                }
                if (read != null) {
                    read.close();
                }
            } catch (IOException ioe) {
                System.out.println("Gagal");
            }
        }
        obj.close();
    }
} 
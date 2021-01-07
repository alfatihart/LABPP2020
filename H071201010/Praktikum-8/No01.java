import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class No01{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String File1 = scan.next();
        String File2 = scan.next();

        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        try {
            fileInput = new FileInputStream(File1 + ".txt");
            fileOutput = new FileOutputStream(File2 + ".txt");

            int buffer = fileInput.read();

            while(buffer != -1){
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }
            System.out.println("\nBerhasil");

        } catch (Exception e) {
            System.out.println("\nGagal");
            
        } finally {
            if(fileInput != null){
                fileInput.close();
            }
            if(fileOutput != null){
                fileOutput.close();
            }
        }
        scan.close();
    }
}
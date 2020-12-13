import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class No02{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        FileReader fileInput = null;
        BufferedReader bufferedInput = null;
        FileWriter fileOutput = null;
        BufferedWriter bufferedOutput = null; 

        try{
            String File1 = scan.next();
            String File2 = scan.next();

            fileInput = new FileReader(File1 + ".txt");
            bufferedInput = new BufferedReader(fileInput);
            fileOutput = new FileWriter(File2 + ".txt");
            bufferedOutput = new BufferedWriter(fileOutput);

            String data = bufferedInput.readLine();
            while(data != null){
                bufferedOutput.write(String.format("%50s\n", data));
                bufferedOutput.flush();
                data = bufferedInput.readLine();
            }

            System.out.println("\nBerhasil");
        } catch(Exception e) {
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
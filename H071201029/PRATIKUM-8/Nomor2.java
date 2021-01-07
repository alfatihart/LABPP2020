
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Nomor2 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String inputFileName = scan.nextLine();
        String fileName = inputFileName + ".txt";
        String inputCopiedFile = scan.nextLine();
        String copiedFile = inputCopiedFile + ".txt";
        copy(fileName, copiedFile);
        scan.close();
    }
    public static void copy (String sourceFile, String copiedFile){
        File file = new File(sourceFile);
        if (!file.exists() || !file.isFile()){
            System.out.println();
            System.out.println("Gagal");
            return;
        }
            String copiedFileName = sourceFile.replace(sourceFile, copiedFile);
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile))){
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(copiedFileName));
                String line = new String();
                while ((line = bufferedReader.readLine()) != null){
                    bufferedWriter.write(String.format("%20s", line));
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                System.out.println();
                System.out.println("Berhasil");
            }catch (Exception e){
                e.printStackTrace();
            }
    }
}

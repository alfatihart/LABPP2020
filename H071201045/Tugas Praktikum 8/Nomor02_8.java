import java.util.*;
import java.io.*;

public class Nomor02_8 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    FileWriter fileWriter = null;
    PrintWriter printWriter = null;
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;

    try {
        String firstFile = scan.next();
        String secondFile = scan.next();
        
        fileReader = new FileReader(String.format("%s.txt", firstFile));
        bufferedReader = new BufferedReader(fileReader);
        fileWriter = new FileWriter(String.format("%s.txt", secondFile));
        printWriter = new PrintWriter(fileWriter);

        String string;

        int data =0;
        while((string = bufferedReader.readLine()) != null){
            data = string.length() > data ? string.length() : data;
        }
        fileReader = new FileReader(String.format("%s.txt", firstFile));
        bufferedReader = new BufferedReader(fileReader);
        
        String string2;

        while((string2 = bufferedReader.readLine())!= null) {
            printWriter.write(String.format("%" + data + "s\n", string2));
        }
    } catch (IOException e) {
        System.out.println("Gagal");
    } 
     finally{
        try{
            if(fileWriter != null){
                System.out.println("Berhasil");
                fileWriter.close();
            } if (fileReader != null){
                fileReader.close();
            }
        } catch (IOException e){
                System.out.println("gagal");
            }
    }
    scan.close();
    }
}



import java.io.*;
import java.util.*;

public class Nomor01_8 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    FileInputStream fileInput = null;
    FileOutputStream fileOutput = null;

    try{
        fileInput = new FileInputStream(scan.next() + ".txt");
        fileOutput = new FileOutputStream(scan.next() + ".txt");
    
        int data =  fileInput.read();
    while (data != -1){
        fileOutput.write(data);
        data = fileInput.read();
    }
    } catch (IOException e){
        System.out.println("gagal");
    }
    
    finally{
        try{
            if (fileInput != null){
                System.out.println("Berhasil");
                fileInput.close();
            }
        } catch (IOException e){
            System.out.println("gagal");
        }
    }
    }
}

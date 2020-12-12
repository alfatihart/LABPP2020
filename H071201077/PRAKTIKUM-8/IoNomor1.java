import java.io.*;
import java.util.*;

public class IoNomor1{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        FileInputStream fileInputSteam= null;
        FileOutputStream fileOutputSteam = null;

        try{
            fileInputSteam = new FileInputStream(obj.next() + ".txt");
            fileOutputSteam = new FileOutputStream(obj.next() + ".txt");
            int data;
            while((data = fileInputSteam.read()) != -1){
            fileOutputSteam.write(data);
            
            }
            System.out.println("Berhasil");
            fileInputSteam.close();
            fileOutputSteam.close();

        }catch (IOException ioe){
            System.out.println("Gagal");
        }
        obj.close();
    }
}
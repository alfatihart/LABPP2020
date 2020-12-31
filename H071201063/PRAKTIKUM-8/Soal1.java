import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
class Soal1{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nama File: ");
        String fileName = scan.next()+".txt";
        System.out.print("Nama File Copy: ");
        String fileCopy = scan.next()+".txt";
        writeTo(scan, fileName);
        copy(fileName, fileCopy);
        checking(fileCopy);
    }

    public static void writeTo(Scanner scanner, String fileName){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(fileName,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            while(scanner.hasNextLine()){
                String str = scanner.nextLine();
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void copy(String fileName, String fileCopy)throws Exception{
        FileReader fileReader = new FileReader(fileName);
        FileWriter fileWriter = new FileWriter(fileCopy);
        int check;
        try{
            while((check=fileReader.read())!=-1){
                fileWriter.write(check);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                fileWriter.close();
                fileReader.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }  
   }
   public static void checking(String fileCopy){
       File file = new File(fileCopy);
       if(file.exists()){
           System.out.println("Berhasil");
       }else{
           System.out.println("Gagal");
       }
   }
}
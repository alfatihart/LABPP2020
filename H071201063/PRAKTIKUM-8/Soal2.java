import java.io.*;
import java.util.Scanner;
class Soal2{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nama File: ");
        String fileName = scan.next()+".txt";
        System.out.print("Nama File Copy: ");
        String fileCopy = scan.next()+".txt";

        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(fileName,true);
            printWriter = new PrintWriter(fileWriter);
            while(scan.hasNextLine()){
                String str = scan.nextLine();
                printWriter.printf("%25s %n", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Gagal");
        }finally{
            try{
                System.out.println("Berhasil");
                printWriter.close();
                fileWriter.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        FileReader fileReader = new FileReader(fileName);
        FileWriter fileWriter2 = new FileWriter(fileCopy);
        int check;
        try{
            while((check=fileReader.read())!=-1){
                fileWriter2.write(check);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                fileWriter2.close();
                fileReader.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }  
        scan.close();
    }
}
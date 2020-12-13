import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Soal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nama FIle: ");
        String fileName = scan.next()+".txt";
        System.err.print("Jumlah baris: ");
        int jumlah = scan.nextInt();
        int baris = 4+jumlah;
        String[] nam = {"N","a","m","a"};
        String[] nim = {"N","I","M"};
        String[] angkatan = {"A","n","g","k","a","t","a","n"};
        String[][] table = new String[baris][48];
        for(int i = 0;i<48;i++){
            if(i == 0 || i == 23 || i == 36 ||i == 47){
                table[0][i] = "+";
                table[1][i] = "|";
                table[2][i] = "+";
                table[baris-1][i] = "+";
                int x = 3;
                while(x < baris-1){
                    table[x][i] = "|";
                    x++;
                }
            }else{
                table[0][i] = "-";
                table[1][i] = " ";
                table[2][i] = "-";
                table[baris-1][i] = "-";
                int y = 3;
                while(y < baris-1){
                    table[y][i] = " ";
                    y++;
                }
            }
        }
        int x = 0;
        for(int i = 2; i < 24;i++){
            
            table[1][i] = nam[x];
            x++;
            if(x == nam.length){
                break;
            }
        }
        x = 0;
        for(int i = 25; i < 35;i++){
            
            table[1][i] = nim[x];
            x++;
            if(x == nim.length){
                break;
            }
        }
        x = 0;
        for(int i = 38; i < 48;i++){
            table[1][i] = angkatan[x];
            x++;
            if(x == angkatan.length){
                break;
            }
        }
        ArrayList<String> listNama = new ArrayList<>();
        ArrayList<String> listNim = new ArrayList<>();
        ArrayList<String> listAngkatan = new ArrayList<>();
        System.out.println("Masukan Nama Nim dan Angkatan secara berurutan sebanyak " + jumlah+" kali");
        System.out.println("Dengan catatan nama tidak menggunakan spasi, melainkan underscore'_',\nContoh: Ahmad_Hamsa");
        for(int i = 0;i<jumlah;i++){
            listNama.add(scan.next());
            listNim.add(scan.next());
            listAngkatan.add(scan.next());
        }
        int a = 3;
        for(int i = 0;i<listNama.size();i++){
            int b = 2;
            char[] check = listNama.get(i).toCharArray();
            for(int j = 0;j<check.length;j++){
                table[a][b] = Character.toString(check[j]);
                b++;
            }
            a++;
        }
        a = 3;
        for(int i = 0;i<listNim.size();i++){
            int b = 25;
            char[] check = listNim.get(i).toCharArray();
            for(int j = 0;j<check.length;j++){
                table[a][b] = Character.toString(check[j]);
                b++;
            }
            a++;
        }
        a = 3;
        for(int i = 0;i<listAngkatan.size();i++){
            int b = 38;
            char[] check = listAngkatan.get(i).toCharArray();
            for(int j = 0;j<check.length;j++){
                table[a][b] = Character.toString(check[j]);
                b++;
            }
            a++;
        }

        String finalToText = "";
        for(int i = 0; i < table.length;i++){
            for(int j = 0;j<table[i].length;j++){
                finalToText+= table[i][j]; 
            }
            finalToText+="\n";
        }
        
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println(finalToText);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Gagal");
        }finally{
            try {
                System.out.println("Berhasil");
                printWriter.close();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        scan.close();
    }
}
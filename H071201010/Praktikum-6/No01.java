import java.util.*;

public class No01{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String line = scan.nextLine();
        // menghilangkan spasi
        String withoutSpace = line.replaceAll("\\s", "");
        //mengkapitalkan semua huruf
        String upperCase = withoutSpace.toUpperCase();

        // konversi kalimat awal ke hexadecimal
        int lineLength = line.length();
        int hexOperation = lineLength * lineLength;
        String hex = String.format("%x", hexOperation);
        System.out.print("#"+hex);
        
        char[] dummyLine = upperCase.toCharArray();
        // membagi 2 kalimat awal
        for (int i = 0 ; i < (dummyLine.length/2) - 1; i++){
            char newLine = dummyLine[i];
            System.out.print(newLine);
        }
        // palindrome
        for (int i = (dummyLine.length/2) - 1; i >= 0; i--) {
            char palindrome = dummyLine[i];
            System.out.print(palindrome);
        }

        // konversi kalimat awal ke octal
        String octal = String.format("%o", lineLength);
        System.out.print(octal);

        //simbol
        char hexChar = String.valueOf(hex).charAt(0);
        if(hexChar >= 'a' && hexChar <= 'z'){
            System.out.print("?");
        }else{
            System.out.println("!");
        }
    }
}
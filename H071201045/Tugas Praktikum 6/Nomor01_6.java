import java.util.Scanner;
public class Nomor01_6 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    String kode = scan.nextLine().toUpperCase();
    System.out.print("#" + hexadecimal(kode) + palindrome(kode) + octal(kode));
    
    // Simbol jika hex berupa huruf tampil ?
    // jika hex angka maka !
    char karakterHex = String.valueOf(hexadecimal(kode)).charAt(0);
    if (karakterHex >= 'a' && karakterHex <= 'z'){
        System.out.print("?");}
     else{ 
        System.out.print("!");}

    }
    // kata tanpa spasi dibagi jumlah kata/2
    static String tanpaSpasi(String a){
        String kata1 = a.replaceAll(" ","");
        int jumlahkata1 = kata1.length() /2;
        kata1 = kata1.substring(0, jumlahkata1);
        return kata1;
    }
    
    static String palindrome (String a){
        String palindromekata = tanpaSpasi(a);
        String palindromekata1 = "";
        for ( int i=palindromekata1.length();  i >= 0; i--){
        palindromekata1 += palindromekata.charAt(i);
        }
        String katabarupal = palindromekata.concat(palindromekata1);
        return katabarupal; }

    // convert ke hexa
    static String hexadecimal(String a){
        int jumlahkata = a.length();
        int hxdec = jumlahkata * jumlahkata;
        String hexadec = String.format("%x", hxdec);
        return hexadec;    
}
    static String octal(String a){
        int jumlahkata = a.length();
        String octal = String.format("%o", jumlahkata);
        return octal;
    }
}

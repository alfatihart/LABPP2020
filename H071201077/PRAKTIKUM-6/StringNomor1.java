import java.util.Scanner;

public class StringNomor1 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine(); //Input kalimat
        String a=n.replace(" ", ""); //menghilangkan spasi

        String b = a.toUpperCase(); //Mengubah semua kalimat menjadi huruf besar
        
        String c=b.substring(0,b.length()/2); // membangi 2 kalimat huruf besar

        String poli="";
        int panjang=c.length(); //untuk mengetahui jumlah karakter c

        for(int i=panjang-2;i>=0;i--){ //membuat polindrom
            poli=poli+c.charAt(i);
        }
       String palindrom = c + poli; 
       int jumlah=n.length() * n.length(); // * jumlah karakter kata awal untuk hexa
       String hexa = Integer.toHexString(jumlah); //method hexadesimal
       String octal = Integer.toOctalString(n.length()); //method octaldesimal

       String simbol;
       char simbolnya[]=hexa.toCharArray();
       boolean cek=Character.isDigit(simbolnya[0]);//mengecek kata awal hexadesimal

       if(cek){          //jika angka akan tampil !
           simbol ="!"; 
       }else{
           simbol ="?";  //jika huruf akan tampil ?
       }

       System.out.println("#"+ hexa +palindrom+ octal+simbol);
       input.close();
        }
    }
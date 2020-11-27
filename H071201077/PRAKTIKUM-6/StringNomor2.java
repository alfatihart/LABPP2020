import java.util.Scanner;
public class StringNomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine(); //input kalimat

        if(n.length()>16){ //jika jumlah karakter > 16 (ketentuan soal)
        char[] gantiChar = n.toCharArray(); //mengubah kalimat to char
        String kata = "";

        for (int i = 0; i < gantiChar.length; i++) {
            if (i % 2 != 0) {    // jika jumlah karakter = ganjil
                int gantiInt = (int) gantiChar[i]; //dimanipulasi menjadi angka 
                kata += gantiInt;
            } else {             // jika genap = tidak diubah
                kata += gantiChar[i]; 
            }
        }
        char[] kataChar = kata.toCharArray(); //mengubah kata to char
        int jumlahKata = (int) Math.ceil(kataChar.length / 16.0); // Math.ceil untuk membulatkan ke atas bilangan desimal 
        int spasi = 0;
        for (int i = 0; i < jumlahKata * 16; i++) { //untuk matriks 4 x 4
            if (i < kataChar.length)      //jika i < jumlah karakter kataChar
                System.out.print(kataChar[i]); //akan diisi dengan manipulasi angka
            else
                System.out.print('?'); //untuk mengisi yang kosong dengan ?
            if ((i + 1) % jumlahKata == 0) { 
                if (spasi >= 3) { //agar matriks tetap 4 x 4 ,jika spasi lebih dari 3 matriks tidak akan 4 x4
                    System.out.println();
                    spasi = 0;
                } else {
                    System.out.print(" ");
                    spasi++;
                }
            }
        }
        }else{  //jika input jumlah karakter kurang dari 16
            System.out.println("Masukkan jumlah karakter > 16"); 
        }
        //2 hari khusus nomor ini ;)
       input.close(); 
    }
} 
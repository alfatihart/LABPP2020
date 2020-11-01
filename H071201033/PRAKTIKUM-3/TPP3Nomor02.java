import java.util.Scanner;
public class TPP3Nomor02 {
    public static void main(String[] args) {
        
        Scanner baris = new Scanner(System.in);
        System.out.println("\n-----Membuat Barisan Bilngan Berpola-----\n");
        System.out.println("Masukkan batas kolom dan batas angka;");
        
        int batasKolom = baris.nextInt();
        int batasAngka = baris.nextInt(); 
        int batasTetap = batasKolom; 

        System.out.println();
        
        if (batasKolom<batasAngka) {
        for (int i = 1 ; i <= batasAngka ; i+=batasTetap) {
            
          for (int j = i ; j <= batasKolom ; j++) {
            if (batasAngka >= j)  
            System.out.print( j + " ");
          }  

          System.out.println();
          batasKolom+=batasTetap;
           
        }

        System.out.println("\n");

    } else {
        System.out.println("Inputan invalid, mohon masukkan nilai batas kolom < batas angka\n");
    }

    }
    
    
}

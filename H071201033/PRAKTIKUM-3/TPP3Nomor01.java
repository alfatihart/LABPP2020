import java.util.Scanner;
public class TPP3Nomor01 {
    
    public static void main(String[] args) {
        
        Scanner Scan = new Scanner(System.in);
        System.out.println("\n---------Menentukan Jenis Bilangan---------\n");
        System.out.println("Masukkan nilai awal (x) dan nilai akhir (y)");
        int x = Scan.nextInt();
        int y = Scan.nextInt();
        int mod, x1, y1;

        if (x<=y) {
            x1 = x;
            y1 = y; 
        } else {
            x1 = y;
            y1 = x;
        }

        System.out.println("\nHasil analisis bilangan menunjukkan:");
 

        for (int i = x1; i<=y1; i++) {
            if (i<0) {
                mod = (i%2);
                if (mod==0) {
                    System.out.println(i + " adalah bilangan genap negatif");
                } else {
                    System.out.println(i + " adalah bilangan ganjil negatif");
                }

            } else if (i==0) {
                System.out.println(i + " adalah bilangan nol");

            } else {
                mod = (i%2);
                if (mod==0) {
                    System.out.println(i + " adalah bilangan genap positif");
                } else {
                    System.out.println(i + " adalah bilangan ganjil positif");
                }
            }

        }


    }
    
}

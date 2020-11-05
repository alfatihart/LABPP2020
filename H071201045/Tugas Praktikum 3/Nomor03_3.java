package tugaspraktikum3;
import java.util.Scanner;
public class Nomor03_3{
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // fibonacci
        int n; 
        int a = 0; 
        int b = 0; 
        int c = 1; 
        
        System.out.print("Masukkan bilangan : ");
        n = scan.nextInt();
        
        for(int i = 1; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
        }
    }
}
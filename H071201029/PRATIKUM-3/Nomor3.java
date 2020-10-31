package Pratikum3;
import java.util.Scanner;
public class Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nilai ke -  ");
        int n = input.nextInt();
        int i; 
        int a = 0; 
        int b = 1; 
        int c = 0; 

        for (i=1 ; i<=n ; i++){
            System.out.print( c + "  ") ;
            a=b;
            b=c;
            c=a + b;
            
        }
    }
}

import java.util.Scanner;
public class TPP3Nomor03 {
    public static void main (String[] args) {
        int A = 0, B = 1, Count = 2, Next;

        Scanner fibonacci = new Scanner(System.in);

        System.out.println("\n-----Menentukan dan Menuliskan Suku ke-n Barisan Fibonacci-----\n");
        System.out.print("Masukkan nilai n = ");
        int n = fibonacci.nextInt();

        
        if (n == 1) {
        System.out.println("\nBarisan fibonacci suku ke-" + n + ":");
        System.out.print(A);
        } else if (n >= 2) {
        System.out.println("\nBarisan fibonacci dari suku pertama hingga suku ke-" + n + ":");
        System.out.print(A);
        System.out.print(", " + B);
        } else {
            System.out.print("Inputan invalid, mohon masukkan inputan lebih besar dari nol");
        }

        for (int i = 0; Count < n; i++) {
           Next = (A + B);
        
        System.out.print( ", " + Next);
            A = B;
            B = Next;
            Count = Count + 1;
        }

       System.out.println("\n");

        
    }
}

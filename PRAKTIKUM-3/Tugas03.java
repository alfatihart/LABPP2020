import java.util.Scanner;

public class Tugas03 {
    public static void main(String[] args) {
        
        Scanner woi = new Scanner(System.in);
        int n = woi.nextInt();
        int a = 0;
        int b = 1;
        int c = 2;
        System.out.print(a + ", " + b );

        for (;c<n;c++){
            int d = a + b;
            System.out.print(", " + d);
            a=b;
            b=d;
        }
    }
    
}

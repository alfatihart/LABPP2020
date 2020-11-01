import java.util.Scanner;
public class TP03 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int a=0;
        int b=1;
        int f=0;

        for(int i=0; i<=n; i++){
            System.out.print(f+ " ");
            f=a+b;
            b=a;
            a=f;
        }
        input.close();
    }
    
}

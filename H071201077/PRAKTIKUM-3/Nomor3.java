import java.util.Scanner;
public class Nomor3 {
    public static void main(String[] args) {
        int a=0,b=1,c=2;
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        
        if(n>2){
            System.out.print(a + " " + b + " ");
        for (int i=0;i<n-2;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c + " ");}
        }else if(n==0){
            System.out.print("");
        }else if(n==1){
            System.out.print(a);
        }else if (n==2){
            System.out.print(a + " " + b);
        }else {
            System.out.println("Input Tidak Valid ");
        }
        input.close();
    }
}

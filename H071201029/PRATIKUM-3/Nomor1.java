package Pratikum3;
import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka");
        int x = input.nextInt();
        int y = input.nextInt();
        int a=0, b=0;

        if(x<y){
            a=x;
            b=y;
        }else{
            a=y;
            b=x;
        }

        for(int i=a ; i<=b; i++){
            if (a>0) {
                if(a%2==0){
                    System.out.printf("%d genap ",i);
                }else{
                    System.out.printf("%d ganjil ",i); 
                }if (a>=0){
                    System.out.println("positif");
                }else{
                    System.out.println("nol");   
                }        
            }
            else
            {
                if(a%2==0){
                    System.out.printf("%d genap ",i);
                }else{
                    System.out.printf("%d ganjil ",i);
                }
                System.out.println("negatif");
            }
        }     
    }
}
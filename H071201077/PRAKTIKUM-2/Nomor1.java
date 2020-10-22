import java.util.InputMismatchException;
import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        int a,b,c,d,e;  
        
        int positif=0,negatif=0,ganjil=0,genap=0;
        
        Scanner input=new Scanner(System.in);
    
        
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();
        e=input.nextInt();
        
    try { if (a%2==0){
            genap++;
        }else ganjil++;

        if (a>0) {
            positif++;
        }else {
            negatif++;
        }
        
        if (b%2==0){
            genap++;
        }else ganjil++;

        if (b>0) {
            positif++;
        }else {
            negatif++;
        }
        if (c%2==0){
            genap++;
        }else ganjil++;

        if (c>0) {
            positif++;
        }else {
            negatif++;
        }
        if (d%2==0){
            genap++;
        }else ganjil++;

        if (d>0) {
            positif++;
        }else {
            negatif++;
        }
        if (e%2==0){
            genap++;
        }else ganjil++;

        if (e>0) {
            positif++;
        }else {
            negatif++;
        }
        System.out.println(genap + " Angka Genap" );
        System.out.println(ganjil + " Angka Ganjil" );
        System.out.println(positif + " Angka Positif");
        System.out.println(negatif + " Angka Negatif");
    }catch (InputMismatchException ime){
            System.out.println("Input Tidak Valid");
        }finally {
            input.close();
        } 
    }
}
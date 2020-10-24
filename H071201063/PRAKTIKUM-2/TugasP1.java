import java.util.InputMismatchException;
import java.util.Scanner;
public class TugasP1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        //input
        try{
        int a = x.nextInt(); 
        int b = x.nextInt(); 
        int c = x.nextInt(); 
        int d = x.nextInt(); 
        int e = x.nextInt(); 
         
        //pengetesan
        int pengetesan1 = a % 2;
        int pengetesan2 = b % 2;
        int pengetesan3 = c % 2;
        int pengetesan4 = d % 2;
        int pengetesan5 = e % 2;

        //genap-ganjil
        int count_Ganjil = 0;
        int count_Genap = 0;
        if(pengetesan1 == 0){
            count_Genap +=1;
        }else{
            count_Ganjil +=1;}
        if(pengetesan2 == 0){
            count_Genap +=1;
        } else{
            count_Ganjil +=1;}
        if(pengetesan3 == 0){
            count_Genap +=1;
        } else{
            count_Ganjil +=1;}
        if(pengetesan4 == 0){
            count_Genap +=1;
        } else{
            count_Ganjil +=1;}
        if(pengetesan5 == 0){
            count_Genap +=1;
        } else{
            count_Ganjil +=1;}

        //positif-negatif
        int count_Positif = 0;
        int count_Negatif = 0;
        if (a > 0){
            count_Positif +=1;
        } else if(a < 0){
            count_Negatif +=1;
        } else{
            count_Positif +=0;
            count_Negatif +=0;
        }
        if (b > 0){
            count_Positif +=1;
        } else if(b < 0){
            count_Negatif +=1;
        } else{
            count_Positif +=0;
            count_Negatif +=0;
        }
        if (c > 0){
            count_Positif +=1;
        } else if(c < 0){
            count_Negatif +=1;
        } else{
            count_Positif +=0;
            count_Negatif +=0;
        }
        if (d > 0){
            count_Positif +=1;
        } else if(d < 0){
            count_Negatif +=1;
        } else{
            count_Positif +=0;
            count_Negatif +=0;
        }
        if (e > 0){
            count_Positif +=1;
        } else if(e < 0){
            count_Negatif +=1;
        } else{
            count_Positif +=0;
            count_Negatif +=0;
        }

        System.out.println(count_Genap + " Angka Genap");
        System.out.println(count_Ganjil + " Angka Ganjil");
        System.out.println(count_Positif + " Angka Positif");
        System.out.println(count_Negatif + " Angka Negatif");
        }
        
        catch (InputMismatchException eror1){
            System.out.println("Input tidak Valid");
        } 
        catch (ArithmeticException eror2) {
        System.out.println("Input tidak Valid");
        }
        finally{
            x.close();
        }


        x.close();
    }
    
}

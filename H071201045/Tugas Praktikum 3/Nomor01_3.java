package tugaspraktikum3;
import java.util.Scanner;

public class Nomor01_3 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int x = input.nextInt(); //nilai awal
        int y = input.nextInt(); //nilai akhir
        int i;
        int j;
        
        for (i = x; i<=y; i++) {
            if (i<0){
                if (i%2==0) 
                System.out.println(i + " genap negatif");
                else if (i>0)
                System.out.println(i + " genap positif");
                }
                  
             else {
                 if (i%2==1) 
                 System.out.println(i + " ganjil positif");
                 else if (i<0)
                 System.out.println(i + " ganjil negatif"); 
                 else if (i>0)
                 System.out.println(i + " genap positif"); 
                 } 

        for (j = y; j<=x; j++) {
            if (j<0){
                if (j%2==0) 
                System.out.println(i + " genap negatif");
                else if (j>0)
                System.out.println(i + " genap positif");
                else if (j<0)
                System.out.println(i + " ganjil negatif");
                }
                      
            else {
                if (j%2==1) 
                System.out.println(i + " ganjil positif");
                else if (j<0)
                System.out.println(i + " ganjil negatif"); 
                else if (j>0)
                System.out.println(i + " genap positif"); 
                 } 

             if  (i==0 && j==0) {
             System.out.println(i + " nol");} } }
             
               
            
           
        
        } 
   
   
   }

        



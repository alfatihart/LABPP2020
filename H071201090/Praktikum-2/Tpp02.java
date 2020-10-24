import java.util.Scanner;

public class Tpp02 {
    public static void main(String[] args) {
       try{ 
        Scanner woi = new Scanner(System.in);
       
        int a = woi.nextInt();
        int b = woi.nextInt();
        int c = woi.nextInt();
        int d = woi.nextInt();
        int e = woi.nextInt();
        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;
         if (a%2==0){
             genap++;
         }if (a%2!=0){
             ganjil++;
         }if (a>0){
             positif++;
         }else if (a<0){
             negatif++;
         }
         if (b%2==0){
            genap++;
        }if (b%2!=0){
            ganjil++;
        }if (b>0){
            positif++;
       }else if (b<0){
            negatif++;
        }
        if (c%2==0){
            genap++;
        }if (c%2!=0){
            ganjil++;
        }if (c>0){
            positif++;
        }else if (c<0){
            negatif++;
        }
        if (d%2==0){
            genap++;
        }if (d%2!=0){
            ganjil++;
        }if (d>0){
            positif++;
        }else if (d<0){
            negatif++;
        }
        if (e%2==0){
            genap++;
        }if (e%2!=0){
            ganjil++;
        }if (e>0){
            positif++;
        }else if (e<0){
            negatif++;
        }


         System.out.println(genap + " Angka Genap");
         System.out.println(ganjil + " Angka Ganjil");
         System.out.println(positif + " Angka Positif");
         System.out.println(negatif + " Angka Negatif");
    }
         catch(Exception a){
             System.out.println("Inputan Tidak Valid");
         }
    }
    
}

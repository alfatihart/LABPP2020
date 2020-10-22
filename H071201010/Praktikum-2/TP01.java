import java.util.*;
public class TP01 {
    public static void main(String[] args) {
        Scanner user= new Scanner(System.in);

        int genap, ganjil, negatif, positif;
        genap=0;
        ganjil=0;
        negatif=0;
        positif=0;
        int a;
        
        System.out.println("Masukkan 5 Angka= ");
        try{
        for (int i = 1; i <= 5; i++){
            a= user.nextInt();
            
            if (a%2 == 0) {
            genap= genap + 1;
            } else {
            ganjil= ganjil + 1;
            }
            if(a>0){
                positif= positif + 1;
            }else if(a<0){
                negatif= negatif + 1;
            }
        }
         System.out.println(genap+" Angka Genap");
         System.out.println(ganjil+" Angka Ganjil");
         System.out.println(positif+" Angka Positif");
         System.out.println(negatif+" Angka Negatif");
    }catch(Exception e){
    System.out.println("Inputan Tidak Valid");
    }
}    
}  




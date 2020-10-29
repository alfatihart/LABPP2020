import java.util.Scanner;
public class TP01{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       try{ 
        int x= input.nextInt();
        int y= input.nextInt();

        if(x>y){
            int temp= y;
            y= x;
            x= temp;
        }
            for(int i=x ;i<=y; i++){
                if(i<0 && i%2==0){
                    System.out.println(i+" genap negatif");
                }else if(i<0 && !(i%2==0)){
                    System.out.println(i+" ganjil negatif");
                }else if(i==0){
                    System.out.println(i);
                }else if(i>0 && i%2==0){
                    System.out.println(i+" genap positif");
                }else if(i>0 && !(i%2==0)){
                    System.out.println(i+" ganjil positif");
                }
            }
        }catch(Exception e){
            System.out.println("Harap Memasukkan Bilangan Integer");
            input.close();
        }

    }
}
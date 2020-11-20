import java.util.Scanner;

public class Nomor01_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nilai1 = scan.nextInt();
        int nilai2 = scan.nextInt();

        System.out.println("FPB dari " + nilai1 + " dan " + nilai2 + " = " + cariFPB(nilai1, nilai2));
    }

static int cariFPB (int a, int b){
      
        while(b != 0){ 
        if(a > b){  
        a -= b;
        }  
        else{  
        b -= a;
        }  
        }  
        return a;    
}
}

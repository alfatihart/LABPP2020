import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {

        Scanner woi = new Scanner(System.in);

        int a = woi.nextInt();
        int b = woi.nextInt();
        
        for(int x = 1;x<=b;x++){
           if (x%a==0){
               System.out.print(x + "\n");
             }else{
                 System.out.print(x + " ");
             }
            
        }
    }
    
}

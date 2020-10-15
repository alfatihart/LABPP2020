import java.util.Scanner;

public class tugas03 {
    public static void main(String[] args) {
       Scanner sum = new Scanner(System.in);
    
       double h = sum.nextInt();
       double a = sum.nextInt();
       double b = sum.nextInt();

       double z = Math.tan(Math.toRadians(a));
       double x = Math.tan(Math.toRadians(b));

       System.out.printf("%.1f",h*(z-x));
       
        
    
    
    
    
    
    
    
    
    
    
    }
}
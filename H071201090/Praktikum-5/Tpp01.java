import java.util.*;

public class Tpp01{

    public static void main(String[] args) {
        Scanner lah = new Scanner(System.in);
        int X = lah.nextInt();
        int Y = lah.nextInt();

        fpb(X,Y);
        

    }
    private static int cariFPB(int x,int y){
        return (y == 0) ? x : cariFPB(y, x % y);
        
            
            
            
    }
    private static void fpb(int x , int y){
        System.out.print("FPB dari " + x +" dan " + y + " = " + cariFPB(x,y));
    }
}
    
        
    

import java.util.*;
public class No01{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int FPB = cariFPB(a, b);
        System.out.println("FPB dari " + a + " dan " + b + " = " + FPB);

    }
    private static int cariFPB(int a, int b){
        return (b == 0) ? a : cariFPB(b, a % b);
    }
}
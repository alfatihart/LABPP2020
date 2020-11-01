import java.util.Scanner;
public class SoalP2{
    public static void main(String[] args){
        Scanner iqra = new Scanner(System.in);

        System.out.println("Masukkan X = ");
        int x = iqra.nextInt();

        System.out.println("Masukkan Y = ");
        int y = iqra.nextInt();

        System.out.println(" ");

        int i = 0;
        while(i < y){
            i++;
            if(i % x == 0){
                System.out.println(i);
                }
            else if(i % x !=0){
                System.out.print(i + " ");
                }
        }
        iqra.close();
    }   
} 

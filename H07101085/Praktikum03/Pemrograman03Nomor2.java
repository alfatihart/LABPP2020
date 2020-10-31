import java.util.Scanner;
public class Pemrograman03Nomor2 {
    public static void main(String[] args){
        Scanner vina = new Scanner(System.in);

        System.out.println("Masukkan X = ");
        int x = vina.nextInt();

        System.out.println("Masukkan Y = ");
        int y = vina.nextInt();

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
        vina.close();
    }   
} 


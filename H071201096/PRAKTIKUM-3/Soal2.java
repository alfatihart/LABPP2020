import java.util.Scanner;
public class Soal2{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("Masukkan X = ");
        int x = read.nextInt();

        System.out.println("Masukkan Y = ");
        int y = read.nextInt();

        System.out.println(" ");

        int i = 0;
        while(i < y) {
            i++;
            if(i % x == 0){

                System.out.println(i);
                }
            else if(i % x !=0){
                System.out.print(i + " ");
                }
        }
        read.close();
    }   
} 

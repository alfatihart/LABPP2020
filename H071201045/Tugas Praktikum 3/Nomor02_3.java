package tugaspraktikum3;
import java.util.Scanner;
public class Nomor02_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // x < y
        int x = input.nextInt(); // kolom
        int y = input.nextInt(); // hingga
        
        for (int i = 1; i <= y; i++){
            if(i%x == 0)
                System.out.println(i + " ");
            else 
                System.out.print(i + " ");
            }
        }
    }


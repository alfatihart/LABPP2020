import java.util.Scanner;
public class Praktikum03 {

    public static void main(String[] args) {

        int h, a, b;
        double panjangTotal, panjangSebagian, panjangKapal;
        
        Scanner input = new Scanner(System.in);

        h = input.nextInt();
        a = input.nextInt();
        b = input.nextInt();

            panjangTotal = Math.tan(Math.toRadians(a))*h;
            panjangSebagian = Math.tan(Math.toRadians(b))*h;
            panjangKapal = panjangTotal - panjangSebagian;

            System.out.printf("%.1f%s", panjangKapal, " m "); 
      

    }

}
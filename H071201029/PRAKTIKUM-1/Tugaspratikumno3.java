
import java.util.Scanner;
public class Tugaspratikumno3 {
    public static void main(String[] args) {
        Scanner kpl = new Scanner(System.in);
        System.out.println("Masukkan tinggi menara ");
        int h = kpl.nextInt();
        System.out.println("Masukkan sudut elevansi ujung belakang kapal");
        int a = kpl.nextInt();
        System.out.println("Masukkan sudut elevansi ujung depan kapal");
        int b = kpl.nextInt();

        double  tanB = Math.tan(Math.toRadians(b));
        double  tanA = Math.tan(Math.toRadians(a));

        double pjn = (h * tanA) - (h * tanB);
        if (90 > a && a > b){
           System.out.printf("Panjang kapal adalah : %.1f m", pjn);
        }
        else{
            System.out.printf("-----EROR!-----");

        } 
    }
}

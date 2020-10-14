import java.util.Scanner;
public class Nomor03 {

    public static void main(String[] args) {
        
        Scanner obj1 = new Scanner(System.in);
        System.out.printf("Masukkan ketinggian menara (h) dalam meter = ");
        float h = obj1.nextFloat();

        System.out.printf("Masukkan sudut elevasi pengamat terhadap ujung belakang kapal (a) = ");
        float a = obj1.nextFloat();

        System.out.printf("Masukkan sudut elevasi pengamat terhadap ujung depan kapal (b) = ");
        float b = obj1.nextFloat();

        double jBelakang = (Math.tan(Math.toRadians(a))*h);
        double jDepan = (Math.tan(Math.toRadians(b))*h);

        double PK = (jBelakang - jDepan);
        
        if (90 > a && a > b){  
        System.out.printf("Panjang kapal = " + String.format("%.1f", PK) + " m");
        } else {
            System.out.printf("Error : Maaf, Data yang anda masukkan salah. Mohon masukkan ulang data yang benar");
        }

       
    }
    
}

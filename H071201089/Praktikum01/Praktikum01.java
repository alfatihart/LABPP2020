import java.util.Scanner;
    public class Praktikum01 {
        public static void main(String[] args) {
            
            int waktu, kecepatan;
            float totalBensin;
    
            Scanner input = new Scanner(System.in);
    
            waktu = input.nextInt();
            kecepatan = input.nextInt();
    
            totalBensin = ((float)waktu*kecepatan)/14;
    
            System.out.printf("%s%.3f%s", "Bensin Yang Digunakan : ", totalBensin, " L "); 
    
        }
    }
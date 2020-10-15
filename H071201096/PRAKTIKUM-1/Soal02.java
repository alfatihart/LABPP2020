import java.util.Scanner;
public class Soal02 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Detik");
        int D = input.nextInt();
        // J = Jam
        int J = D/3600;
        // SD = sisa detik
        int SD = D-(J*3600);
        // M = Menit
        int M = SD/60;
        //DT = detik
        int DT = SD-(M*60);

        System.out.printf("%02d : %02d : %02d", J,M,DT);
        
    }
    
}

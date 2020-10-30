package Pratikum3;
import java.util.Scanner;
public class Nomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            float M = input.nextFloat();
            if (0 <= M && M < 360) {
                int sec = (int) (M * 86400) / 360;
                int HH = (sec / 3600) + 6;
                int MM = (sec % 3600) / 60;
                int SS = (sec % 3600) % 60;
                if (M >= 0 && M < 90) { // jam 06.00-11.59
                    System.out.println("Selamat Pagi");
                } else if (M >= 90 && M < 150) {// jam 12.00-15.59
                    System.out.println("Selamat Siang");
                } else if (M >= 150 && M < 195) {// jam 16.00-18.59
                    System.out.println("Selamat Sore");
                } else if (M >= 195 && M < 270) {// jam 19.00-23.59
                    System.out.println("Selamat Malam");
                } else if (M >= 270 && M < 360) {// jam 00.00-05.59
                    System.out.println("Dini Hari");
                }
                System.out.printf("%02d:%02d:%02d \n", HH, MM, SS);
            } else {
                System.out.println("End of File");
            }
        }
    }
}

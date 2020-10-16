import java.util.Scanner;
public class Praktikum02 {
    public static void main(String[] args) {

        int jam, menit, detik, totalDetik;

        Scanner input = new Scanner(System.in);

        totalDetik = input.nextInt();

        jam = totalDetik/3600;
        menit = ((totalDetik%3600)/60);
        detik = totalDetik%60;
        
        System.out.printf("%02d:%02d:%02d",jam,menit,detik);
    }
}
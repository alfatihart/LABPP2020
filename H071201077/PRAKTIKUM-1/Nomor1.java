import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        //t = waktu yang ditempuh
        //v= kecepatan rata- rata
        int t;
        int v;
        System.out.println("Masukkan waktu dan kecepatan");
        t=x.nextInt();
        v=x.nextInt();

        double jarak= t * v;
        double bensin =jarak / 14;
      

        System.out.printf("Bensin Yang Digunakan : %.3f L",bensin);

    }
}

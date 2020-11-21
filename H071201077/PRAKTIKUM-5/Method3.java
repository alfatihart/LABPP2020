import java.util.Scanner;
public class Method3 {

    public static void myDay(int n) {
        int tahun=n/365;
        int sisaHari=n%365;
        int bulan=sisaHari/30;
        int hari=sisaHari%30;
        System.out.println("Tahun: " + tahun + " " + "Bulan: " + bulan + " " +  "Hari: " + hari);

    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        myDay(n);
    }
}

import java.util.Scanner;
public class Nomor03_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int umur = scan.nextInt();
        myDay(umur);
    }
    public static void myDay(int umurHari) {
        int tahun = umurHari/365;
        int bulan = (umurHari % 365)/30;
        int hari = (umurHari%365)%30;

        System.out.println(tahun + "tahun");
        System.out.println(bulan + "bulan");
        System.out.println(hari + "hari");
    }
}


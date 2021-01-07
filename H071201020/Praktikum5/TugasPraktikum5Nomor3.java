import java.util.Scanner;

public class TugasPraktikum5Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hari = input.nextInt();
        myDay(hari);
    }

    static void myDay(int a) {
        int tahun, bulan;
        tahun = a / 365;
        a -= (365 * tahun);
        bulan = a / 30;
        a -= (30 * bulan);
        System.out.printf("%d tahun\n%d bulan\n%d hari", tahun, bulan, a);
    }
}

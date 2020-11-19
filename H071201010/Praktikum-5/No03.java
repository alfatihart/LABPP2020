import java.util.*;
public class No03 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int d= scan.nextInt();
        myDay(d);
    }
    private static void myDay(int d){
        int years = d / 360;
		int months = (d % 360) / 30;
		int days = (d % 360) % 30;
		System.out.printf("%d tahun\n%d bulan\n%d hari", years, months, days);
    }
}

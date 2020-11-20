import java.util.Scanner;
class Soal3{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int day = x.nextInt();
        System.out.print(myDay(day) + " hari");
        x.close();
    }
    public static int myDay(int day){
        int bulan,tahun;
        tahun = day / 365;
        day = day -(365 * tahun);
        bulan = day / 30;
        day = day - (30 * bulan);
        System.out.println(tahun + " tahun" +  "\n" + bulan + " bulan");
        return day;
    }
}
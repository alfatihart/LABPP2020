import java.util.*;

public class Tpp03 {
    public static void main(String[] args) {
        
        Scanner lah = new Scanner(System.in);
        int hari = lah.nextInt();
        myDay(hari);

    }
    private static void myDay(int hari){
        int tahun = hari/365;
        int bulan = (hari%365)/30;
        int harian = (hari%365)%30;

        System.out.println(tahun + " tahun");
        System.out.println(bulan + " bulan");
        System.out.println(harian + " hari");

       }



    }
    


import java.util.Scanner;
public class Pemrograman05Nomor3 {

  public static void main(String[] args) {
      Scanner vina = new Scanner(System.in);
      System.out.print("Masukkan Usia: ");
      int usia = vina.nextInt();
      myDay(usia);
  }
  public static void myDay(int usiaHari){
    int tahun = usiaHari / 365;
    System.out.println(tahun + " tahun");
    int bulan = (usiaHari % 365) / 30;
    System.out.println(bulan + " bulan");
    int hari = (usiaHari % 365) % 30;
    System.out.println(hari + " hari");

  }
}
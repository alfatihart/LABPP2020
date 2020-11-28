import java.util.Scanner;
import java.util.Random;
public class Nomor02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    String serialNumber = generateSerial(n, m);
    System.out.println(serialNumber);

  }
  public static String generateSerial(int n,int m){
    String str = "";
    Random angka = new Random();
    for(int i = 1; i <= n; i++){
      for(int j = 1; j<= m; j++){
        int nilai = angka.nextInt(10);
        str += String.valueOf(nilai);
      }
      if(i == n){
        str += " ";
      }
      else{
        str += "-";
      }
    }
    return str;
  }
}
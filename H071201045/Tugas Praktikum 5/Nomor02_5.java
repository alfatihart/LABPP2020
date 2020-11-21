import java.util.Scanner;
import java.util.Random;

public class Nomor02_5 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    String serialNumber = generateSerial(n, m);
    System.out.println(serialNumber);    
    }
    public static String generateSerial (int n, int m) {
        //lengkapi
        String str = "";
        Random nomor = new Random();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){
                int nilai = nomor.nextInt(10);
                str += String.valueOf(nilai);
            }
            if (i==n){
                str += " ";
            } else { 
                str+= "-";
            }
        }
        return str;
    }
}

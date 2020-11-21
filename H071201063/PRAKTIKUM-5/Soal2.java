import java.util.Scanner;
import java.util.Random;
public class Soal2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
        scanner.close();
        }

    public static String generateSerial (int n, int m) {
        Random rand = new Random();
        int[][] angka = new int[n][m];
        String str = new String();
        for(int i = 0; i < angka.length;i++){
            for(int j = 0; j<angka[i].length;j++){
                angka[i][j] = rand.nextInt(9);
            }
        }
        for(int i = 0; i < angka.length;i++){
            for(int j = 0; j<angka[i].length;j++){
                str += Integer.toString(angka[i][j]);
            }
            if(i<angka.length-1){
                str+="-";
            }
        }
        return str;
    }
}

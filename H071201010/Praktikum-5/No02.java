import java.util.*;
import java.util.Random;
public class No02 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String hasil= generateSerial(n, m);
        System.out.print(hasil);
    }

private static String generateSerial(int n, int m){
    int [][] angka= new int [n][m];
    Random angkRandom = new Random();
    String str = "";
    for(int i=0 ; i < n; i++){
        for(int j=0; j < m; j++){
            angka[i][j] = angkRandom.nextInt(9);
        }
    }
    for(int i=0 ; i < n; i++){
        for(int j=0; j < m; j++){
            str = Integer.toString(angka[i][j]);
            System.out.print(str);
            }
            if(i == n-1){
                System.out.print("");
            }else{
                System.out.print("-");
            }
        }
    return str;
    }
}
import java.util.Scanner;
import java.util.Random;
public class Method2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();

        String serialNumber = generateSeries(n,m);
        System.out.println(serialNumber);
    }
    public static String generateSeries(int n, int m){
        Random angka= new Random();
        String str="";
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                int angka1=angka.nextInt(10); //membuat angka  random 0 sampai 9
                str +=String.valueOf(angka1);
            }
            if(i != n){
                str += "-";
            }else{
                str += " ";
            }
        }
		return str;

    }
}
import java.util.Scanner;
import java.util.Random;

public class TugasPraktikum5Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }

    public static String generateSerial(int n, int m) {
        Random rndm = new Random();
        StringBuilder strBuild = new StringBuilder();
        int[][] num = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                num[i][j] = rndm.nextInt(10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j < m) {
                    strBuild = strBuild.append(num[i][j]); // append --> menambahkan String yang ditentukan
                } else if (j == m) {
                    strBuild = strBuild.append(i == n - 1 ? "" : "-");
                }
            }
        }
        String str = strBuild.toString(); // Mengembalikan objek String dari StringBuilder
        return str;
    }
}

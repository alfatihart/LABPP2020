package Pratikum5;

import java.util.Random;
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }
    public static String generateSerial(int n, int m) {
        Random x = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= m; j++) {
                int value = x.nextInt(9);
                System.out.printf("%d", value);
                if (j % m == 0 && i < n - 1) {
                    System.out.print("-");
                }
            }
        }
        String str = "";
        return str;
    }
}

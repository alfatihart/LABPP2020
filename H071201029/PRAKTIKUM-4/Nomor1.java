package Pratikum4;

import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = Math.min(x[i], x[j]);
                boolean isCoPrime = true;

                for (int k = a; k > 1; k--) {
                    if ((x[i] % k == 0) && (x[j] % k == 0)) {
                        isCoPrime = false;
                        break;
                    }
                }
                if (isCoPrime) {
                    System.out.println(x[i] + " " + x[j]);
                }

            }
        }
    }
}

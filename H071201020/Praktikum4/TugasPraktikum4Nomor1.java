import java.util.Scanner;

public class TugasPraktikum4Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] array = new int[n];
        int fpb = 0;

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int min = Math.min(array[i], array[j]);
                for (int k = 1; k <= min; k++) {
                    if ((array[i] % k == 0) && (array[j] % k == 0)) {
                        fpb = k;
                    }
                }
                if (fpb == 1) {
                    System.out.println(array[i] + " " + array[j]);
                }
                // System.out.printf("FPB dari %d dan %d adalah %d\n", array[i], array[j], fpb);
            }
        }
    }
}

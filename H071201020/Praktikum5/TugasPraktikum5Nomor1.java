import java.util.Scanner;

public class TugasPraktikum5Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int fpb = cariFPB(num1, num2);
        System.out.printf("FPB dari %d dan %d = %d", num1, num2, fpb);
    }

    static int cariFPB(int a, int b) {
        int fpb = 0;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                fpb = i;
            }
        }
        return fpb;
    }
}

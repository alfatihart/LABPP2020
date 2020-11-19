import java.util.Scanner;

public class Soal01_Idil {
    public static void main(String[] args) {
        Scanner mbrr = new Scanner(System.in);

        System.out.print("Masukkan Nilai Pertama: ");
        int nilaiPertama = mbrr.nextInt();

        System.out.print("Masukkan Nilai Kedua: ");
        int nilaiKedua = mbrr.nextInt();

        System.out.println(
                "FPB dari " + nilaiPertama + " dan " + nilaiKedua + " = " + valueFPB(nilaiPertama, nilaiKedua));
    }

    static int valueFPB(int nilaiX, int nilaiY) {
        int nilaiZ = 0;
        int nilaiMax = Math.max(nilaiX, nilaiY);
        int i = nilaiMax;
        while (i > 0) {
            i--;
            if (nilaiX % i == 0 && nilaiY % i == 0) {
                nilaiZ += i;
                break;
            }
        }
        return nilaiZ;
    }
}
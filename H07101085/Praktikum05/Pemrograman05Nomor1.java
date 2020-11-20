import java.util.Scanner;
public class Pemrograman05Nomor1 {
  public static void main(String[] args) {
    Scanner vina = new Scanner(System.in);

    System.out.print("Masukkan Nilai Pertama: ");
    int nilaiPertama = vina.nextInt();

    System.out.print("Masukkan Nilai Kedua: ");
    int nilaiKedua = vina.nextInt();

    System.out.println("FPB dari " + nilaiPertama + " dan " + nilaiKedua + " = " + nilaiFPB(nilaiPertama,nilaiKedua));
  }
  static int nilaiFPB(int nilaiX, int nilaiY){
      int nilaiZ = 0;
      int nilaiMax = Math.max(nilaiX, nilaiY);
      int i = nilaiMax;
      while(i > 0){
        i--;
        if(nilaiX % i == 0 && nilaiY % i == 0){
          nilaiZ += i;
          break;
        }
    }
    return nilaiZ;
  }
}
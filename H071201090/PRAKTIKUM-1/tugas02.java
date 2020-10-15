import java.util.Scanner;

public class tugas02 {
public static void main(String[] args) {
    Scanner nilai = new Scanner(System.in);
    
    System.out.print("Time : ");
    int time = nilai.nextInt();

    int jam = time/3600;
    int sisa = time%3600;
    int menit = sisa/60;
    int detik = sisa%60;

    System.out.print(jam + ":");
    if(menit<10){
        System.out.print("0");
    }
    System.out.print(menit + ":");
    System.out.print(detik);
}
    
}

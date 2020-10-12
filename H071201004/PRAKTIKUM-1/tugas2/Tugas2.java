import java.util.Scanner;

class Tugas2 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        System.out.println("Masukkan detik:");
        int detik = ax.nextInt();           
        int dd = detik % 60;                //jj = jam
        int jj = detik / 60;                //mm = menit
        int mm = jj % 60;                   //dd = detik
        jj = jj / 60;

        System.out.printf("%02d:%02d:%02d", jj, mm, dd);  
    }
}
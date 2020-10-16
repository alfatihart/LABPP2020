import java.util.Scanner ; 

public class Tugaspratikumno2 {
    public static void main(String[] args) {
        Scanner ipp = new Scanner(System.in);
        System.out.println("Masukkan jumlah detik");
        int m = ipp.nextInt();

        int hh = ( m  / 3600);
        int mm = ((m % 3600) / 60);
        int ss = ((m % 3600) % 60);

        String temp = String.format("Maka waktunya adalah %02d:%02d:%02d", hh ,mm ,ss);
        System.out.println(temp);  

    }
    
}

import java.util.Scanner;
public class Tugas5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Masukan  Derajat");
        while(x.hasNextFloat()){
            float  m = x.nextFloat();
            int waktu =(int) (m * 240);
            double jam, sisaJ, menit, sisaM, detik;

            jam = Math.floor(6 + (waktu/3600));
            sisaJ = waktu % 3600;
            menit = Math.floor(sisaJ/60);
            sisaM = sisaJ % 60;
            detik = sisaM;

            if(m >= 0 && m <= 360){
                if(jam >= 24){
                    jam = jam - 24;
                }
                if(jam >= 0  && jam < 12){
                    System.out.println("Selamat Pagi");
                }else if(jam >=12 && jam < 15){
                    System.out.println("Selamat Siang");
                }else if(jam >= 15 && jam < 18){
                    System.out.println("Selamat Sore");
                }else if(jam >= 18 && jam < 24){
                    System.out.println("Selamat Malam");
                }
                System.out.printf("%.0f:%.0f:%.0f", jam, menit, detik);
                System.out.println();
            }else{       
                System.out.println("Derajat harus 0 >= derajat <= 360");
            }
        }
        x.close();
    }
}
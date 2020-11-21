import java.util.Scanner;
public class Nomor5 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int jam,menit,detik,waktu;


        while(input.hasNextBigDecimal()){
            
        float derajat =input.nextFloat();
    
        waktu=(int)(derajat * 240);
            
        jam=(6 + (waktu/3600));
        menit=waktu%3600/60;
        detik=waktu%60;
              
            if (0 <= derajat && derajat < 360){
                if(jam >=24){
                    jam -= 24;}

                if ( 0 <= jam && jam < 12){
                    System.out.println("Selamat Pagi");
                }else if ( 12 <= jam && jam <15){
                    System.out.println("Selamat Siang");
                }else if (15 <= jam && jam < 18){
                    System.out.println("Selamat Sore");
                }else if (18<= jam && jam < 24){
                    System.out.println("Selamat Malam");
                }
            
                System.out.printf("%02d:%02d:%02d\n",jam,menit,detik);
            }else if(derajat==360){
                System.out.println("Waktu Derajat 360=0 ,input dengan syarat 0<= derajat < 360 ");
            }else System.out.println("Input tidak valid,input dengan syarat 0<= derajat < 360");
            
        }
        input.close();
    }
}

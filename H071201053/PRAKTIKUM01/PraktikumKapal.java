import java.util.Scanner;
public class PraktikumKapal {

   public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
       System.out.println("masukkan ketinggian menara, sudut elevasi ujung depan kapal, dan sudut elevasi ujung belakang kapal");
       float H = x.nextFloat();
       float a = x.nextFloat();
       float b = x.nextFloat();

       double Y = Math.tan(Math.toRadians(b))*H;
       double panjangKapal =( Math.tan(Math.toRadians(a))*(double)H)- Y;
	   
	   
       System.out.printf("panjangKapal : "+"%.1f",panjangKapal);
       System.out.print("Meter");


    }



 }
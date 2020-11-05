import java.util.Scanner;

public class Tugas05 {
    public static void main(String[] args) {
        
        Scanner woi = new Scanner(System.in);

       while(woi.hasNextBigDecimal()){
        float a = woi.nextFloat();
        if (a>=0&&a<360){
        float time = a*240;


      int jam = (int)(time/3600)+6;
        int sisa = (int)time%3600;
        int menit = sisa/60;
       int detik = sisa%60;

       if(jam>=24){
        jam-=24;}

        if (jam>=6&&jam<12){
            System.out.println("Selamat Pagi");
            System.out.print(jam + ":");
        if(menit<10){
            System.out.print("0");
        }
        System.out.print(menit + ":");
        if(detik<10){
            System.out.print("0");
        }
        System.out.print(detik);
    }if (jam>=12&&jam<16){
        System.out.println("Selamat Siang");
        System.out.print(jam + ":");
        if(menit<10){
            System.out.print("0");
        }
        System.out.print(menit + ":");
        if(detik<10){
            System.out.print("0");
        }
        System.out.print(detik);
    }if (jam>=16&&jam<18){
        System.out.println("Selamat Sore");
        System.out.print(jam + ":");
        if(menit<10){
            System.out.print("0");
        }
        System.out.print(menit + ":");
        if(detik<10){
            System.out.print("0");
        }
        System.out.print(detik);
    }if (jam>=18||jam<6){
        System.out.println("Selamat Malam");
        System.out.print(jam + ":");
        if(menit<10){
            System.out.print("0");
        }
        System.out.print(menit + ":");
        if(detik<10){
            System.out.print("0");
        }
        System.out.print(detik +"\n");
    }
    }
    }woi.close();
    }
   }
        

        
    

    



import java.util.Scanner;
public class Kasir {
    public static void main(String[] args) {
        //harga=h ; uang=u ; kembalian=k
        int h,u;
        int seratus=0,limaPuluh=0,duaPuluh=0,sepuluh=0,lima=0,dua=0,seribu=0;
        Scanner input=new Scanner(System.in);
        h=input.nextInt();
        u=input.nextInt();
        
        int k=u-h;
        if(h<u){
            while(k>0){
                if (k >= 100000){
                    k -=100000;
                    seratus++;
                }else if (k >=50000){
                    k -=50000;
                    limaPuluh++;
                }else if (k >= 20000){
                    k -=20000;
                    duaPuluh++;
                }else if (k >= 10000){
                    k -=10000;
                    sepuluh++;
                }else if (k >= 5000 ){
                    k -=5000;
                    lima++;
                }else if (k >=2000){
                    k -= 2000;
                    dua++;
                }else if (k >=1000){
                    k -=1000;
                    seribu++;}
            }
            System.out.println( seratus + " uang Rp. 100.000");
            System.out.println( limaPuluh + " uang Rp. 50.000");
            System.out.println( duaPuluh + " uang Rp. 20.000");
            System.out.println( sepuluh + " uang Rp. 10.000");
            System.out.println( lima + " uang Rp. 5.000");
            System.out.println( dua + " uang Rp. 2.000");
            System.out.println( seribu + " uang Rp. 1.000");
        }else if (h==u){
            System.out.println("Uang Kamu Pas, Tidak ada Kembalian ");
        }else {
            System.out.println("Uang Kamu Kurang");
        }
        input.close();
    }
}

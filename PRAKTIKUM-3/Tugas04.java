import java.util.Scanner;

public class Tugas04 {
    public static void main(String[] args) {
        
        Scanner woi = new Scanner(System.in);
        int a = woi.nextInt();
        int b = woi.nextInt();
        int x = b-a;
        int merah = 100000;
        int biru = 50000;
        int hijau = 20000;
        int ungu = 10000;
        int kuning = 5000;
        int abu = 2000;
        int cream = 1000;

        int uang1,uang2,uang3,uang4,uang5,uang6,uang7;
        boolean z = true;

        uang1=0;
        uang2=0;
        uang3=0;
        uang4=0;
        uang5=0;
        uang6=0;
        uang7=0;

        if(x>=merah){
            while(z){
            x = x - merah;
            uang1++;
            if(x<merah){
                z = false;
            }
            } 
        }if (x>=biru&&x<merah){
            z=true;
            while(z){
                x = x - biru;
                uang2++;
                if(x<biru){
                 z= false;
                }
        }
        }if (x>=hijau&&x<biru){
            z=true;
            while(z){
                x = x - hijau;
                uang3++;
                if(x<hijau){
                 z= false;
                }
            }
        }if (x>=ungu&&x<hijau){
            z=true;
            while(z){
                x = x - ungu;
                uang4++;
                if(x<ungu){
                 z= false;
                }
            }
        }if (x>=kuning&&x<ungu){
            z=true;
            while(z){
                x = x - kuning;
                uang5++;
                if(x<kuning){
                 z= false;
                }
            }
        }if (x>=abu&&x<kuning){
            z=true;
            while(z){
                x = x - abu;
                uang6++;
                if(x<abu){
                 z= false;
                }
            }
        }if (x>=cream&&x<abu){
            z=true;
            while(z){
                x = x - cream;
                uang7++;
                if(x<cream){
                 z= false;
                }
            }
        }
        System.out.println(uang1 + " uang Rp. 100.000");
        System.out.println(uang2 + " uang Rp. 50.000");
        System.out.println(uang4 + " uang Rp. 10.000");
        System.out.println(uang3 + " uang Rp. 20.000");
        System.out.println(uang5 + " uang Rp. 5.000");
        System.out.println(uang6 + " uang Rp. 2.000");
        System.out.println(uang7 + " uang Rp. 1.000");
}
}

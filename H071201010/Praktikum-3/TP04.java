import java.util.Scanner;
public class TP04 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Harga Barang");
        int x= input.nextInt();
        System.out.println("Uang yang dibayarkan");
        int y= input.nextInt();

        int k1= 0;
        int k2= 0;
        int k3= 0;
        int k4= 0;
        int k5= 0;
        int k6= 0;
        int k7= 0;

        int z= y-x; //z= kembalian

        if(x<y){
        for(int i=1; i<=7; i++){
            if(z>=100000){
                k1++;
                z-=100000;
            }
            else if(z>=50000){
                k2++;
                z-=50000;
            }
            else if(z>=20000){
                k3++;
                z-=20000; 
            }
            else if(z>=10000){
                k4++;
                z-=10000;
            }
            else if(z>=5000){
                k5++;
                z-=5000;
            }
            else if(z>=2000){
                k6++;
                z-=2000;
            }
            else if(z>=1000){
                k7++;
                z-=1000;
            }
        }
        System.out.println(k1+ " uang Rp. 100.000");
        System.out.println(k2+ " uang Rp. 50.000");
        System.out.println(k3+ " uang Rp. 20.000");
        System.out.println(k4+ " uang Rp. 10.000");
        System.out.println(k5+ " uang Rp. 5.000");
        System.out.println(k6+ " uang Rp. 2.000");
        System.out.println(k7+ " uang Rp. 1.000");
    }else{
        System.out.println("Uang anda tidak mencukupi");
    }
    input.close();
}
}

import java.util.Scanner;
public class Method1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan 2 Angka");
        int n=input.nextInt();
        int m=input.nextInt();
        System.out.println(cariFPB(n, m));

    }

    public static int cariFPB(int n, int m) {
        if(n==0){
            return m;}
        if(m==0){
            return n;

        }
        
        if(n==m){
            return n;
        }
        
        if(n>m){
            return cariFPB(n-m,m);
        }else{
            return cariFPB(n, m - n);
        }
    }
}

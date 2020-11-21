import java.util.Scanner;
class Soal1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.print("FPB dari " + a + " dan " + b + " adalah = " + cariFPB(a, b));
        scan.close();
    }
    public static int cariFPB(int a, int b){
        int c;
        if(a > b){
            c = a % b;
            while(c != 0){
                a = b;
                b = c;
                c = a % b;
            }
        }else{
            c = b % a;
            while(c != 0){
                a = b;
                b = c;
                c = a % b;
            }
        }
        return b;
    }
}
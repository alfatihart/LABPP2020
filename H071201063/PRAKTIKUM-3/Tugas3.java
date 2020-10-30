import java.util.Scanner;
class Tugas3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int a = 0; //Nilai Pertama
        int b = 1; //Nilai Kedua
        int c = 0; //Fibonacci
        System.out.println("Masukan nilai Fibonacci keberapa yang diinginkan!");
        int n = x.nextInt(); //Nilai Fibonacci ke -N

        System.out.println();
        for(int i = 1 ; i <= n ; i++){
            System.out.printf("%d ", c);
            a = b;
            b = c;
            c = a + b;
        }
        x.close();
    }
}
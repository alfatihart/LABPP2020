import java.util.Scanner;
public class  Soal1{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nilai X: ");
        int x = input.nextInt();

        System.out.println("Masukkan Nilai Y: ");
        int y = input.nextInt();

        for(int i = x; i <= y; i++){
            if(i < 0 && i % 2 == 0){
                System.out.println(i + " genap negatif ");
            }
            else if(i < 0 && i % 2 == 1 || i % 2 == -1){
                System.out.println(i + " ganjil negatif");
            }
            else if(i == 0){
                System.out.println(i + " nol");
            }
            else if(i > 0 && i % 2 == 1 || i % 2 == -1){
                System.out.println(i + " ganjil positif");
            }
            else if(i > 0 && i % 2 == 0){
                System.out.println(i + " genap positif");
            }
            else{
                System.out.println(" Inputan Salah");
            }
        }

        for(int j = y; j <= x; j++){
            if(j < 0 && j % 2 == 0){
                System.out.println(j + " genap negatif ");
            }
            else if(j < 0 && j % 2 == 1 || j % 2 == -1){
                System.out.println(j + " ganjil negatif");
            }
            else if(j == 0){

                System.out.println(j + " nol");
            }
            else if(j > 0 && j % 2 == 1 || j % 2 == -1){

                System.out.println(j + " ganjil positif");
            }
            else if(j > 0 && j % 2 == 0){

                System.out.println(j + " genap positif");
            }
            else{
                System.out.println(" Inputan Salah");
            }
        }
        input.close();
    }
} 
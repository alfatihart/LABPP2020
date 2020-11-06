import java.util.Scanner;

public class Nomor01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try{
            int x = scan.nextInt();
            int y = scan.nextInt();

            for(int i = x<=y? x:y; i<=(x<=y? y:x); i++){
                if (i<=0)
                {
                    if(i==0) 
                        System.out.printf("%d nol\n",i); 
                    else if(i%2==0)
                        System.out.printf("%d genap negatif\n",i);
                    else
                        System.out.printf("%d ganjil negatif\n",i); 
                }
                else
                {
                    if(i%2==0)
                        System.out.printf("%d genap positif\n",i);
                    else
                        System.out.printf("%d ganjil positif\n",i);
                }
            }
        }
        catch (Exception e) {
            System.out.println("Data yang dimasukkan harus bilangan bulat!");
        }
    }
}

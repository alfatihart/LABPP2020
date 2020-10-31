import java.util.Scanner;

class Nomor1 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        try {
            int a = x.nextInt();
            int b = x.nextInt();
            int c = x.nextInt();
            int d = x.nextInt();
            int e = x.nextInt();
            int genap = 0, ganjil = 0, negatif = 0, positif = 0;
            
                if (a <= -1 ) {
                    negatif++;
            } else if(a != 0)  {
                positif++;
            }
            if (a % 2 == 0  )
                genap++;
            else 
                ganjil++;

            
                if (b <= -1) {
                    negatif++;
            } else if (b != 0 ){
                positif++;
            }
            if (b % 2 == 0)
                genap++;
            else 
                ganjil++;

            
                if (c <= -1 ) {
                    negatif++;
            } else if (c != 0) {
                positif++;
            }
            if (c % 2 == 0 )
                genap++;
            else 
                ganjil++;

            
                if (d <= -1 ) {
                    negatif++;
            } else if (d  != 0) {
                positif++;
            }
            if (d % 2 == 0 )
                genap++;
            else 
                ganjil++;

            
                if (e <= -1 ) {
                    negatif++;
            } else if (e != 0) {
                positif++;
            }
            if (e % 2 == 0 )  {
                genap++;
            } else  {
                ganjil++;
            }

            System.out.println("bilangan positif = " + positif);
            System.out.println("bilangan negatif =  " + negatif);
            System.out.println("bilangan ganjil =  " + ganjil);
            System.out.println("bilangan genap = " + genap);
        }

        catch (Exception e) {
            System.out.println("Inputan Tidak Valid");
        }
    }
}

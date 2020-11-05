import java.util.Scanner;

class Tugas01 {

    public static void main(String[] args) {
        
        Scanner Woi = new Scanner(System.in);

        int x = Woi.nextInt();
        int y = Woi.nextInt();
        boolean z = true;
        if(x<=0){

        while (z){
        if (x==y){
        z=false;
        
        }
        if(x%2==0&&x<0){
            System.out.println(x + " genap negatif");
        }
        if(x%2==0&&x>0){
                System.out.println(x + " genap positif");
        }
        if(x==0){
            System.out.println(x + " nol");
        }
        if(x%2!=0 && x<0){
            System.out.println(x + " ganjil negatif");
        }
        if(x%2!=0&&x>0){
            System.out.println(x + " ganjil positif");
        }
        x++;
        }
        }
        if(x>0){
        while (z){
        if (x==y){
        z=false;
        }
        if(x%2==0&&x<0){
             System.out.println(x + " genap negatif");
        }
        if(x%2==0&&x>0){
             System.out.println(x + " genap positif");
        }
        if(x==0){
             System.out.println(x + " nol");
        }
        if(x%2!=0 && x<0){
             System.out.println(x + " ganjil negatif");
        }
        if(x%2!=0&&x>0){
             System.out.println(x + " ganjil positif");
        }
        x--;
        }
        }
        }
        }
    

import java.util.Scanner;
class Tugas1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        System.out.println();
        if(x < y){
            for(; x <= y ; x+=1){
                if(x < 0){
                    if(x % 2 == -1){
                        System.out.println(x + " ganjil negatif");
                    }if (x % 2 == 0){
                        System.out.println(x + " genap negatif");
                    }
                }
                if(x==0){
                    System.out.println(x + " nol");
                }
                if(x > 0){
                    if(x % 2 == 1){
                        System.out.println(x + " ganjil positif");
                    }if (x % 2 == 0){
                        System.out.println(x + " genap positif");
                    }
                }
            }
        }else{
            for(; x >= y ; x--){
                if(x < 0){
                    if(x % 2 == -1){
                        System.out.println(x + " ganjil negatif");
                    }if (x % 2 == 0){
                        System.out.println(x + " genap negatif");
                    }
                }if(x==0){
                    System.out.println(x + " nol");
                }if(x > 0){
                    if(x % 2 == 1){
                        System.out.println(x + " ganjil positif");
                    }if (x % 2 == 0){
                        System.out.println(x + " genap positif");
                    }
                }
            }
        }
    }
}
import java.util.Scanner;
public class Nomor1{
    public static void main(String[] args) {
        int x,y;
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        y=input.nextInt();

        for(int i=x;i<=y;i++){
            if (i<0){
                if (i%2!=0){
                    System.out.println(i+ " Ganjil Negatif");
                }if (i%2==0){
                    System.out.println(i + " Genap Negatif");
            }}if (i==0){
                System.out.println(i+ " Nol ");
            }if(i>0){
                if (i%2!=0){
                    System.out.println(i + " Ganjil Positif");
                }if (i%2==0){
                    System.out.println(i + " Genap Positif");
            }
            }
        }
        
        for(int j=y;j<=x;j++){
            if (j<0){
                if (j%2!=0){
                    System.out.println(j+ " Ganjil Negatif");
                }if (j%2==0){
                    System.out.println(j + " Genap Negatif");
            }}if (j==0){
                System.out.println(j+ " Nol ");
            }if(j>0){
                if (j%2!=0){
                    System.out.println(j + " Ganjil Positif");
                }if (j%2==0){
                    System.out.println(j + " Genap Positif");
            }
           
            }
        
        }
        input.close();
    }
}


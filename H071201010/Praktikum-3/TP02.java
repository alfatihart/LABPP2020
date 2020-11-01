import java.util.Scanner;
public class TP02 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int x= input.nextInt();
        int y= input.nextInt();
        

        if(x<y){
        for(int i=1; i<=y; i++){
            if(i%x==0){
                System.out.println(i+ " ");
            }else{
                System.out.print(i+ " ");
            }
        }
        }else{
            System.out.println("Inputan tidak valid");
        }
        input.close();
    }
}

    


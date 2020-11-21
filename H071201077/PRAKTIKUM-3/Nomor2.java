import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args) {
        int i=0;
        int x,y;
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        y=input.nextInt();
        while(i<y){
            i++;
            if (i % x ==0){
                System.out.println(i);
            }else if ( i % x!=0){
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}

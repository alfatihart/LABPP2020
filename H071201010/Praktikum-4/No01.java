import java.util.Scanner;
public class No01{
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int[] data= new int[n];

        // input
        for(int i = 0; i < n ; i++){
            data [i]=input.nextInt();
        }
        
        System.out.println();

        // output
        for(int i = 0; i < n ; i++){
            for(int j=i+1; j < n ; j++){
                if(data[i] % data[j] != 0 && data[j] % data[i] != 0)
                System.out.println(data[i] + " " + data[j]);
            }
        }
    }
}

    
import java.util.Scanner;

public class ArrayNomor1{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();

        int[] array=new int[n];

        for(int i=0;i<n;i++){
            array[i]=input.nextInt();    
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i] % array[j] !=0 && array[j] % array[i] !=0)
                System.out.println("Elemen saling relatif prima: " +array[i] + " " + array[j]);
            }
        }
        input.close();
        }
    }
    
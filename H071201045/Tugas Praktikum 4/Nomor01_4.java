
import java.util.Scanner;
public class Nomor01_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		
		// 2  4 7 8
		for(int i=0; i<n; i++){
			array[i] = scan.nextInt(); // index
		}
		
		for(int i=0; i<n; i++){
			for (int j=i+1; j<n; j++){
			    boolean x = false; 
			    for (int k = 2; k<=(array[j]>array[i] ? array[i]:array[j]); k++){
			        if (array[j]%k==0&&array[i]%k==0)
						x=true;
			    }
			    if(!x)
			    	System.out.printf("%d %d \n",array[i],array[j]); 
			}
		}
	}
}

import java.util.Scanner;
public class Pemrograman04Nomor1 {
	public static void main(String[] args){
		Scanner vina = new Scanner(System.in);

		int array = vina.nextInt();
		int[] elemen = new int[array];


		for(int i = 0; i < array; i++){
			elemen[i] = vina.nextInt();
		}
		for(int i = 0; i < array - 1; i++){
			for(int j = i + 1; j < array; j++){
			    int angka1 = elemen[i];
			    int angka2 = elemen[j];

			    while(angka1 != angka2){
			        if(angka1 > angka2){
			        angka1 = angka1 - angka2;
			        }
			        else{
			        angka2 = angka2 - angka1;
			        }	
			    }
			    if(angka1 == 1){
			    System.out.println(elemen[i] + " " + elemen[j]);
	    	    }
			}
		}
	}
} 
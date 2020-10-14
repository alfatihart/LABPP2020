import java.util.Scanner;
public class TP03{
	public static void main(String[] args) {
		System.out.println( "Kententuan sudutnya 90>a>b");
		Scanner obj= new Scanner(System.in);
		System.out.print("Masukkan ketinggian= ");
		double h= obj.nextDouble();
		System.out.print("Masukkan Sudut a= ");
		double a= obj.nextDouble();
		System.out.print("Masukkan Sudut b= ");
		double b= obj.nextDouble();
		if(a>b && 90>a){
		double x;
		x= Math.tan(Math.toRadians(a));
		double y;
		y= Math.tan(Math.toRadians(b));

		double m;
		m= x*h;
		double n;
		n= y*h;

		double r;
		r= m-n;

		int pembulatan = 1;
		double temp = Math.pow(10, pembulatan);
        double p = (double)Math.round(r*temp)/temp;

		System.out.println("Panjang Kapal= "+ p + " m");
	
	}else{
		System.out.println("Tidak dapat menghitung panjang kapal");
	}


	



	}
}
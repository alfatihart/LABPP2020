import java.util.Scanner;
public class TPP2Nomor01 {

    public static void main(String[] args) {

        Scanner bil = new Scanner(System.in);
        System.out.println("\n-----Menetukan Jenis Bilangan-----");
        System.out.println("\nMasukkan 5 bilangan bulat (integer):");


        try {
        int a = bil.nextInt();
        int b = bil.nextInt();
        int c = bil.nextInt();
        int d = bil.nextInt();
        int e = bil.nextInt();

        int modA = (a%2), modB = (b%2), modC = (c%2), modD = (d%2), modE = (e%2);

        System.out.println("\nHasil analisis menunjukkan: ");

        if (a>0 && b>0 && c>0 && d>0 && e>0){
            System.out.println("5 bilangan positif");
        } else if ((a>0 && b>0 && c>0 && d>0)||(a>0 && b>0 && c>0 && e>0)||(a>0 && b>0 && d>0 && e>0)||(a>0 && c>0 && d>0 && e>0)||(b>0 && c>0 && d>0 && e>0)){
            System.out.println("4 bilangan positif");
        } else if ((a>0 && b>0 && c>0)||(a>0 && b>0 && d>0)||(a>0 && b>0 && e>0)||(a>0 && c>0 && d>0)||(a>0 && c>0 && e>0)||(a>0 && d>0 && e>0)||(b>0 && c>0 && d>0)||(b>0 && c>0 && e>0)||(b>0 && d>0 && e>0)||(c>0 && d>0 && e>0)) {
            System.out.println("3 bilangan positif");
        } else if ((a>0 && b>0)||(a>0 && c>0)||(a>0 && d>0)||(a>0 && e>0)||(b>0 && c>0)||(b>0 && d>0)||(b>0 && e>0)||(c>0 && d>0)||(c>0 && e>0)||(d>0 && e>0)) {
            System.out.println("2 bilangan positif");
        } else if (a>0 || b>0 || c>0 || d>0 || e>0) {
            System.out.println("1 bilangan positif");
        } else {
            System.out.println("0 bilangan positif"); 
        }


        if (a<0 && b<0 && c<0 && d<0 && e<0){
            System.out.println("5 bilangan negatif");
        } else if ((a<0 && b<0 && c<0 && d<0)||(a<0 && b<0 && c<0 && e<0)||(a<0 && b<0 && d<0 && e<0)||(a<0 && c<0 && d<0 && e<0)||(b<0 && c<0 && d<0 && e<0)){
            System.out.println("4 bilangan negatif");
        } else if ((a<0 && b<0 && c<0)||(a<0 && b<0 && d<0)||(a<0 && b<0 && e<0)||(a<0 && c<0 && d<0)||(a<0 && c<0 && e<0)||(a<0 && d<0 && e<0)||(b<0 && c<0 && d<0)||(b<0 && c<0 && e<0)||(b<0 && d<0 && e<0)||(c<0 && d<0 && e<0)) {
            System.out.println("3 bilangan negatif");
        } else if ((a<0 && b<0)||(a<0 && c<0)||(a<0 && d<0)||(a<0 && e<0)||(b<0 && c<0)||(b<0 && d<0)||(b<0 && e<0)||(c<0 && d<0)||(c<0 && e<0)||(d<0 && e<0)) {
            System.out.println("2 bilangan negatif");
        } else if (a<0 || b<0 || c<0 || d<0 || e<0) {
            System.out.println("1 bilangan negatif");
        } else {
            System.out.println("0 bilangan negatif"); 
        }






        if (modA==0 && modB==0 && modC==0 && modD==0 && modE==0) {
            System.out.println("5 bilangan genap");
            System.out.println("0 bilangan ganjil");
        } else if ((modA==0 && modB==0 && modC==0 && modD==0)||(modA==0 && modB==0 && modC==0 && modE==0)||(modA==0 && modB==0 && modD==0 && modE==0)||(modA==0 && modC==0 && modD==0 && modE==0)||(modB==0 && modC==0 && modD==0 && modE==0)) {
            System.out.println("4 bilangan genap");
            System.out.println("1 bilangan ganjil");
        } else if ((modA==0 && modB==0 && modC==0)||(modA==0 && modB==0 && modD==0)||(modA==0 && modB==0 && modE==0)||(modA==0 && modC==0 && modD==0)||(modA==0 && modC==0 && modE==0)||(modA==0 && modD==0 && modE==0)||(modB==0 && modC==0 && modD==0)||(modB==0 && modC==0 && modE==0)||(modB==0 && modD==0 && modE==0)||(modC==0 && modD==0 && modE==0)) {
            System.out.println("3 bilangan genap");
            System.out.println("2 bilangan ganjil");
        } else if ((modA==0 && modB==0)||(modA==0 && modC==0)||(modA==0 && modD==0)||(modA==0 && modE==0)||(modB==0 && modC==0)||(modB==0 && modD==0)||(modB==0 && modE==0)||(modC==0 && modD==0)||(modC==0 && modE==0)||(modD==0 && modE==0)) {
            System.out.println("2 bilangan genap");
            System.out.println("3 bilangan ganjil");
        } else if (modA==0 || modB==0 || modC==0 || modD==0 || modE==0) {
            System.out.println("1 bilangan genap");
            System.out.println("4 bilangan ganjil");
        } else {
            System.out.println("0 bilangan genap");
            System.out.println("5 bilangan ganjil"); 
        }

        } catch (Exception ime) {
            System.out.println("Inputan invalid: Mohon masukkan inputan berupa bilangan bulat");
        }
        
        System.out.print("\n");
       


        
    }
    
}

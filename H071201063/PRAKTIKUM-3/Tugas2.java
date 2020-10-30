import java.util.Scanner;
class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukan nilai X dan Y");
        System.out.println("X sebagai batas kolom dan Y sebagai batas Angka");
        int x = sc.nextInt(); //batasKolom
        int y = sc.nextInt(); //BatasAngka
        int z = x; //BatasTetap
        sc.close();
        
        System.out.println();
        for(int i = 1 ; i <= y ; i+=z){
            for(int j = i ; j<=x ; j++){
                System.out.print(j + " ");
                if(j == y){
                    break;
                }
            }
            System.out.println();
            x+=z;
        }
        System.out.println("\n");
    }
}
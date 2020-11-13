import java.util.Scanner;
public class Soal1{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int n = x.nextInt();
        int[] elemen = new int[n];
        int[][] hasil = new int[n-1][2];
        int fpb;
        for(int i = 0; i<elemen.length;i++){
            elemen[i] = x.nextInt();
        }
        int a,b;
        for(int i = 0; i < n-1 ; i++){
            for(int j = 0; j<elemen.length;j++){
                if(elemen[i] > elemen[j]){
                    a =elemen[i];
                    b =elemen[j];
                    fpb = a%b;
                    while(fpb != 0){
                        a = b;
                        b = fpb;
                        fpb = a %b;
                        if(b == 1){
                            hasil[i][0] = elemen[i];
                            hasil[i][1] = elemen[j];
                        }
                    }
                }else if(elemen[j] > elemen[i]){
                    a =elemen[j];
                    b =elemen[i];
                    fpb = a%b;
                    while(fpb != 0){
                        a = b;
                        b = fpb;
                        fpb = a %b;
                        if(b == 1){
                            hasil[i][0] = elemen[i];
                            hasil[i][1] = elemen[j];
                        }
                    }
                }
            }
        }
        for(int cek[] : hasil){
            for(int acek : cek){
                System.out.print(acek + " ");
            }
            System.out.println();
        }

        x.close();
    }
}
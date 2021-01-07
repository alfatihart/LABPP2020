import java.util.*;

public class Tpp02 {
    public static void main(String[] args) {
        
        Scanner lah = new Scanner(System.in);

        int i,j,k;
        i = lah.nextInt();
        j = lah.nextInt();
        k = lah.nextInt();

        int matrix_a [][]= new int[i][j];
        int matrix_b [][]= new int[j][k];
        int matrix_c [][]= new int[i][k];

        for(int l = 0;l<i;l++){
            for(int m = 0;m<j;m++){
                matrix_a[l][m] = lah.nextInt();
            }
        }int barisa = matrix_a.length;
         int koloma = matrix_a[0].length;
        for(int l = 0 ; l<j;l++){
            for(int m = 0 ; m<k;m++){
                matrix_b[l][m] = lah.nextInt();
            }

        }int barisb = matrix_b.length;
         int kolomb = matrix_b[0].length;

         int sum;
         for(int l = 0;l<barisa;l++){
             for(int m = 0;m<kolomb;m++){
                 sum=0;
                 for(int n = 0;n<koloma;n++){
                     sum += matrix_a[l][n] * matrix_b[n][m];
                 }
                // System.out.println(sum);
                 matrix_c[l][m]=sum;
             }
         }for(int l = 0 ;l<i;l++){
             for(int m = 0;m<k;m++){
                System.out.print(" ");
                 System.out.print(matrix_c[l][m]);
             }
             System.out.print("\n");
         }

    }
    
}

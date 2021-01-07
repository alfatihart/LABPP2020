import java.util.*;

public class Tpp01{

    public static void main(String[] args) {

        Scanner lah = new Scanner(System.in);
        int n = lah.nextInt();
        
        int[] deret = new int[n];

        for(int i = 0 ;i<n;i++){
            deret[i] = lah.nextInt();
        }
        for(int i =0;i<n;i++){
            for (int j = i+1;j<n;j++){
                boolean key =true;

                if (deret[i]%deret[j]==0){
                    key = false;
                }if(deret[j]%deret[i]==0){
                    key = false;
                }if(key==true){
                    System.out.printf("%d %d\n",deret[i],deret[j]);
                }
                lah.close();
                            
                        }
                }
            }
        }
    

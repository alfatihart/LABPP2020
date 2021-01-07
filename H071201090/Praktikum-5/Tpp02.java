import java.util.*;


public class Tpp02 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
        }
        public static String generateSerial (int n, int m) {
        String number = "0123456789";
        String str = "";
        Random string = new Random();
        int x = m*n;
        int[]key = new int[x];
        for(int i = 0;i<x;i++){
            key[i]= string.nextInt(number.length());
            
           
        }
        for(int i = 0;i<key.length;i++){
            if(i%m==0&&i>=m){
                str +="-";
            }
            str += key[i];
           
             }
             
        return str;
        
        

        
       
        }
    
}

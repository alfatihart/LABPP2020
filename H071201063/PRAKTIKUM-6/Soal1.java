import java.util.Scanner;
class Soal1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String here = scan.nextLine();
        int panjang = here.length()*here.length();
        here = here.toUpperCase();
        here = here.replaceAll("\s+", "");
        //palindrom
        char[] arr = here.toCharArray();
        String bagi = "";
        for(int i = 0; i< arr.length;i++){
            if(i<arr.length/2){
                bagi+=arr[i];
            }
        }
        String balik = "";
        for(int i = bagi.length()-2 ; i>=0;i--){
            balik+=bagi.charAt(i);
        }
        String palindrom = bagi+balik;

        //hexadecimal
        String hex = Integer.toHexString(panjang);

        //simbol
        String simbol;
        char simbolCheck[] = hex.toCharArray();
        boolean check = Character.isDigit(simbolCheck[0]);
        if(check){
            simbol = "!";
        }else{
            simbol = "?";
        }
        System.out.print(hex+palindrom+simbol);
        scan.close();
    }
}
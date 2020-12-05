import java.util.Scanner;
public class No02 {
    
    static String newLine(String line){
        String newline = new String ();
        char codeGenap;
        int codeGanjil;
        char [] charLine= line.toCharArray();
        for (int i = 0; i < charLine.length; i++) {
            if(i%2 !=0){
                codeGanjil = Character.codePointAt(charLine, i);
                newline += codeGanjil;
            }else{
                codeGenap = line.charAt(i);
                newline += codeGenap;
            }
        }
        return newline;

    }
    static int charArray(String kata) {
        int character = 0;
        while ((16 * character) < kata.length()){
            character++;
        }
        return character;
    }
    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
            String line = scan.nextLine();
            String[][] mxn = new String[4][4];

            if (line.length() >= 16) {
                line = newLine(line);
                int count = 0;

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        mxn[i][j] = "";
                        for (int k = 0; k < charArray(line); k++) {
                            if (count < line.length()) {
                                mxn[i][j] += line.charAt(count);
                            }else{
                                mxn[i][j] += '?';
                            }
                            count++;
                        }
                        System.out.print(mxn[i][j] + " ");
                    }
                    System.out.println();
                }
            }else{
                System.out.println("Inputan minimal 16 huruf");
        }
    }
}


import java.util.Scanner;
class Soal2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kalimat = scan.nextLine();

        //converting string from scanner to char array
        char[] newWord = new char[kalimat.length()];
        for(int i = 0; i<newWord.length;i++){
            newWord[i] = kalimat.charAt(i);
        }

        //input index genap to char array
        char[] cek = new char[newWord.length];
        for(int i = 0; i< newWord.length;i+=2){
            cek[i] = newWord[i];
        }

        //Converting index ganjil to ascii
        int[] ascii= new int[newWord.length];
        for(int i = 0; i<newWord.length;i++){
            ascii[i] = Character.codePointAt(newWord, i);
        }

        //combine from index genap + modified index ganjil
        String outPut = new String();
        for(int i = 0;i<newWord.length;i++){
            if(i % 2 == 0){
                outPut+=cek[i];
            }else{
                outPut+=ascii[i];
            }
        }
        
        //Kalimat baru
        char[] outPutCek = new char[outPut.length()];
        for(int i = 0;i<outPutCek.length;i++){
            outPutCek[i] = outPut.charAt(i);
        }
        
        //Menentukan jumlah karakter tiap kolom
        int panjang = outPutCek.length;
        double panjangDibagi = (double)panjang/16;
        int matLenght = (int)Math.ceil(panjangDibagi);

        
        int q = 0;
        int o = matLenght*4;
        int y = matLenght;
        String matrix = new String();
        String matrix2 = new String();
        String matrix3 = new String();
        String matrix4 = new String();

        int len =  matLenght*16;
        
        for(int j = 0 ; j < len;j++){
            for(int i = 1;i<=matLenght*4;i++){
                if(q<o){
                    matrix+=outPutCek[q];
                    if(q==y-1){
                        matrix+=" ";
                        y+=matLenght;
                    }
                    q++;
                }
            }
            o=(matLenght*4)*2;
            for(int i = 1;i<=matLenght*4;i++){
                if(q<o){
                    matrix2+=outPutCek[q];
                    if(q==y-1){
                        matrix2+=" ";
                        y+=matLenght;
                    }
                    q++;
                }
            }
            o=(matLenght*4)*3;
            for(int i = 1;i<=matLenght*4;i++){
                if(q<o){
                    matrix3+=outPutCek[q];
                    if(q==y-1){
                        matrix3+=" ";
                        y+=matLenght;
                    }
                    q++;
                }
            }
            try{
                o=(matLenght*4)*4;
                for(int i = 1;i<=matLenght*4;i++){
                    if(q<o){
                        matrix4+=outPutCek[q];
                        if(q==y-1){
                            matrix4+=" ";
                            y+=matLenght;
                        }
                        q++;
                    }
                }
            }catch(ArrayIndexOutOfBoundsException z){
                for(int i = 1;i<=matLenght*4;i++){
                    o=(matLenght*4)*4;
                    if(q<o){
                        matrix4+="?";
                        if(q==y-1){
                            matrix4+=" ";
                            y+=matLenght;
                        }
                        q++;
                    }
                }
                break;
            }
        }
        System.out.println(matrix);
        System.out.println(matrix2);
        System.out.println(matrix3);
        System.out.println(matrix4);
        scan.close();
    }
}
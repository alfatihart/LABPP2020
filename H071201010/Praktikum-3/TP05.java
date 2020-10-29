import java.util.Scanner;
public class TP05 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

                // 24 jam = 360⁰
                // 1 jam = 15⁰
                // 60 menit = 15⁰
                //  4 menit = 1⁰
                // 240 detik = 1⁰

                // 360⁰ = 0⁰ 

                while(input.hasNext()){
                    if(input.hasNextFloat()){
                       float M= input.nextFloat();
                       if(M>=0 && M<270){
                       float detik= M*240;    
                       float s= (detik%3600)%60;
                       float m= (detik%3600)/60;
                       float h= detik/3600;
                       float H= h+6;

                        int second= (int)s;
                        int minutes= (int)m;
                        int hour= (int)H;

                        if(H>=6 && H<12){
                            System.out.println("Selamat Pagi");
                            System.out.printf("%02d:%02d:%02d\n", hour, minutes, second);
                        }else if(H>=12 && H<15){
                            System.out.println("Selamat Siang");
                            System.out.printf("%02d:%02d:%02d\n", hour, minutes, second);
                        }else if(H>=15 && H<18){
                            System.out.println("Selamat Sore");
                            System.out.printf("%02d:%02d:%02d\n", hour, minutes, second);
                        }else if(H>=18 && H<24){
                            System.out.println("Selamat Malam");
                            System.out.printf("%02d:%02d:%02d\n", hour, minutes, second);
                        }

                       }else if(M>=270 && M<360){
                        float detik= M*240;    
                        float s= (detik%3600)%60;
                        float m= (detik%3600)/60;
                        float h= detik/3600;
                        float H= h-18;
 
                         int second= (int)s;
                         int minutes= (int)m;
                         int hour= (int)H;
                         if(H>=0 && H<3){
                            System.out.println("Selamat Malam");
                            System.out.printf("%02d:%02d:%02d\n", hour, minutes, second);
                         }else if(H>=3 && H<6){
                            System.out.println("Selamat Subuh");
                            System.out.printf("%02d:%02d:%02d\n", hour, minutes, second);
                         }
                       }else if(M==360){
                        System.out.println("Selamat Pagi");
                        System.out.printf("%02d:%02d:%02d\n", 6, 0, 0);
                       }
                    }
                }
            }
        }
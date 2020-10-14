import java.util.Scanner;

public class Nomor03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("masukkan h : ");
        double h = input.nextDouble();

        System.out.println("masukkan sudut depan : ");
        double a = input.nextDouble();
        
        System.out.println("masukkan sudut belakang : ");
        double b = input.nextDouble();

        a = Math.tan(Math.toRadians(a));
        b = Math.tan(Math.toRadians(b));
        
        double Panjang_kapal = (a - b)*h;
       
        if (90 > a && a > b) {
        System.out.printf("Panjang kapal : %.1f m", Panjang_kapal);
                                                                        }
            else {
        System.out.printf("Error");
            }
        }
}

// java gonna assume the angle that you give its radians
// the method as part of the math class :
// System.out.println(Math.sin(45)); <<<< WRONG X (inputnya jadi radian)
// System.out.println(Math.sin(Math.toRadians(45)))
// radians value what u get there              ^ get passed (as expected from sin 45 = 0.707)
// passed means : ^((radians to degree))^







/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author Ummul
 * don't copyright
 */
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        double h, a, b;
        System.out.println("Ketinggian Menara :");
        h = obj.nextDouble();
        System.out.println("Sudut Elevasi Pengamat Terhadap Ujung Belakang Kapal :");
        a = obj.nextDouble();       
        System.out.println("Sudut Elevasi Pengamat Terhadap Ujung Depan Kapal :");
        b = obj.nextDouble(); 
        if (90>a && a>b){
            double x = (Math.tan(Math.toRadians(b)))*h;
            double z = (Math.tan(Math.toRadians(a)))*h;
            double y = z - x;
            System.out.printf("Panjang Kapal : "+ "%.1f",y );
            System.out.println(" "+"m");
        }
        else {
            System.out.println("Data Yang Anda Masukkan Salah, Silahkan Masukkan Ulang Data");
            
        }
        
    }
}

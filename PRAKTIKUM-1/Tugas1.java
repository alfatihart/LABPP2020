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
public class Tugas1 {
    public static void main (String [] args) {
        Scanner obj =new Scanner(System.in);
        //misal t= waktu (jam) dan v= kecepatan rata-rata(km/jam)
        int t, v;
        System.out.println("Waktu :");
        t = obj.nextInt();
        System.out.println("Kecepatan :");
        v = obj.nextInt();
        //misal x = jumlah bensin yang digunakan
        double x = (t*v)/14.0;        
        System.out.printf("Bensin Yang Digunakan : " + "%.3f", x);
        System.out.println(" "+"L");
     
            
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author Ummul Qura
 * don't copyright
 */
import java.util.Scanner;
public class Tugas2 {
    public static void main (String [] args){
        Scanner obj = new Scanner(System.in);  
        System.out.println("Masukkan detik : " );
        int detik = obj.nextInt();
        int jam = detik / 3600;
        // x= sisa modulo jam
        int x = detik % 3600;
        int menit = x / 60;
        int detik1 = x % 60;
                     
        System.out.println(String.format("%02d",jam) + ":" + String.format("%02d", menit) + ":" + String.format("%02d",detik1) );
        
        
    }
}

package Pratikum5;

import java.util.Scanner;

public class Nomor3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int tahun,bulan,hari;
            int n = input.nextInt();
            tahun= myYear(n);
            bulan= myMonth(n);
            hari= myDay(n);
            System.out.println(tahun + " tahun ");
            System.out.println(bulan + " bulan ");
            System.out.println(hari + " hari ");
    
        }
        public static int myYear(int n){
            int tahun = n / 365;
            return tahun;
        }
        public static int myMonth( int n){
            int bulan = (n%365)/ 30;
            return bulan;
        }
        public static int myDay(int n){
            int hari =(n%365)%30;
            return hari;
        }
    }
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        
     double panjang,sisi,lebar,tinggi,alas,r,b,a,d1,d2,s;
     int pilih1,pilih2,pilih;
     double luas,volume;
    
    Scanner input=new Scanner(System.in);

    System.out.println("  Menu  ");
    System.out.println("1.Mencari Luas Bangun Datar");
    System.out.println("2.Mencari Volume Bangun Ruang");
    System.out.println("Input angka dengan menu yang diinginkan");
     pilih=input.nextInt();

    if (pilih==1){
    System.out.println("Pilih Bangun datar");
    System.out.println("1.Persegi");
    System.out.println("2.Persegi Panjang");
    System.out.println("3.Segitiga");
    System.out.println("4.Lingkaran");
    System.out.println("5.Jajar Genjang");
    System.out.println("6.Trapesium");
    System.out.println("7.Belah Ketupat");
    System.out.println("8.Layang-layang");
    System.out.println("Input angka seseaui bangun datar diinginkan");
    pilih1=input.nextInt();
    switch (pilih1){
        case 1:{
        System.out.println("Input Sisi");
        sisi=input.nextDouble();
        luas=sisi * sisi;
        System.out.println("Luas Persegi = " + luas);
    break;}
    case 2:{
        System.out.println("input Panjang");
        panjang=input.nextDouble();
        System.out.println("Input lebar");
        lebar=input.nextDouble();
        luas=panjang * lebar;
         System.out.println("Luas Persegi panjang = " + luas);
    break;}
    case 3:{
        System.out.println("masukan Alas");
        alas=input.nextDouble();
        System.out.println("input tinggi");
        tinggi=input.nextDouble();
        luas = (alas * tinggi)/2;
        System.out.println("Luas Segitiga = " + luas);
    break;}
    case 4:{
        System.out.println("input r");
        r=input.nextDouble();
        luas = Math.PI * r * r;
        System.out.println("Luas Lingkaran = " + luas);
    break;}
    case 5:{
        System.out.println("masukan Alas");
        alas=input.nextDouble();
        System.out.println("input Tinggi");
        tinggi=input.nextDouble();
        luas = alas * tinggi;
        System.out.println("Luas Segitiga = " + luas);
    break;}
    case 6:{
        System.out.println("input Sisi Sejajar a");
        a=input.nextDouble();
        System.out.println("input Sisi Sejajar b");
        b=input.nextDouble();
        System.out.println("input Tinggi");
        tinggi=input.nextDouble();
        luas=((a+b)*tinggi)/2;
        System.out.println("Luas Trapesium = " + luas);
    break;}
    case 7:{
        System.out.println("input Diagonal 1");
        d1=input.nextDouble();
        System.out.println("input Diagonal 2");
        d2=input.nextDouble();
        luas= (d1 * d2)/2;
        System.out.println("Luas Belah Ketupat = " + luas);
    break;}
    case 8:{
        System.out.println("input diagonal 1");
        d1=input.nextDouble();
        System.out.println("input diagonal 2");
        d2=input.nextDouble();
        luas= (d1 * d2)/2;
    System.out.println("Luas Layang-layang = " + luas);
    break;}
    }    
    }else if (pilih==2){
        System.out.println("Pilih Bangun datar");
    System.out.println("1.Balok");
    System.out.println("2.kubus");
    System.out.println("3.Tabung");
    System.out.println("4.Kerucut");
    System.out.println("5.Bola");
    System.out.println("Input Angka sesaui dengan nomor bangun ruang yang diinginkan");
    pilih2=input.nextInt();
    switch (pilih2){
        case 1:{
        System.out.println("Input Panjang");
        tinggi=input.nextDouble();
        System.out.println("Input Lebar");
        lebar = input.nextDouble();
        System.out.println("Input Tinggi");
        tinggi=input.nextDouble();
        volume= tinggi * lebar * tinggi;
        System.out.println("volume Balok = " + volume);
    break;}
    case 2:{
        System.out.println("Input Panjang Rusuk (s)");
        s=input.nextDouble();
        volume=s * s * s;
        System.out.println("Volume Kubus = " + volume);
    break;}
    case 3:{
        System.out.println("Input Jari-jari (r)");
        r=input.nextDouble();
        System.out.println("Input Tinggi");
        tinggi=input.nextDouble();
        volume= Math.PI * r * r * tinggi;
    System.out.println("Volume Tabung = " + volume);
    break;}
    case 4:{
        System.out.println("Input Jari-jari (r) ");
        r=input.nextDouble();
        System.out.println("Input Tinggi");
        tinggi=input.nextDouble();
        volume = (Math.PI * r * r * tinggi)/3;
        System.out.println("Volume Kerucut = " + volume);
    break;}
    case 5:{
        System.out.println(" Input jari-jari (r)");
        r=input.nextDouble();
        volume=4*(Math.PI*r*r*r)/3;
        System.out.println("Volume Bola = " + volume);
    break;}
    default:
    }
    }else System.out.println("Menu tidak ada");
 }
 }

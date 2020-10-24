import java.util.Scanner;
class TugasP2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);


        //Menu
        System.out.println("**Menu**");
        System.out.println("1. Mencari luas bangun datar");
        System.out.println("2. Mencari volume bangun ruang");
        System.out.println("\n Input angka sesuai dengan menu yang diinginkan:");

        int count = 0;

        //Pilihan bangun datar/ruang
        int choose = x.nextInt();
        if(choose == 1){
            System.out.println("** Pilih bangun datar **");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar genjang");
            System.out.println("6. Trapesium");
            System.out.println("7. Belah Ketupat");
            System.out.println("8. Layang layang");
            count +=1;
        } else if(choose == 2){
            System.out.println("** Pilih bangun ruang **");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Kerucut");
            System.out.println("4. Limas");
            System.out.println("5. Tabung");
            System.out.println("6. Bola");
            System.out.println("7. Prisma");
            count +=10;
        } else{
            System.out.println("Inputan salah");
        }

        double phi = 3.14;
        int pilihan = x.nextInt();
        int rumus = count + pilihan;

        //RUMUS DATAR
        if(rumus == 2){//Persegi
            System.out.println("Input sisi");
            double siPersegi = x.nextDouble(); 
            double luasPersegi = siPersegi * 2;
            System.out.println("Luas Persegi = " + String.format("%.1f", luasPersegi));
        }else if(rumus == 3){//Persegi panjang
            System.out.println("Input panjang");
            double pPersegiP = x.nextDouble();//P = panjang
            System.out.println("Input lebar");
            double lPersegiP = x.nextDouble();
            double luasPersegiP = pPersegiP * lPersegiP;
            System.out.println("Luas persegi panjang = " + String.format("%.1f", luasPersegiP));
        }else if(rumus == 4){ //Segitiga
            System.out.println("Input alas");
            double aSegitiga = x.nextDouble();
            System.out.println("Input tinggi");
            double tSegitiga = x.nextDouble();
            double luasSegitiga = (aSegitiga * tSegitiga) / 2;
            System.out.println("Luas Segitiga = " + String.format("%.1f", luasSegitiga));
        }else if(rumus == 5){ // Lingkaran
            System.out.println("Input jari-jari");
            double jjLingkaran = x.nextDouble();
            double luasLingkaran = phi * (jjLingkaran * jjLingkaran);
            System.out.println("Luas Lingkaran = " + String.format("%.1f", luasLingkaran));
        }else if(rumus == 6){ // Jajar Genjang
            System.out.println("Input alas");
            double aJG = x.nextDouble(); //JG = Jajar Genjang
            System.out.println("Input tinggi");
            double tJG = x.nextDouble();
            double luasJG = aJG * tJG;
            System.out.println("Luas Jajar Genjang = " + String.format("%.1f", luasJG));
        }else if(rumus == 7){ // Trapesium
            System.out.println("Input sisi 1");
            double s1Trapesium = x.nextDouble();
            System.out.println("Input sisi 2");
            double s2Trapesium = x.nextDouble();
            System.out.println("Input Tinggi");
            double tTrapesium = x.nextDouble();
            double luasTrapesium = (s1Trapesium + s2Trapesium) * tTrapesium / 2;
            System.out.println("Luas Trapesium = " + String.format("%.1f", luasTrapesium));
        } else if(rumus == 8){ // Belah Ketupat
            System.out.println("Input Diagonal 1");
            double d1BelahK = x.nextDouble();
            System.out.println("Input Diagonal 2");
            double d2BelahK = x.nextDouble();
            double luasBelahK = d1BelahK * d2BelahK / 2;
            System.out.println("Luas Belah Ketupat = " + String.format("%.1f", luasBelahK));
        }else if(rumus == 9){ // Layang layang
            System.out.println("Input Diagonal 1");
            double d1Kite = x.nextDouble();
            System.out.println("Input Diagonal 2");
            double d2Kite = x.nextDouble();
            double luasKite = 0.5 * d1Kite * d2Kite;
            System.out.println("Luas Layang-layang = " + String.format("%.1f", luasKite));
        }

        // RUMUS BANGUN RUANG
        else if(rumus == 11){ //KUBUS
            System.out.println("Input sisi");
            double siKubus = x.nextDouble();
            double vKubus = siKubus * siKubus * siKubus;
            System.out.println("Volume Kubus = " + String.format("%.1f", vKubus));
        }else if(rumus == 12){ // BALOK
            System.out.println("Input Panjang");
            double pBalok = x.nextDouble();
            System.out.println("Input Lebar");
            double lBalok = x.nextDouble();
            System.out.println("Input Tinggi");
            double tBalok = x.nextDouble();
            double vBalok = pBalok * lBalok * tBalok ;
            System.out.println("Volume Balok = " + String.format("%.1f", vBalok));
        }else if(rumus == 13){ // Kerucut
            System.out.println("Input Jari-jari alas");
            double jKerucut = x.nextDouble();
            System.out.println("Input Tinggi");
            double tKerucut = x.nextDouble();
            double vKerucut = (1.0 / 3.0) * (phi * jKerucut * jKerucut ) * tKerucut;
            System.out.println("Volume kerucut = " + String.format("%.1f", vKerucut));
        }else if(rumus == 14){ //Limas
            System.out.println("Input Panjang");
            double pLimas = x.nextDouble();
            System.out.println("Input lebar");
            double lLimas = x.nextDouble();
            System.out.println("Input Tinggi");
            double tLimas = x.nextDouble();
            double vLimas = (pLimas * lLimas / 2 ) * tLimas / 3;
            System.out.println("Volume limas = " + String.format("%.1f", vLimas));
        }else if(rumus == 15){ //Tabung
            System.out.println("Input jari-jari");
            double jTabung = x.nextDouble();
            System.out.println("Input tinggi");
            double tTabung = x.nextDouble();
            double vTabung = phi * jTabung * jTabung * tTabung;
            System.out.println("Volume Tabung = " + String.format("%.1f", vTabung));
        }else if(rumus == 16){ //Bola
            System.out.println("Input jari-jari");
            double jBola = x.nextDouble();
            double vBola = (4 / 3) * phi * (jBola * jBola * jBola);
            System.out.println("Volume Bola = " + String.format("%.1f", vBola));
        }else if(rumus == 17){ //Prisma
            System.out.println("Input Luas alas");
            double laPrisma = x.nextDouble();
            System.out.println("Input tinggi");
            double tPrisma = x.nextDouble();
            double vPrisma = laPrisma * tPrisma;
            System.out.println("Volume Prisma = " + String.format("%.1f", vPrisma));
        }else{
            System.out.println("Inputan salah");
        }
        x.close();
    }
}

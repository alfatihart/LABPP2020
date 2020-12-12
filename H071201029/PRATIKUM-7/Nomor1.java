package Pratikum7;

import java.util.HashMap;
import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> ktrngn = new HashMap<Integer, String>();
        ktrngn.put(1, "Judul\t\t:");
        ktrngn.put(2, "Rilis\t\t:");
        ktrngn.put(3, "Durasi\t\t:");
        ktrngn.put(4, "Genre\t\t:");
        ktrngn.put(5, "Sinopsis\t:");
        ktrngn.put(6, "Cast\t\t:");
        HashMap<Integer, String> film = new HashMap<>();
        System.out.println("------Favorit Movie-----");
        film.put(1, "1. Avenger : Endgame ");
        film.put(2, "2. Spiderman: Far From Home ");
        film.put(3, "3. Venom ");
        film.put(4, "4. Thor: Ragnarok ");
        HashMap<Integer, String> judul = new HashMap<Integer, String>();
        judul.put(1, " Avenger : Endgame ");
        judul.put(2, " Spiderman: Far From Home ");
        judul.put(3, " Venom ");
        judul.put(4, " Thor: Ragnarok");
        HashMap<Integer, String> rilis = new HashMap<Integer, String>();
        rilis.put(1, " 24 April 2019e ");
        rilis.put(2, " 3 Juli 2019 ");
        rilis.put(3, " 3 Oktober 2018 ");
        rilis.put(4, " 25 Oktober 2017");
        HashMap<Integer, String> durasi = new HashMap<Integer, String>();
        durasi.put(1, " 24 April 2019 ");
        durasi.put(2, " 2 jam 9 Menit ");
        durasi.put(3, " 2 jam 20 menit ");
        durasi.put(4, " 2 jam 10 menit ");
        HashMap<Integer, String> genre = new HashMap<Integer, String>();
        genre.put(1, " Adventure, Sci-Fi, Action ");
        genre.put(2, " Adventure, Sci-Fi, Action ");
        genre.put(3, " Adventure, Sci-Fi, Action ");
        genre.put(4, " Adventure, Sci-Fi, Action ");
        HashMap<Integer, String> sinopsis = new HashMap<Integer, String>();
        sinopsis.put(1, " Ini adalah sinopsois");
        sinopsis.put(2, " Ini adalah sinopsois ");
        sinopsis.put(3, " Ini adalah sinopsois ");
        sinopsis.put(4, " Ini adalah sinopsois ");
        HashMap<Integer, String> cast = new HashMap<Integer, String>();
        cast.put(1, " Robert Downey Jr., Chris Evan, Mark Ruffalo ");
        cast.put(2, " Tom Holland,Samuel L. Jackson,Zendaya,Cobie Smulders,dan Jon Favreau ");
        cast.put(3, " Tom Hardy,Michelle Williams,Riz Ahmed,danScott Haze ");
        cast.put(4, " Chris Hemsworth,Tom Hiddleston,Cate Blanchett,Idris Elba,dan Jeff Goldblum ");
        while (true) {
            for (Integer list : film.keySet()) {
                System.out.println(film.get(list));
            }
            System.out.println("(d)Detail (s)Search (a)Add (r)Remove");
            System.out.print(" --> ");
            String pilihan = input.next();
            if (pilihan.equalsIgnoreCase("d")) {
                int nomor = input.nextInt();
                System.out.println(ktrngn.get(1) + judul.get(nomor));
                System.out.println(ktrngn.get(2) + rilis.get(nomor));
                System.out.println(ktrngn.get(3) + durasi.get(nomor));
                System.out.println(ktrngn.get(4) + genre.get(nomor));
                System.out.println(ktrngn.get(5) + sinopsis.get(nomor));
                System.out.println(ktrngn.get(6) + cast.get(nomor));

            } else if (pilihan.equalsIgnoreCase("s")) {
                String kmbl = input.next();
                for (int i = 1; i <= film.size(); i++) {
                    if (film.get(i).contains(kmbl)) {
                        System.out.println(" Hasil Pencarian : " + film.get(i));
                    }
                }
            } else if (pilihan.equalsIgnoreCase("a")) {
                System.out.println(" Masukkan data Favorit Movie Tambahan");
                System.out.print(" Judul \t: ");
                String jdl = input.next();
                System.out.print(" Rilis \t: ");
                String rls = input.next();
                System.out.print(" Durasi : ");
                String drs = input.next();
                System.out.print(" Genre \t: ");
                String gnr = input.next();
                System.out.print(" Sinopsis : ");
                String sns = input.next();
                System.out.print(" Cast \t: ");
                String cst = input.next();

                film.put(5, "5. " + jdl);
                judul.put(judul.size() + 1, jdl);
                rilis.put(rilis.size() + 1, rls);
                durasi.put(durasi.size() + 1, drs);
                genre.put(genre.size() + 1, gnr);
                sinopsis.put(sinopsis.size() + 1, sns);
                cast.put(cast.size() + 1, cst);

                System.out.println("------Favorit Movie-----");
                for (Integer list : film.keySet()) {
                    System.out.println(film.get(list));
                }
            } else if (pilihan.equalsIgnoreCase("r")) {
                int del = input.nextInt();
                film.remove(del);
                for (Integer list : film.keySet()) {
                    System.out.println(film.get(list));
                }
            } else {
                System.out.println("Input tidak valid");
            }
            System.out.println("continue? yes/no");
            String ulng = input.next();
            if (ulng.equals("no")) {
                break;
            }
        }
    }
}

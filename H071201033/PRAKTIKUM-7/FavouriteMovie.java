import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class FavouriteMovie {

  static void printFavMov (HashMap<Integer, String> m) {
    System.out.println("\n----------Favourite Movie----------\n");
    for (Integer num : m.keySet()) {
          String key = num.toString();
          String val = m.get(num);
          System.out.println(key + ". " + val);
    }

  }

  public static void main(String[] args) {
    Scanner inp = new Scanner (System.in);

    HashMap<Integer, String> judul = new HashMap<> ();
    judul.put(1, "The Avengers");
    judul.put(2, "Iron Man");
    judul.put(3, "The Incredible Hulk");
    judul.put(4, "Thor");
    judul.put(5, "Doctor Strange");

    Map<Integer, String> rilis = new HashMap<> ();
    rilis.put(1, "11 April 2012");
    rilis.put(2, "14 April 2008");
    rilis.put(3, "13 Juni 2008");
    rilis.put(4, "17 April 2011");
    rilis.put(5, "4 November 2016");

    Map<Integer, String> durasi = new HashMap<>();
    durasi.put(1, "2 Jam 24 Menit");
    durasi.put(2, "2 Jam 6 Menit");
    durasi.put(3, "1 Jam 52 Menit");
    durasi.put(4, "1 Jam 54 Menit");
    durasi.put(5, "1 Jam 55 Menit");

    Map<Integer,String> genre = new HashMap<>();
    genre.put(1, "Adventure, Sci-Fi, Action, Fantasy");
    genre.put(2, "Adventure, Sci-Fi, Action, Fantasy");
    genre.put(3, "Adventure, Sci-Fi, Action, Fantasy");
    genre.put(4, "Adventure, Sci-Fi, Action, Fantasy");
    genre.put(5, "Adventure, Sci-Fi, Action, Fantasy");

    Map<Integer, String> sinopsis = new HashMap<>();
    sinopsis.put(1, "Iron Man, Captain America, Hulk, Thor, Black Widow dan Hawkeye dikumpulkan untuk menaklukkan Dewa Kehancuran, Loki, dalam usahanya menghancurkan bumi...");
    sinopsis.put(2, "Dalam kunjungannya, Toni Stark tertangkap dan disandera oleh militan Afghanistan. Di dalam goa, diam-diam ia membangun sebuah senjata lapis baja anti peluru untuk melawan musuh dan meloloskan diri...");
    sinopsis.put(3, "Ilmuwan Dr. David Banner terkena radiasi gamma tingkat tinggi yang memicu transformasinya menjadi makhluk raksasa berwarna hijau, The Hulk...");
    sinopsis.put(4, "Ketika Thor yang arogan mengacaukan gencatan senjata antara Asgardians dan Giants Frost, Odin sang raja Asgard membuangnya ke bumi...");
    sinopsis.put(5, "Dr. Stephen Strange mengalami sebuah kecelakaan yang fatal yang merusak kemampuan motorik kedua tangannya. Demi kesembuhannya, ia mengunjungi seorang penyihir misterius bernama Ancient One di Tibet...");

    Map<Integer, String> cast = new HashMap<>();
    cast.put(1, "Robert Downey Jr., Chris Evan, Mark Ruffalo");
    cast.put(2, "Robert Downey Jr., Gwyneth Paltrow, Terrence Howard, dan Jeff Bridges");
    cast.put(3, "Edward Norton, Liv Tyler, Tim Roth, dan William Hurt");
    cast.put(4, "Chris Hemsworth, Natalie Portman, Tom Hiddleston, Stellan Skarsgård");
    cast.put(5, "Benedict Cumberbatch, Chiwetel Ejiofor, Rachel McAdams, Benedict Wong, Michael Stuhlbarg");

    boolean kondisi = true;

    while (kondisi == true) {  
      printFavMov(judul);
      System.out.println("\n(d)Detail (s)Search (a)Add (r)Remove");

      String op = inp.next();

      if (op.equals("d")) {
          int detail = inp.nextInt();
          String title = judul.get(detail);
          String date = rilis.get(detail);
          String duration = durasi.get(detail);
          String gen = genre.get(detail);
          String synopsis = sinopsis.get(detail);
          String casting = cast.get(detail);

          System.out.println();
          System.out.println("Judul    : " + title);
          System.out.println("Rilis    : " + date);
          System.out.println("Durasi   : " + duration);
          System.out.println("Genre    : " + gen);
          System.out.println("Sinposis : " + synopsis);
          System.out.println("Cast     : " + casting);

      } else if (op.equals("s")) {
          String search = inp.next();

          for (int i = 1 ; i <= judul.size() ; i++) {
            if (judul.get(i).contains(search)) {
                System.out.println();
                System.out.println("Tampilkan Movie! " + judul.get(i));
            }
          }

      } else if (op.equals("a")) {
          System.out.print("Judul    : ");
          String title = inp.nextLine();
          title = inp.nextLine();

          System.out.print("Rilis    : ");
          String date = inp.nextLine();

          System.out.print("Durasi   : ");
          String duration = inp.nextLine();

          System.out.print("Genre    : ");
          String gen = inp.nextLine();

          System.out.print("Sinopsis : ");
          String synopsis = inp.nextLine();

          System.out.print("Cast     : ");
          String casting = inp.nextLine();

          judul.put(judul.size()+1, title);
          rilis.put(rilis.size()+1, date);
          durasi.put(durasi.size()+1, duration);
          genre.put(genre.size()+1, gen);
          sinopsis.put(sinopsis.size()+1, synopsis);
          cast.put(cast.size()+1, casting);
  
          printFavMov(judul);

      } else if (op.equals("r")) {
        int r = inp.nextInt();

          if (1 <= r && r <= judul.size()) {
            for (int i = 0 ; i  < judul.size()-1 ; i++) {
              judul.replace(r+i, judul.get(r+i+1));
              rilis.replace(r+i, rilis.get(r+i+1));
              durasi.replace(r+i, durasi.get(r+i+1));
              genre.replace(r+i, genre.get(r+i+1));
              sinopsis.replace(r+i, sinopsis.get(r+i+1));
              cast.replace(r+i, cast.get(r+i+1));

            }

            judul.remove(judul.size());
            rilis.remove(rilis.size());
            durasi.remove(durasi.size());
            genre.remove(genre.size());
            sinopsis.remove(sinopsis.size());
            cast.remove(cast.size());

            printFavMov(judul);
        
          }
        

      }

    System.out.println("\nContinue? yes/no");
    String input = inp.next();
      if (input.equals("yes")) {
          kondisi = true;
      } else {
          kondisi = false;
      }

    }



  }


}

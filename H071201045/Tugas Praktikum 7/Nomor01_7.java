import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

 public class Nomor01_7 {

   static void printMovie (HashMap<Integer, String> m) {
     for (Integer num : m.keySet()) {
       String key = num.toString();
       String val = m.get(num);
       System.out.println(key + ". " + val);
     }

   }
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    HashMap<Integer, String> favMovie = new HashMap<> ();
    favMovie.put(1, "Avenger : Endgame");
    favMovie.put(2, "Spiderman : Far From Home");
    favMovie.put(3, "Venom");
    favMovie.put(4, "Thor : Ragnarok");

    Map<Integer, String> rilis = new HashMap<> ();
    rilis.put(1, "24 April 2019");
    rilis.put(2, "26 Juni 2019" );
    rilis.put(3, "1 Oktober 2018 ");
    rilis.put(4, "10 Oktober 2017");

    Map<Integer, String> durasi = new HashMap<>();
    durasi.put(1, "3 Jam 1 Menit");
    durasi.put(2, "2 Jam 9 Menit");
    durasi.put(3, "1 Jam 52 Menit");
    durasi.put(4, "2 Jam 10 Menit");

    Map<Integer,String> genre = new HashMap<>();
    genre.put(1, "Adventure, Sci-Fi, Action");
    genre.put(2, "Adventure, Sci-Fi, Action");
    genre.put(3, "Adventure, Sci-Fi, Action");
    genre.put(4, "Adventure, Sci-Fi, Action, Fantasy, Comedy");

    Map<Integer, String> sinopsis = new HashMap<>();
    sinopsis.put(1, "disini sinopsis");
    sinopsis.put(2, "disini sinopsis");
    sinopsis.put(3, "disini sinopsis");
    sinopsis.put(4, "disini sinopsis");

    Map<Integer, String> cast = new HashMap<>();
    cast.put(1, "Robert Downey Jr., Chris Evan, Mark Ruffalo");
    cast.put(2, "Tom Holland, Samuel L. Jackson, Jake Gyllenhall");
    cast.put(3, "Tom Hardy, Michelle Williams, Riz Ahmed");
    cast.put(4, "Chris Hemsworth, Tom Hiddleston, Cate Blanchett");

    while (true) {
    printMovie(favMovie);
    System.out.println("(d)Detail (s)Search (a)Add (r)Remove");

    String op = scan.next();

    //detail
    if (op.equals("d")) {
      int j = scan.nextInt();
      String judul = favMovie.get(j);
      String date = rilis.get(j);
      String duration = durasi.get(j);
      String tag = genre.get(j);
      String sin = sinopsis.get(j);
      String pemain = cast.get(j);

      System.out.println("Judul    : " + judul);
      System.out.println("Rilis    : " + date);
      System.out.println("Durasi   : " + duration);
      System.out.println("Genre    : " + tag);
      System.out.println("Sinposis : " + sin);
      System.out.println("Cast     : " + pemain);

    }
    //search
    else if (op.equals("s")) {
      String src = scan.next();

      for (int i = 1;i <= favMovie.size() ;i++) {
        if (favMovie.get(i).contains(src)) {
          System.out.println("Hasil Pencarian Movie : " + favMovie.get(i));
        }
      }

    }
    //add
    else if (op.equals("a")) {
      
      String judul = scan.nextLine();
      judul = judul.substring(1);
      System.out.print("judul    : ");
      
        
      System.out.printf("%nRilis    : ");
      String date = scan.nextLine();

      System.out.printf("Durasi   : ");
      String duration = scan.nextLine();

      System.out.printf("Genre    : ");
      String tag = scan.nextLine();

      System.out.printf("Sinopsis : ");
      String sin = scan.nextLine();

      System.out.printf("Cast     : ");
      String pemain = scan.nextLine();

      favMovie.put(favMovie.size()+1, judul);
      rilis.put(rilis.size()+1, date);
      durasi.put(durasi.size()+1, duration);
      genre.put(genre.size()+1, tag);
      sinopsis.put(sinopsis.size()+1, sin);
      cast.put(cast.size()+1, pemain);

      printMovie(favMovie);

    }
    //remove
    else if (op.equals("r")) {
    int j = scan.nextInt();

    if(1<= j && j<=favMovie.size()){
    for (int i = 0; i< favMovie.size()-1; i++){
    favMovie.replace(j+i, favMovie.get(j+i+1));
    rilis.replace(j+i, rilis.get(j+i+1));
    durasi.replace(j+i, durasi.get(j+i+1));
    genre.replace(j+i, genre.get(j+i+1));
    sinopsis.replace(j+i, sinopsis.get(j+i+1));
    cast.replace(j+i, cast.get(j+i+1));
    }

    favMovie.remove(favMovie.size());
    rilis.remove(rilis.size());
    durasi.remove(durasi.size());
    genre.remove(genre.size());
    sinopsis.remove(sinopsis.size());
    cast.remove(cast.size());

    printMovie(favMovie);

    }
  }

  System.out.println("continue? yes/no");
  String ctn = scan.next();
    if (ctn.equals("no")) {
    break;
    }
  }
  scan.close();
  }
}

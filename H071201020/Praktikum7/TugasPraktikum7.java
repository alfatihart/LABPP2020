import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TugasPraktikum7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Tampilan Awal
        Map<Integer, String> movie = new HashMap<>();
        movie.put(1, "Avenger : Endgame");
        movie.put(2, "Spiderman : Far From Home");
        movie.put(3, "Venom");
        movie.put(4, "Thor : Ragnarok");
        printMovie(movie);
        System.out.println("(d)Detail (s)Search (a)Add (r)Remove");
        // Rilis
        Map<Integer, String> rilis = new HashMap<>();
        rilis.put(1, "24 April 2019");
        rilis.put(2, "3 Juli 2019");
        rilis.put(3, "3 Oktober 2018");
        rilis.put(4, "25 Oktober 2017");
        // Durasi
        Map<Integer, String> durasi = new HashMap<>();
        durasi.put(1, "3 jam 1 menit");
        durasi.put(2, "2 jam 9 menit");
        durasi.put(3, "2 jam 20 menit");
        durasi.put(4, "2 jam 10 menit");
        // Genre
        Map<Integer, String> genre = new HashMap<>();
        genre.put(1, "Adventure, Sci-fi, Action");
        genre.put(2, "Adventure, SuperHero, Action, Comedy, Sci-fi");
        genre.put(3, "Action, Sci-fi, Horror, Adventure");
        genre.put(4, "Action, Comedy, SuperHero, Sci-fi, Adventure");
        // Sinopsis
        Map<Integer, String> sinopsis = new HashMap<>();
        sinopsis.put(1, "\"Ini adalah sinopsis\"");
        sinopsis.put(2, "\"Ini adalah sinopsis\"");
        sinopsis.put(3, "\"Ini adalah sinopsis\"");
        sinopsis.put(4, "\"Ini adalah sinopsis\"");
        // Cast
        Map<Integer, String> cast = new HashMap<>();
        cast.put(1, "Robert Downey Jr., Chris Evan, Mark Rufallo");
        cast.put(2, "Tom Holland, Samuel L. Jackson, Jake Gyllenhaal");
        cast.put(3, "Tom Hardy, Michelle Williams, Riz Ahmed");
        cast.put(4, "Chris Hemsworth, Tom Hiddleston, Cate Blanchett");

        String lanjut = "y";
        while (lanjut.equalsIgnoreCase("y")) {
            String pilihan = input.next();
            switch (pilihan) {
                // (d) Detail
                case "d":
                    int urutan = input.nextInt();
                    System.out.println("Judul\t : " + movie.get(urutan));
                    System.out.println("Rilis\t : " + rilis.get(urutan));
                    System.out.println("Durasi\t : " + durasi.get(urutan));
                    System.out.println("Genre\t : " + genre.get(urutan));
                    System.out.println("Sinopsis : " + sinopsis.get(urutan));
                    System.out.println("Cast\t : " + cast.get(urutan));
                    break;
                // (s) Search
                case "s":
                    String cari = input.next();
                    int count = 0;
                    System.out.println("Berikut Daftar Film yang Terkait dengan \"" + cari + "\" :");
                    for (Integer key : movie.keySet()) {

                        String cekMovieName = (String) movie.get(key).toLowerCase();
                        boolean booleanCekMovie = cekMovieName.contains(cari.toLowerCase());
                        if (booleanCekMovie) {
                            count++;
                            System.out.println(count + ". " + movie.get(key));
                        }
                    }
                    break;
                // (a) add
                case "a":
                    System.out.println("=== Masukkan Data ===");
                    String newMovie = input.nextLine();
                    System.out.print("Judul\t :" + newMovie + "\n");
                    System.out.print("Rilis\t : ");
                    String newRilis = input.nextLine();
                    System.out.print("Durasi\t : ");
                    String newDurasi = input.nextLine();
                    System.out.print("Genre\t : ");
                    String newGenre = input.nextLine();
                    System.out.print("Sinopsis : ");
                    String newSinopsis = input.nextLine();
                    System.out.print("Cast\t : ");
                    String newCast = input.next();

                    // movie.put(movie.size() + 1, newMovie.substring(1));
                    // rilis.put(rilis.size() + 1, newRilis);
                    // durasi.put(durasi.size() + 1, newDurasi);
                    // genre.put(genre.size() + 1, newGenre);
                    // sinopsis.put(sinopsis.size() + 1, newSinopsis);
                    // cast.put(cast.size() + 1, newCast);
                    // System.out.println("Favorite Movie");
                    // printMovie(movie);

                    int count2 = movie.size() + 1;
                    while (count2 < movie.size() + 2) {
                        movie.put(count2, newMovie.substring(1));
                        rilis.put(count2, newRilis);
                        durasi.put(count2, newDurasi);
                        genre.put(count2, newGenre);
                        sinopsis.put(count2, newSinopsis);
                        cast.put(count2, newCast);
                        System.out.println("Favorite Movie");
                        printMovie(movie);
                        count2++;
                        if (count2 < movie.size() + 2) {
                            break;
                        }
                    }
                    break;
                // (r) Remove
                case "r":
                    int movieRemove = input.nextInt();
                    if (movieRemove == movie.size()) {
                        movie.remove(movieRemove);
                        rilis.remove(movieRemove);
                        durasi.remove(movieRemove);
                        genre.remove(movieRemove);
                        sinopsis.remove(movieRemove);
                        cast.remove(movieRemove);
                    } else {
                        for (int i = movieRemove; i < movie.size(); i++) {
                            movie.replace(i, movie.get(i + 1));
                            rilis.replace(i, rilis.get(i + 1));
                            durasi.replace(i, durasi.get(i + 1));
                            genre.replace(i, genre.get(i + 1));
                            sinopsis.replace(i, sinopsis.get(i + 1));
                            cast.replace(i, cast.get(i + 1));
                            if (i == movie.size() - 1) {
                                movie.remove(movie.size());
                                rilis.remove(rilis.size());
                                durasi.remove(durasi.size());
                                genre.remove(genre.size());
                                sinopsis.remove(sinopsis.size());
                                cast.remove(cast.size());
                            }
                        }
                    }
                    System.out.println("Favorite Movie");
                    printMovie(movie);
                    break;
            }
            // Continue?
            System.out.print("Continue? (Y/N) : ");
            lanjut = input.next();
            if (lanjut.equalsIgnoreCase("y")) {
                System.out.println();
                System.out.println("Favorite Movie");
                printMovie(movie);
                if (movie.isEmpty()) {
                    System.out.println("=== Anda Tidak Memiliki Film Favorite :( ===");
                }
                System.out.println("(d)Detail (s)Search (a)Add (r)Remove");
            }
        }
        input.close();
    }

    static void printMovie(Map<Integer, String> a) {
        for (int i = 1; i < a.size() + 1; i++) {
            System.out.println(i + ". " + a.get(i));
        }

    }
}

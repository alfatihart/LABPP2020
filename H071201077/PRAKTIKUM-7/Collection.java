import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Collection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Map<Integer, String> movie = new HashMap<>();
        movie.put(1, "Avenger : Endgame");
        movie.put(2, "Spiderman : Far From Home");
        movie.put(3, "Venom");
        movie.put(4, "Thor : Ragnarok");
        printMovie(movie);
        System.out.println("(d)Detail (s)Search (a)Add (r)Remove");
        
        Map<Integer, String> rilis = new HashMap<>();
        rilis.put(1, "24 April 2019");
        rilis.put(2, "3 Juli 2019");
        rilis.put(3, "3 Oktober 2018");
        rilis.put(4, "25 Oktober 2017");
        
        Map<Integer, String> durasi = new HashMap<>();
        durasi.put(1, "3 jam 2 menit");
        durasi.put(2, "2 jam 9 menit");
        durasi.put(3, "2 jam 20 menit");
        durasi.put(4, "2 jam 10 menit");
        
        Map<Integer, String> genre = new HashMap<>();
        genre.put(1, "Adventure,Sci-fi, Action");
        genre.put(2, "Action, Adventure,Sci-fi,Comedy,Fantasi, Super Hero");
        genre.put(3, "Adventure,Sci-fi, Action, Horor,Super Hero");
        genre.put(4, "Comedy,Fantasi,Super Hero,Adventure,Sci-fi, Action");

        
        Map<Integer, String> sinopsis = new HashMap<>();
        sinopsis.put(1, "Epic comeback dari kemusnahan  ");
        sinopsis.put(2, "laba-laba yang pergi berlibur dan bertemu Alien Bertopi akuarium yang ternyata cuman ilusi ");
        sinopsis.put(3, "Spiderman Versi Hitam ");
        sinopsis.put(4, "Dewa Petir yang di penjara dan bertemu buto ijo yang melawan nenek sihir hitam");
        
        Map<Integer, String> cast = new HashMap<>();
        cast.put(1, "Chris Evans, Chris Hemsworth,Rober Downey Jr,Tom Holland,Mark Rufallo");
        cast.put(2, "Tom Holland, Zendaya,Jake Gyllenhaal,Samuel L. Jakson");
        cast.put(3, "Tom Hardy,Riz Ahmed,Michelle Williams");
        cast.put(4, "Chris Hemswoth,Mark Ruffalo,Cate Blanchett,Tom Hiddleston");

        String t  = "x";
        while (t.equalsIgnoreCase("x")) {
            String pilih = input.next();
            switch (pilih) {
               
                case "d":
                    int data = input.nextInt();
                    System.out.println("Judul\t : " + movie.get(data));
                    System.out.println("Rilis\t : " + rilis.get(data));
                    System.out.println("Durasi\t : " + durasi.get(data));
                    System.out.println("Genre\t : " + genre.get(data));
                    System.out.println("Sinopsis : " + sinopsis.get(data));
                    System.out.println("Cast\t : " + cast.get(data));
                    break;
                
                case "s":
                    String cari = input.next();
                    int hasil = 0;
                    System.out.println(" Film yang terkait :");
                    for (Integer m : movie.keySet()) {

                        String nama = (String) movie.get(m).toLowerCase();
                        boolean cek = nama.contains(cari.toLowerCase());
                        if (cek) {
                            hasil++;
                            System.out.println(hasil + ". " + movie.get(m));
                        }
                    }
                    break;
                
                case "a":
                    String baru = input.nextLine();
                    System.out.println("Masukkan Data Lainnnya");
                    System.out.print("Judul\t :" + baru + "\n");
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


                    int count2 = movie.size() + 1;
                    while (count2 < movie.size() + 2) {
                        movie.put(count2, baru.substring(1));
                        rilis.put(count2, newRilis);
                        durasi.put(count2, newDurasi);
                        genre.put(count2, newGenre);
                        sinopsis.put(count2, newSinopsis);
                        cast.put(count2, newCast);
                        System.out.println("Daftar Film Setelah ditambahkan");
                        printMovie(movie);
                        count2++;
                        if (count2 < movie.size() + 2) {
                            break;
                        }
                    }
                    break;
                
                case "r":
                    int hapus = input.nextInt();
                    if (hapus == movie.size()) {
                        movie.remove(hapus);
                        rilis.remove(hapus);
                        durasi.remove(hapus);
                        genre.remove(hapus);
                        sinopsis.remove(hapus);
                        cast.remove(hapus);
                    } else {
                        for (int i = hapus; i < movie.size(); i++) {
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
                    System.out.println("Daftar Film Terbaru Setelah dihapus");
                    printMovie(movie);
                    break;
            }
        }
        input.close();
    }
    static void printMovie(Map<Integer, String> x) {
        for (int i = 1; i < x.size() + 1; i++) {
            System.out.println(i + " " + x.get(i));
        }

    }
}
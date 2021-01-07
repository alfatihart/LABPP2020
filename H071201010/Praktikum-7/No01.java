import java.util.Scanner;
import java.util.HashMap;
public class No01{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap <Integer ,String> movie = new HashMap();
        System.out.println("Favorite Movie");
        System.out.println("===============");

        movie.put(1, "Avengers: End Game");
        movie.put(2, "Spider-man: Far From Home");
        movie.put(3, "Thor: Ragnarok");
        movie.put(4, "Maquia: When the Promised Flower Blooms");

        for (Integer i  : movie.keySet()) {
            System.out.println(i + ". " + movie.get(i));
        }

        HashMap <Integer, String> rilis = new HashMap();
        rilis.put(1, "24 April 2019");
        rilis.put(2, "2 Juli 2019");
        rilis.put(3, "25 Oktober 2017");
        rilis.put(4, "24 February 2018");

        HashMap <Integer, String> durasi = new HashMap();
        durasi.put(1, "3 jam 1 menit");
        durasi.put(2, "2 jam 9 menit");
        durasi.put(3, "2 jam 10 menit");
        durasi.put(4, "1 jam 55 menit");

        HashMap <Integer, String> genre = new HashMap();
        genre.put(1, "Adventure, Sci-Fi, Action");
        genre.put(2, "Superhero, Sci-Fi, Action");
        genre.put(3, "Adventure, Sci-Fi, Action");
        genre.put(4, "Drama, Fantasy, Animation");

        HashMap <Integer, String> sinopsis = new HashMap();
        sinopsis.put(1, "Avengers: Endgame menceritakan kejadian setelah kekalahan Avengers melawan Thanos.");
        sinopsis.put(2, "Spiderman: Far From Home menceritakan tentang perjalanan kehidupan Peter Parker setelah Avangers Endgame.");
        sinopsis.put(3, "Thor: Ragnarok sendiri bercerita tentang petualangan Thor dalam menghadap ramalan kehancuran Asgar yang disebut Ragnarok.");
        sinopsis.put(4, "Film ini menghadirkan kisah seorang Iorph bernama Maquia bagaimana ia bertemu dengan seorang dari ras manusia yang bernama Ariel.");
        
        HashMap <Integer, String> cast = new HashMap<>();
        cast.put(1, "Robert Downey Jr., Chris Evan, Mark Rufallo");
        cast.put(2, "Tom Holland, Samuel L. Jackson, Jake Gyllenhaal");
        cast.put(3, "Chris Hemsworth, Tom Hiddleston, Cate Blanchett");
        cast.put(4, "Manaka Iwami, Miyu Irino, Ai Kayano");

        printOption();

        while(true){
        String option = scan.next();
        switch(option){
            case "d":
            int list = scan.nextInt();
            System.out.println("Judul\t : " + movie.get(list));
            System.out.println("Rilis\t : " + rilis.get(list));
            System.out.println("Durasi\t : " + durasi.get(list));
            System.out.println("Genre\t : " + genre.get(list));
            System.out.println("Sinopsis : " + sinopsis.get(list));
            System.out.println("Cast\t : " + cast.get(list));
            printOption();
            break;

            case "s":
            System.out.println("Ketik yang ingin dicari:");
            String search = scan.next();
            int hasilsearch = 0;
            System.out.println("=========================");
            System.out.println("Pencarian yang terkait:");
            for (Integer i : movie.keySet()) {
                String checking = movie.get(i).toLowerCase();
                boolean searching = checking.contains(search.toLowerCase());
                if (searching) {
                    hasilsearch++;
                    System.out.println(hasilsearch + ". " + movie.get(i));
                }
            }
            printOption();
            break;

            case "a":
            String newMovie = scan.nextLine();
            System.out.print("Judul\t :" + newMovie + "\n");
            System.out.print("Rilis\t : ");
            String newRilis = scan.nextLine();
            System.out.print("Durasi\t : ");
            String newDurasi = scan.nextLine();
            System.out.print("Genre\t : ");
            String newGenre = scan.nextLine();
            System.out.print("Sinopsis : ");
            String newSinopsis = scan.nextLine();
            System.out.print("Cast\t : ");
            String newCast = scan.next();

            int newList = movie.size() + 1;
            while(newList < movie.size() + 2){
                movie.put(newList, newMovie);
                rilis.put(newList, newRilis);
                durasi.put(newList, newDurasi);
                genre.put(newList, newGenre);
                sinopsis.put(newList, newSinopsis);
                cast.put(newList, newCast);

                System.out.println("\nFavorite Movie");
                System.out.println("===============");

                for (Integer i  : movie.keySet()) {
                    System.out.println(i + ". " + movie.get(i));
                }

                newList++;
                if(newList < movie.size() + 2){
                    break;
                }
            }
            printOption();
            break;

            case "r":
            int remove = scan.nextInt();
            if(remove == movie.size()){
                movie.remove(remove);
                rilis.remove(remove);
                durasi.remove(remove);
                genre.remove(remove);
                sinopsis.remove(remove);
                cast.remove(remove);
            }else{
                for (int i = remove; i < movie.size(); i++) {
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
            System.out.println("===============");
    
            for (Integer i  : movie.keySet()) {
                System.out.println(i + ". " + movie.get(i));
            }
            printOption();
            break;
            }
        }
    }
    static void printOption(){
        System.out.println("\n(d)Detail " + "(s)Search " + "(a)Add " + "(r)Remove");
        System.out.print(">");
    }
}
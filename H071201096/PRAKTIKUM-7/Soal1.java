import java.util.*;
public class Soal1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> movieFavourite = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        movieFavourite.put("Judul", new ArrayList<>());
        movieFavourite.put("Rilis", new ArrayList<>());
        movieFavourite.put("Durasi", new ArrayList<>());
        movieFavourite.put("Genre", new ArrayList<>());
        movieFavourite.put("Sinopsis", new ArrayList<>());
        movieFavourite.put("Cast", new ArrayList<>());
        String cek = "Y";
        while(cek.equalsIgnoreCase("Y")){
            daftarFilm(movieFavourite);
            System.out.println("(d) detail (s) search (a) add (r) remove");
            String input = scan.next();
        if(input.equalsIgnoreCase("d")){
            int nomorFilm = scan.nextInt() - 1;
            detailFilm(nomorFilm,movieFavourite);
            System.out.println("Y/N untuk melanjutkan daftar Film");
            cek = scan.next();
        }
        else if(input.equalsIgnoreCase("a")){
            addFilm(movieFavourite,scan);
            daftarFilm(movieFavourite);
            System.out.println("Y/N untuk melanjutkan daftar Film");
            cek = scan.next();
        }
        else if(input.equalsIgnoreCase("r")){
            int deleteNumberOfFilm = scan.nextInt() - 1;
            removeFilm(deleteNumberOfFilm,movieFavourite);
            daftarFilm(movieFavourite);
            System.out.println("Y/N untuk melanjutkan daftar Film");
            cek = scan.next();
        }
        else if(input.equalsIgnoreCase("s")){
            String input2 = scan.next();
            System.out.printf(search(input2,movieFavourite));
            System.out.println("stop? (Y/N) ");
            cek = scan.next();

        }
        else{
            System.out.println("Berhenti? (Y/N)");
            cek = scan.next();
        }
      }  
    }
    public static void daftarFilm(HashMap<String, ArrayList<String>> movieFavourite){
        ArrayList<String> judulFilm = movieFavourite.get("Judul");
        System.out.println("Favourite Movie");
        if(judulFilm.isEmpty()){
            System.out.println("Daftar Kosong");
        }
        for(int i = 0; i < judulFilm.size(); i++){
            System.out.println(i + 1 +". "+ judulFilm.get(i));
        }
    }
    public static void detailFilm(int nomorFilm, HashMap<String, ArrayList<String>> movieFavourite){
        System.out.println("Judul: " + movieFavourite.get("Judul").get(nomorFilm));
        System.out.println("Rilis: " + movieFavourite.get("Rilis").get(nomorFilm));
        System.out.println("Durasi: " + movieFavourite.get("Durasi").get(nomorFilm));
        System.out.println("Genre: " + movieFavourite.get("Genre").get(nomorFilm));
        System.out.println("Sinopsis: " + movieFavourite.get("Sinopsis").get(nomorFilm));
        System.out.println("Cast: " + movieFavourite.get("Cast").get(nomorFilm));

    }
    public static void addFilm(HashMap<String, ArrayList<String>> movieFavourite, Scanner scan2){
        scan2.nextLine();
        String judul;   String rilis;       String durasi;
        String genre;   String sinopsis;    String cast;

        System.out.println("Judul:"); judul = scan2.nextLine();
        System.out.println("Rilis:"); rilis = scan2.nextLine(); 
        System.out.println("Durasi:"); durasi = scan2.nextLine();
        System.out.println("Genre:"); genre = scan2.nextLine();
        System.out.println("Sinopsis:"); sinopsis = scan2.nextLine();
        System.out.println("Cast:"); cast = scan2.nextLine();

        movieFavourite.get("Judul").add(judul);
        movieFavourite.get("Rilis").add(rilis);
        movieFavourite.get("Durasi").add(durasi);
        movieFavourite.get("Genre").add(genre);
        movieFavourite.get("Sinopsis").add(sinopsis);
        movieFavourite.get("Cast").add(cast);
    }
    public static void removeFilm(int deleteNumberOfFilm, HashMap<String, ArrayList<String>> movieFavourite){
        movieFavourite.get("Judul").remove(deleteNumberOfFilm);
        movieFavourite.get("Rilis").remove(deleteNumberOfFilm);
        movieFavourite.get("Durasi").remove(deleteNumberOfFilm);
        movieFavourite.get("Genre").remove(deleteNumberOfFilm);
        movieFavourite.get("Sinopsis").remove(deleteNumberOfFilm);
        movieFavourite.get("Cast").remove(deleteNumberOfFilm);
    }
    public static String search(String input2, HashMap<String, ArrayList<String>> movieFavourite){
        ArrayList<String> judul = movieFavourite.get("Judul");
        String out = "hasil ("+ input2 +") :\n";
        for (int i = 0; i < judul.size(); i++) {
            String movie = judul.get(i);
            for (int j = 0; j < movie.length(); j++) {
                if(j+input2.length() <= movie.length()){
                    if(input2.equalsIgnoreCase(movie.substring(j,j+input2.length()))){
                        out += String.format(i+1 + "." +movie + "\n");
                        break;
                    }

                }
                else{
                    continue;
                }
            }
        }
        return out;

    }
} 
import java.util.Scanner;
import java.util.HashMap;
class FavMovie{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<Integer, String> favourite = new HashMap<>();
        System.out.println("Favourite Movie");
        int x = 1;
        favourite.put(x++,"Avenger: Endgame");
        favourite.put(x++,"Spiderman: Far From Home");
        favourite.put(x++,"Venom");
        favourite.put(x++,"Thor: Ragnarok");

        favourite.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + ". " + entry.getValue());  
        });
        System.out.println("(d)detail (s)search (a)add (r)remove");

        String[] detail = {"Judul : ", "Rilis : ", "Durasi : ", "Genre : ", "Sinopsis : ", "Cast : "};

        HashMap<Integer, String> detRil = new HashMap<>();
        int y = 1;
        detRil.put(y++,"24 April 2019");
        detRil.put(y++,"2 Juli 2019 ");
        detRil.put(y++,"5 Oktober 2015");
        detRil.put(y++,"3 November 2017");

        HashMap<Integer, String> detDur = new HashMap<>();
        int z = 1;
        detDur.put(z++,"3 Jam 1 Menit");
        detDur.put(z++,"2 jam 9 menit");
        detDur.put(z++,"1 Jam 52 Menit ");
        detDur.put(z++,"2 Jam 10 menit");

        HashMap<Integer, String> detGen = new HashMap<>();
        int a = 1;
        detGen.put(a++,"Adventure, Sci-Fi, Action");
        detGen.put(a++,"Adventure, Sci-Fi, Action");
        detGen.put(a++,"Action, Science, thriller");
        detGen.put(a++,"Adventure, Sci-Fi, Action, Fantasy");

        HashMap<Integer, String> detSin = new HashMap<>();
        int b = 1;
        detSin.put(b++,"Ini sinopsis Avenger");
        detSin.put(b++,"Ini sinopsis Spiderman ");
        detSin.put(b++,"Ini sinopsis Venom");
        detSin.put(b++,"Ini sinopsos thor");

        HashMap<Integer, String> detCast = new HashMap<>();
        int c = 1;
        detCast.put(c++,"Robert Downey Jr., Chris Evan, Mark Ruffalo");
        detCast.put(c++,"Tom Holland, Samuel L.Jackson, Zendaya  ");
        detCast.put(c++,"Tom Hardy, Michelle Williams, Riz Ahmed, Scott Haze, Reid Scott");
        detCast.put(c++,"Chris Hemsworth, Tom Hiddleston, Cate Blanchett , Idris Elba");

        
        while(scan.hasNext()){
            char check = scan.next().charAt(0);

            //details
            if(check == 'd' && scan.hasNextInt()){
                int detCheck = scan.nextInt();
                for(int i = 0;i<detail.length;i++){
                    if(i == 0){
                        System.out.println(detail[i] + favourite.get(detCheck));
                    }else if(i == 1){
                        System.out.println(detail[i] + detRil.get(detCheck));
                    }else if(i == 2){
                        System.out.println(detail[i] + detDur.get(detCheck));
                    }else if(i == 3){
                        System.out.println(detail[i] + detGen.get(detCheck));
                    }else if(i == 4){
                        System.out.println(detail[i] + detSin.get(detCheck));
                    }else if(i == 5){
                        System.out.println(detail[i] + detCast.get(detCheck));
                    }
                }
                System.out.println("______________________________________________________________");
                System.out.println("Favourite Movie");
                favourite.entrySet().forEach(entry->{
                    System.out.println(entry.getKey() + ". " + entry.getValue());  
                });
                System.out.println("(d)detail (s)search (a)add (r)remove");
            }

            //Search
            if(check == 's' && scan.hasNext()){
                String searchCheck = scan.next();
                //boolean isFound;
                for(int i = 1;i<favourite.size();i++){
                    boolean isFound = favourite.get(i).indexOf(searchCheck) !=-1? true: false;
                    if(isFound){
                        System.out.println(favourite.get(i));
                    }
                }
                System.out.println("(d)detail (s)search (a)add (r)remove");
            }

            //add
            if(check == 'a'){
                for(int i = 0; i<detail.length;i++){
                    System.out.print(detail[i]);
                    String input = scan.nextLine();
                    if(i == 0){
                        input = scan.nextLine();
                        favourite.put(x++, input);
                    }else if(i == 1){
                        detRil.put(y++, input);
                    }else if(i == 2){
                        detDur.put(z++, input);
                    }else if(i == 3){ 
                        detGen.put(a++, input);
                    }else if(i == 4){
                        detSin.put(b++, input);
                    }else if(i == 5){
                        detCast.put(c++, input);
                    }
                }
                System.out.println("Favourite Movie");
                favourite.entrySet().forEach(entry->{
                    System.out.println(entry.getKey() + ". " + entry.getValue());  
                });
                System.out.println("(d)detail (s)search (a)add (r)remove");
            }

            //Remove
            if(check == 'r' && scan.hasNextInt()){
                int removeCheck = scan.nextInt();
                if(removeCheck < favourite.size()){
                    for(int i = removeCheck;i<favourite.size();i++){
                        favourite.replace(i, favourite.get(i+1));
                        detRil.replace(i, detRil.get(i+1));
                        detDur.replace(i, detDur.get(i+1));
                        detGen.replace(i, detGen.get(i+1));
                        detSin.replace(i, detSin.get(i+1));
                        detCast.replace(i, detCast.get(i+1));
                        if(i+1==favourite.size()){
                            favourite.remove(i+1);
                            detRil.remove(i+1);
                            detDur.remove(i+1);
                            detGen.remove(i+1);
                            detSin.remove(i+1);
                            detCast.remove(i+1);
                            x-=1;
                            y-=1;
                            z-=1;
                            a-=1;
                            b-=1;
                            c-=1;
                        }
                    }
                }else{
                    favourite.remove(removeCheck);
                    detRil.remove(removeCheck);
                    detDur.remove(removeCheck);
                    detGen.remove(removeCheck);
                    detSin.remove(removeCheck);
                    detCast.remove(removeCheck);
                    x-=1;
                    y-=1;
                    z-=1;
                    a-=1;
                    b-=1;
                    c-=1;
                }
                System.out.println("Favourite Movie");
                favourite.entrySet().forEach(entry->{
                    System.out.println(entry.getKey() + ". " + entry.getValue());  
                });
                System.out.println("(d)detail (s)search (a)add (r)remove");
            }
        }
    }
}
import java.util.ArrayList;

public class ForEach {
    public static ArrayList<String> liste = new ArrayList<>();
    public static void forEachListe(ArrayList<String> liste){
        liste.add("Hallo");
        liste.add("Servus");
        liste.forEach(System.out::println);
    }
}

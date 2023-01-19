package Aufgabe_2_4;

public interface PrüfeStrings {
    boolean prüfen(String a, String b);
    static boolean A_IstLängerAls_B(String a, String b){
        return a.length() > b.length();
    }
    static boolean A_HatMehrEAls_B(String a, String b){
        int countA = 0, countB = 0;
        for(int i=0;i<a.length();i++) if(a.toLowerCase().charAt(i) == 'e') countA++;
        for(int i=0;i<b.length();i++) if(b.toLowerCase().charAt(i) == 'e') countB++;
        return countA > countB;
    }
    static void Sortiere(String[] array, PrüfeStrings prüfe) {
        String smaller;
        String bigger;
        boolean run = true;
        for (int i = 0; i < array.length && run == true; i++) {
            run = false;

            for (int y = 0; y < array.length-1; y++) {
                if(prüfe.prüfen(array[y], array[y+1])) {
                    bigger = array[y];
                    smaller = array[y + 1];
                    array[y] = smaller;
                    array[y + 1] = bigger;
                    run = true;
                }
            }
        }
    }
    static void Ausgabe(String[] array){
        for(var x : array) System.out.println(x);
    }
}

package Unterricht.StringVerarbeitung;

public class Kontext {
    private Strategie strategie;
    public Kontext(Strategie strategie){
        this.strategie = strategie;
    }
    public void setStrategie(Strategie strategie) {
        this.strategie = strategie;
    }
    public String erstelleZeichenkette(String s1, String s2){
        return this.strategie.erstelleZeichenkette(s1, s2);
    }
}

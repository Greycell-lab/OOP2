package Unterricht;

public class SeeFrachtBrief implements Transportauftrag {
    @Override
    public void ausliefern() {
        System.out.println("Ich werde in einen Container gepackt und per Schiff versendet.");
    }
}

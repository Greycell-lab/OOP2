package Unterricht;

public class LandFrachtBrief implements Transportauftrag {
    @Override
    public void ausliefern() {
        System.out.println("Ich werde in eine Box verpackt und auf einen LKW verladen.");
    }
}

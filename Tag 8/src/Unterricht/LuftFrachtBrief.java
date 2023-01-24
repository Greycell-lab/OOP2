package Unterricht;

public class LuftFrachtBrief implements Transportauftrag {
    @Override
    public void ausliefern() {
        System.out.println("Ich werde per Flugzeug verschickt.");
    }
}

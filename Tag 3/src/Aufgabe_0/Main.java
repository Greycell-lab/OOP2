package Aufgabe_0;
public class Main {
    public static void main(String[] args) {
        new Künstler() {
            @Override
            public void kunstErstellen() {
                System.out.println("Ich male ein Bild");
            }
        }.kunstErstellen();
        new Künstler() {
            @Override
            public void kunstErstellen() {
                System.out.println("Ich singe einen Song");
            }
        }.kunstErstellen();
    }
}
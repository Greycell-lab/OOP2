package Aufgabe_0;

public class Musiker implements IGitarrenspieler, ISänger {
    public void gitarreSpielen(){
        System.out.println("Ich spiele Gitarre");
    }
    public void singen(){
        System.out.println("Ich singe ein Lied");
    }
}

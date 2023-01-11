package Aufgabe_2;

import java.util.ArrayList;

public abstract class GeräuscheMacher {
    public static ArrayList<GeräuscheMacher> macher = new ArrayList<>();
    public GeräuscheMacher(){
        macher.add(this);
    }
    public abstract void macheGeräusch();
}

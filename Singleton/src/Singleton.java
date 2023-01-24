public class Singleton {
    static Singleton instance = null;
    private Singleton(){
    }
    public static Singleton getInstance(){
        if(instance == null) instance = new Singleton();
        return instance;
    }
    public static boolean compareInstances(Singleton a, Singleton b){
        return a == b;
    }
}

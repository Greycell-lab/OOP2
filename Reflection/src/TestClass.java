public class TestClass {
    private String name;
    private int nummer;
    public TestClass(String name, int nummer){
        this.name = name;
        this.nummer = nummer;
    }
    private void isThisPossible(){
        System.out.println("Yes it is...");
    }
    public String toString(){
        return "Name: " + name + "\nNummer: " + nummer + "\n";
    }
}

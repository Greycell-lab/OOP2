import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{
        TestClass object = new TestClass("Ralf", 55);
        System.out.println(object);
        Field[] fields = object.getClass().getDeclaredFields();
        Method[] methods = object.getClass().getDeclaredMethods();
        for(Field field : fields){
            if(field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(object, "No you´re not Ralf, you are Rolf");
                System.out.println(object);
            }
        }
        for(Method method : methods){
            System.out.println(method.getName());
            method.setAccessible(true);
            System.out.println();
            method.invoke(object);
        }
    }
}
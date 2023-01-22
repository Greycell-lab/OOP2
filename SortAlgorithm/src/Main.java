import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] array = {33, 3, 55, 44, 32, 67, 33, 11, 44};
        String[] array = {"This", "Lol", "Huh", "Alf", "lol"};
        System.out.println(Arrays.toString(array));
        BubbleSort.arraySort(array);
        System.out.println(Arrays.toString(array));

    }
}
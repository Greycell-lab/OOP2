public class BubbleSort {
    public static void arraySort(int[] array){
        int temp;
        for(int i=0;i<array.length;i++){
            for(int y=0;y< array.length-1-i;y++){
                if(array[y] > array[y+1]){
                    temp = array[y];
                    array[y] = array[y+1];
                    array[y+1] = temp;
                }
            }
        }
    }
    public static void arraySort(String[] array){
        String temp;
        for(int i=0;i<array.length;i++){
            for(int y=0;y< array.length-1-i;y++){
                if(array[y].toLowerCase().charAt(0) > array[y+1].toLowerCase().charAt(0)){
                    temp = array[y];
                    array[y] = array[y+1];
                    array[y+1] = temp;
                }
            }
        }
    }
}

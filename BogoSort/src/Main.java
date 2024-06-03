import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {1, 9, 8, 7,5};        
        BogoSort.bogoSort(array);
        System.out.println(Arrays.toString(array));
    }
}
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BogoSort {

    public static <T extends Comparable<T>> boolean estaOrdenado(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) >= 0) {
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable<T>> void bogoSort(T[] array){

        List<T> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array);
        if(estaOrdenado(array)){
            return;
        }
        else{
            bogoSort(array);
        }
        System.out.println(Arrays.toString(array));
    }
    
}

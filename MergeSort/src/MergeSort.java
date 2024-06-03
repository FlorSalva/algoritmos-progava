public class MergeSort {

    public static <T extends Comparable<T>> void mergeSortENCL(T[] array){
        int techo = array.length;
        int piso = 0;

        mergeSort(array, piso, techo);
    }

    private static <T extends Comparable<T>> void mergeSort(T[] array, int piso, int techo) {
        if (techo - piso <= 1) {
            return;
        }
    
        int medio = piso + (techo - piso) / 2;
    
        mergeSort(array, piso, medio);
        mergeSort(array, medio, techo);
    
        int verde = piso;
        int naranja = medio;
        T[] array1 = (T[]) new Comparable[techo - piso];
        int celeste = 0;
    
        while (verde < medio && naranja < techo) {
            if (array[verde].compareTo(array[naranja]) <= 0) {
                array1[celeste] = array[verde];
                celeste++;
                verde++;
            } else {
                array1[celeste] = array[naranja];
                celeste++;
                naranja++;
            }
        }
    
        while (verde < medio) {
            array1[celeste] = array[verde];
            celeste++;
            verde++;
        }
    
        while (naranja < techo) {
            array1[celeste] = array[naranja];
            celeste++;
            naranja++;
        }
    
        for (int i = 0; i < array1.length; i++) {
            array[piso + i] = array1[i];
        }
    }
}
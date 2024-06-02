public class MergeSort {

    static void mergeSortENCL(Integer[] array){
        int techo = array.length;
        int piso = 0;

        mergeSort(array,piso,techo);
    }

    static void mergeSort(Integer[] array, int piso, int techo) {
        if (techo - piso <= 1) {
            return;
        }
    
        int medio = piso + (techo - piso) / 2;
    
        mergeSort(array, piso, medio);
        mergeSort(array, medio, techo);
    
        merge(array, piso, medio, techo);
    }
    
    static void merge(Integer[] array, int piso, int medio, int techo) {
        int verde = piso;
        int naranja = medio;
        int[] array1 = new int[techo - piso];
        int celeste = 0;
    
        while (verde < medio && naranja < techo) {
            if (array[verde] <= array[naranja]) {
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

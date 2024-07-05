public class ShellSort {
    static <T extends Comparable<T>> void aswap(T[] arreglo, int p, int t) {
        T temporal = arreglo[p];
        arreglo[p] = arreglo[t];
        arreglo[t] = temporal;
    }
    
    static  <T extends Comparable<T>> void shellSortENC(T[] array) {
        shellSort(array,shellSize);
    }

    static <T extends Comparable<T>> void shellSort(T[] array) {
        int n = array.length;
       
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                T temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap].compareTo(temp) > 0; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }
}

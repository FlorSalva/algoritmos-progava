public class ShellSort {
    
    static <T extends Comparable<T>> void aswap(T[] arreglo, int p, int t)
    {
        T temporal = arreglo[p];
        arreglo[p] = arreglo[t];
        arreglo[t] = temporal;
    }
    
    static  <T extends Comparable<T>> void shellSortENC(T[] array){
        int shellSize = (array.length) / 2;
        shellSort(array,shellSize);
    }

    static  <T extends Comparable<T>> void shellSort(T[] array, int shellSize){
        if(shellSize < 1){
            return;
        }
        int shellpiso = 0;
        int shelltecho = shellSize;
        while ( shelltecho < array.length ){
            if ( array[shellpiso].compareTo(array[shelltecho]) >= 0 ){
                aswap(array, shellpiso, shelltecho);
            }
            shelltecho++;
            shellpiso++;
        }
        shellSize--;
        shellSort(array, shellSize);
    }
}

public class QuickSort {
    static <T extends Comparable<T>> void aswap(T[] arreglo, int p, int t)
    {
        T temporal = arreglo[p];
        arreglo[p] = arreglo[t];
        arreglo[t] = temporal;
    }

    static <T extends Comparable<T>> void iQuickSortEnvol(T[] arreglo)
    {
        int techo = arreglo.length-1;
        int piso = 0;

        iQuickSort(arreglo, piso, techo);
    }

    static <T extends Comparable<T>> void iQuickSort(T[] arreglo, int piso, int techo)
    {
        if( piso >= techo)
        { 
            return;
        }

        int verde = piso;
        int naranja = piso-1;
        int celeste = techo;

        for (int i = piso; i <= celeste ; i++){
            if (arreglo[verde].compareTo(arreglo[celeste]) <= 0){
                naranja++;
                if( verde > naranja ){
                    aswap(arreglo,verde,naranja);
                }
            }
            verde++;
        }
        iQuickSort(arreglo, piso, naranja - 1);
        iQuickSort(arreglo, naranja + 1, techo);

    }
}

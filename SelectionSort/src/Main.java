public class Main {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 99};

        System.out.println("Arreglo original:");
        SelectionSort.printArray(arr);

        SelectionSort.selectionSort(arr);

        System.out.println("Arreglo ordenado:");
        SelectionSort.printArray(arr);
    }
}
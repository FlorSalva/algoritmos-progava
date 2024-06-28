public class Main {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Arreglo original:");
        BubbleSort.printArray(arr);

        BubbleSort.bubbleSort(arr);

        System.out.println("Arreglo ordenado:");
        BubbleSort.printArray(arr);
    }
}
public class Main {

    
    public static void main(String[] args) {

        Integer[] array = {12,45,6,2,3,13,4};
        //Integer[] array = {};
        //Integer[] array = {1};
        //Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //Integer[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        //Integer[] array = {7, 7, 7, 7, 7, 7, 7, 7};
        //Integer[] array = {38, 27, 43, 3, 9, 82, 10, 2, 56, 74, 1, 65, 99, 23, 76, 4, 55, 34, 91, 14};
        //Integer[] array = {4, 5, 2, 8, 4, 3, 2, 5, 6, 8, 1, 3, 7, 2};
        //Integer[] array = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE};
        MergeSort.mergeSortENCL(array);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            System.out.print(" ");  
        }
    }
}

package by.examples.test.repeat;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {55, 15, 555, 28, -19};
        selectionSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void selectionSort(int[] a){
        for (int i = a.length - 1; i > 0; i--) {
            int largest = 0;
            for (int j = 1; j <= i  ; j++) {
                if(a[j] > a[largest]){
                    largest = j;
                }
            }
            swap(a,i,largest);
        }
    }

    private static void swap(int[] a, int i, int largest) {
        int temp = a[i];
        a[i] = a[largest];
        a[largest] = temp;
    }
}

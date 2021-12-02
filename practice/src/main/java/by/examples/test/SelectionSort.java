package by.examples.test;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {55, 13, -14, 14, 96, 54};
        selectSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void selectSort(int[] array){
        for (int i = array.length - 1; i > 0; i--) {
            int largest = 0;
            for (int j = 1; j <= i ; j++) {
                if(array[j] > array[largest]){
                    largest = j;
                }
            }
            swap(array,i,largest);
        }
    }

    private static void swap(int[] array, int i, int largest) {
        if(i == largest){
            return;
        }
        int temp = array[i];
        array[i] = array[largest];
        array[largest] = temp;
    }
}

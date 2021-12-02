package by.examples.test;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {55, 13, 14, 14, 96, 54};
        bubbleSort(array);
        Arrays.stream(array).forEach(System.out::println);

    }

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        if (array[i] == array[j])
            return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

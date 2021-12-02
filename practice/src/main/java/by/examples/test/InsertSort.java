package by.examples.test;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {55, 15, -5, 28, -19};
        insertSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = 0;
            int newElement = array[i];
            for (j = i; j > 0 && array[j - 1] > newElement; j--) {
                array[j] = array[j - 1];
            }
            array[j] = newElement;
        }
    }
}

package by.examples.test.repeat;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {55, 15, -5, 28, -19};
        insertSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = 0;
            int newElement = a[i];
            for (j = i; j > 0 && a[j - 1] > newElement ; j--) {
                a[j] = a[j - 1];
            }
            a[j] = newElement;
        }
    }
}

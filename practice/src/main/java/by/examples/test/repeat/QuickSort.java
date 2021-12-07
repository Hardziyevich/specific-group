package by.examples.test.repeat;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        final int[] in = {20, 35, -15, 7, 55, 1, -22};
        quickSort(in, 0, in.length - 1);
        Arrays.stream(in).forEach(System.out::println);

    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = pivot(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    public static int pivot(int[] array, int start, int end) {
        int pivot = array[end];
        int lessPivot = start;

        for (int i = start; i < end; i++) {
            if (pivot >= array[i]) {
                swap(array, lessPivot, i);
                lessPivot++;
            }
        }
        swap(array, lessPivot, end);
        return lessPivot;
    }

    static void swap(int[] array, int counterPosition, int counterPivot) {
        int temp = array[counterPosition];
        array[counterPosition] = array[counterPivot];
        array[counterPivot] = temp;
    }
}

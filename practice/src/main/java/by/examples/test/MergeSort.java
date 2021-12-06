package by.examples.test;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {55, 15, -5, 28, -19};
        mergeSort(array);
        Arrays.stream(array).forEach(System.out::println);

    }

    public static void mergeSort(int[] array) {
        sort(array, 0, array.length);
    }

    private static void sort(int[] array, int start, int end) {
        if (end - start < 2)
            return;

        int mid = (end + start) / 2;
        sort(array, start, mid);
        sort(array, mid, end);
        merge(array, start, mid, end);
    }

    private static void merge(int[] array, int start, int mid, int end) {
        if (array[mid - 1] <= array[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] newArray = new int[end - start];
        while (i < mid && j < end){
            if(array[i] <= array[j]){
                newArray[tempIndex++] = array[i++];
            }
            else {
                newArray[tempIndex++] = array[j++];
            }
        }
        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(newArray, 0, array, start, tempIndex);
    }

}

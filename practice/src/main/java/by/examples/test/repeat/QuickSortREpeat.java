package by.examples.test.repeat;

import java.util.Arrays;

import static by.examples.test.repeat.QuickSort.swap;


public class QuickSortREpeat {
    public static void main(String[] args) {
        final int[] in = {20, 35, -14, 7, -55, 1, -22};
        quickSort(in, 0, in.length - 1);
        Arrays.stream(in).forEach(System.out::println);

        System.out.printf(Integer.toBinaryString(13 & 0x111111));
    }

    private static void quickSort(int[] in, int start, int end) {
        if (start < end) {
            int pivot = pivot(in, start, end);
            quickSort(in, start, pivot - 1);
            quickSort(in, pivot + 1, end);
        }
    }

    private static int pivot(int[] in, int start, int end) {
        int pivot = in[end];
        int lessPivot = start;
        for (int i = start; i < end; i++) {
            if(pivot >= in[i]){
                swap(in,i,lessPivot);
                lessPivot++;
            }
        }
        swap(in,lessPivot,end);
        return lessPivot;
    }
}

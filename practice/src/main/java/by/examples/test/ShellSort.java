package by.examples.test;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {55, 15, 111, 555, 28, -19, 111, 1123, 345, 0, 44, 32};
        shellSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void shellSort(int[] in) {
        int length = in.length;
        int coff = 2;
        for (int gap = in.length / coff; gap > 0; gap = gap / coff) {
            for (int i = gap; i < in.length; i++) {
                int j = 0;
                int newElement = in[i];
                for (j = i; j >= gap && in[j - gap] > newElement; j -= gap) {
                    in[j] = in[j - gap];
                }
                in[j] = newElement;
            }
        }
    }
}

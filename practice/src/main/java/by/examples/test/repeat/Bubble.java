package by.examples.test.repeat;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        int[] array = {55, 15, -5, 28, -19};
        bubbleSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void bubbleSort(int[] in) {
        for (int i = in.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(in[j] > in[j+1]){
                    swap(in,j,j+1);
                }
            }
        }
    }

    private static void swap(int[] in, int j, int i) {
        int temp = in[j];
        in[j] = in[i];
        in[i] = temp;
    }
}

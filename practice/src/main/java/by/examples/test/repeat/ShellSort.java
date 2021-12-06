package by.examples.test.repeat;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {55, 15, 555, 28, -19};
        shellSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }


    private static void shellSort(int[] arr){
        for (int gap = arr.length/2; gap > 0 ; gap = gap /2){
            for (int i = gap; i < arr.length ; i++) {
                int j = 0;
                int newElement = arr[i];
                for(j = i; j >= gap && arr[j - gap] > newElement; j -=gap){
                    arr[j] = arr[j - gap];
                }
                arr[j] = newElement;
            }
        }
    }
}

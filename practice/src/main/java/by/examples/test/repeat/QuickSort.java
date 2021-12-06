package by.examples.test.repeat;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        final int[] in = {20, 35, -15, 7, 55, 1, -22};
        pivot(in,0, in.length);
        Arrays.stream(in).forEach(System.out::println);

    }

    public static void pivot(int[] array,int start, int end){
        int pivot = array[(start+ end)/2];
        int lessPivot = start;
        int morePivot = end;
        for (int i = start; i < end; i++) {
            if(pivot >= array[i]){
                array[++lessPivot] = array[--morePivot];
            }else if(pivot < array[i]){
                array[--morePivot] = array[++lessPivot];
            }
        }
    }
}

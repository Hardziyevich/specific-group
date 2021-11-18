package com.github.akarazhev.jacademy.practice.jprog.task20;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class HashSetExercise {

    public static void main(final String[] args) {
        int[] data = {12, 34, 1, 56, 43, 34, 65};
        int duplicate = findDuplicateElement(data);
        System.out.println(duplicate);
    }

    //Method is working and finding duplicate element in array.
    public static int findDuplicateElement(int[] array) {
        Set<Integer> temp = new HashSet<>();
        int result = 0;
        //traversing through array and put all elements in HashSet
        for (Integer integer : array) {
            if (!temp.add(integer)) {
                result = integer;
                break;
            }
        }
        return result;
    }
    //Same as previous method, but tried to use stream
    public static int findDuplicate(int[] array){
        Set<Integer> temp = new HashSet<>();
        return Arrays.stream(array).filter(x -> !temp.add(x)).findFirst().orElse(0);
    }
}


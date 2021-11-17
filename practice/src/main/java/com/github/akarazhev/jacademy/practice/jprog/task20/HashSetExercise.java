package com.github.akarazhev.jacademy.practice.jprog.task20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
}


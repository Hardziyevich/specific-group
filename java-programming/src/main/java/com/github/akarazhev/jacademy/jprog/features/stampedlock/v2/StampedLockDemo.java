package com.github.akarazhev.jacademy.jprog.features.stampedlock.v2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.StampedLock;

public class StampedLockDemo {

    static Map<String, Integer> data = new HashMap<>();
    static StampedLock lock = new StampedLock();

    //Method to read data from the Map. Since we are using tryReadLock(), the thread will not block.
    public static Integer readDataFromMap(String key) {

        long stamp = lock.tryReadLock();
        int result = 0;
        if (stamp != 0L) {
            try {
                result = data.get(key);
            } finally {
                lock.unlockRead(stamp);
            }
        }
        return result;
    }

    //Method to write data to the Map. Since we are using tryWriteLock(), the thread will not block.
    public static void writeDataToMap(String key, Integer value) {
        long stamp = lock.tryWriteLock();
        if (stamp != 0L) {
            try {
                data.put(key, value);
            } finally {
                lock.unlockWrite(stamp);
            }
        }
    }

    public static void main(String[] args) {
        writeDataToMap("ray", 123);
        Integer val = readDataFromMap("ray");
        System.out.println(val);
    }
}


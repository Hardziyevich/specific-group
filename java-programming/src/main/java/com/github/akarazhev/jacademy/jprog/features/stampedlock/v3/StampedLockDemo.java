package com.github.akarazhev.jacademy.jprog.features.stampedlock.v3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.StampedLock;

public class StampedLockDemo {

    static Map<String, Integer> data = new HashMap<>();
    static StampedLock lock = new StampedLock();

    public static Integer readDataFromMap(String key) {
        int result = 0;
        long stamp = lock.tryOptimisticRead();

        if (stamp != 0L) {
            result = data.get(key);
        }

        if (!lock.validate(stamp)) {
            // This means that the data was modified after we called optimistic read.
            // Do extra work here to get the latest data.
        }
        return result;
    }

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


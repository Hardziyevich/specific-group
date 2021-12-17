package com.github.akarazhev.jacademy.practice.designpatterns.observer;

import com.github.akarazhev.jacademy.practice.designpatterns.observer.entity.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * Warehouse contains information about shape. It is singleton.
 */
public class DBShape {

    private Map<Integer, Shape> bd = new HashMap<>();

    private static DBShape instance;

    private DBShape(){}

    public static DBShape getInstance() {
        if(instance == null){
            instance = new DBShape();
        }
        return instance;
    }

    public Map<Integer, Shape> getBd() {
        return Map.copyOf(bd);
    }

    public void setBd(Integer integer, Shape shape) {
        if(bd != null) {
            bd.put(integer, shape);
        }
    }

}

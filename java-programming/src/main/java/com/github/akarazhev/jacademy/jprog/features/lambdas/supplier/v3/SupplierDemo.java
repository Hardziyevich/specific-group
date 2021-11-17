package com.github.akarazhev.jacademy.jprog.features.lambdas.supplier.v3;

import java.util.function.DoubleSupplier;

public class SupplierDemo {

    public static void main(String[] args) {
        DoubleSupplier supplier = () -> (int) (Math.random() * 10);

        System.out.println(supplier.getAsDouble());
    }
}


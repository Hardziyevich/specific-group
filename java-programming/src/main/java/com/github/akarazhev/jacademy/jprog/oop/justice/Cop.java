package com.github.akarazhev.jacademy.jprog.oop.justice;

public final class Cop {
    private int gun;

    public int getGun() {
        return gun;
    }

    protected void fire() {
        System.out.println("shoot!");
    }
}

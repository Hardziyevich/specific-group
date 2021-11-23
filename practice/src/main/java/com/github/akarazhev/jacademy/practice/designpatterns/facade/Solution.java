package com.github.akarazhev.jacademy.practice.designpatterns.facade;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        ManufactureFacade manufactureFacade = new ManufactureFacade();
        manufactureFacade.workFlow();
    }
}

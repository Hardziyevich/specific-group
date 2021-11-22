package com.github.akarazhev.jacademy.practice.designpatterns.prototype;

public class Solution {
    public static void main(String[] args) {
        Document document = new Document("it`s main document");
        Document d1 = document.clone();
        System.out.println(d1.getText());
    }
}

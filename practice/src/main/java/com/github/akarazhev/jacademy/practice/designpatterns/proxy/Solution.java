package com.github.akarazhev.jacademy.practice.designpatterns.proxy;

import java.io.IOException;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        Document document = new ProxyDocumentTxt(Path.of("C:\\work\\byMyMentor\\jacademy-base\\practice\\src\\main\\resources\\1.tx"));
        document.isDownload();
        document.getInfo().forEach(System.out::println);
        document.addInfo("Pasha = 5");
        document.isLoad();
    }
}

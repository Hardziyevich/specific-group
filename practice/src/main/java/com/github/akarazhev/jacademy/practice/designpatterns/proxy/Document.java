package com.github.akarazhev.jacademy.practice.designpatterns.proxy;

import java.util.List;

public interface Document {
    boolean isDownload();
    boolean isLoad();
    List<String> getInfo();
    void addInfo(String info);

}

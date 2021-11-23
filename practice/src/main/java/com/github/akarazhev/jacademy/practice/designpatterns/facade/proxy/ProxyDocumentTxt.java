package com.github.akarazhev.jacademy.practice.designpatterns.facade.proxy;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class ProxyDocumentTxt implements Document {

    private final Document document;

    public ProxyDocumentTxt(Path path) throws IOException {
        if(!path.endsWith(".txt") && !path.toFile().exists()){
            throw new IOException("It isn`t correct file");
        }

        document = new DocumentTxt(path);
    }

    @Override
    public boolean isDownload() {
        return document.isDownload();
    }

    @Override
    public boolean isLoad() {
        return document.isLoad();
    }

    @Override
    public List<String> getInfo() {
        return document.getInfo();
    }

    @Override
    public void addInfo(String info) {
        document.addInfo(info);
    }
}

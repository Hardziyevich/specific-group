package com.github.akarazhev.jacademy.practice.designpatterns.proxy;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * Represent proxy design pattern. Addition behaviour to main class.
 */
public class ProxyDocumentTxt implements Document{

    private final Document document;

    /**
     * Validation type of file.
     * @param path a path of file.
     * @throws IOException throw if file is not valid.
     */
    public ProxyDocumentTxt(Path path) throws IOException {
        if(!path.endsWith(".txt") && !path.toFile().exists()){
            throw new IOException("It isn`t correct file");
        }

        document = new DocumentTxt(path);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isDownload() {
        return document.isDownload();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isLoad() {
        return document.isLoad();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getInfo() {
        return document.getInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addInfo(String info) {
        document.addInfo(info);
    }

}

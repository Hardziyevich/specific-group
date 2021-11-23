package com.github.akarazhev.jacademy.practice.designpatterns.facade.proxy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DocumentTxt implements Document {
    private List<String> info = new ArrayList<>();
    Path path;

    public DocumentTxt(Path path){
        this.path = path;
    }
    @Override
    public boolean isDownload() {
        try (Stream<String> lines = Files.lines(path)) {
            info = lines.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean isLoad() {
        try {
            Files.writeString(path,info.stream().map(StringBuilder::new).reduce((x,y)->new StringBuilder(x).append("\n").append(y)).get());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public List<String> getInfo() {
        return List.copyOf(info);
    }

    @Override
    public void addInfo(String info) {
        this.info.add(info);
    }
}

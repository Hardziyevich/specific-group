package com.github.akarazhev.jacademy.practice.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Buffer {
    private List<Save> saveList = new ArrayList<>();

    public void add(Save save){
        saveList.add(save);
    }

    public Save getSaveById(int id){
        return saveList.stream().filter(x -> x.getId() == id).findFirst().get();
    }

    public List<Save> getSaveByVersion(String version){
        return saveList.stream().filter(x -> x.getVersion().equals(version)).collect(Collectors.toList());
    }
}

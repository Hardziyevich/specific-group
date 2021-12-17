package com.github.akarazhev.jacademy.practice.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Represent pattern Memento. Save all document into buffer.
 */
public class Buffer {

    private final List<Save> saveList = new ArrayList<>();

    /**
     * Addition document into buffer.
     * @param save a save of document.
     */
    public void add(Save save){
        saveList.add(save);
    }

    /**
     * Finding particular document by id.
     * @param id a id of document.
     * @return a save of document.
     */
    public Save getSaveById(int id){
        return saveList.stream()
                .filter(x -> x.getId() == id)
                .findFirst().get();
    }

    /**
     * Finding all document by version.
     * @param version a string of version.
     * @return a list of save document.
     */
    public List<Save> getSaveByVersion(String version){
        return saveList.stream()
                .filter(x -> x.getVersion().equals(version))
                .collect(Collectors.toList());
    }

}

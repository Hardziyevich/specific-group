package com.github.akarazhev.jacademy.practice.designpatterns.memento;

/**
 * Entity class for saving version of document.
 */
public class Save {

    private final int id;
    private final Document document;
    private final String version;

    public Save(int id, Document document, String version) {
        this.id = id;
        this.document = document;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public Document getDocument() {
        return document;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "Save{" +
                "id=" + id +
                ", document=" + document +
                ", version='" + version + '\'' +
                '}';
    }

}

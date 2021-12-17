package com.github.akarazhev.jacademy.practice.designpatterns.proxy;

import java.util.List;

/**
 * Main interface for represent a proxy pattern. Represent interface for download document.
 */
public interface Document {
    /**
     * Result of a downloading from a document.
     * @return a boolean state.
     */
    boolean isDownload();
    /**
     * Result of a loading to a document.
     * @return a boolean state.
     */
    boolean isLoad();

    /**
     * Getting information about downloading element.
     * @return a list of string information
     */
    List<String> getInfo();

    /**
     * Addition information in document
     * @param info a string of info
     */
    void addInfo(String info);

}

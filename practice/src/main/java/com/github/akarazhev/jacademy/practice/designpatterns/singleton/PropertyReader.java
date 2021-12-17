package com.github.akarazhev.jacademy.practice.designpatterns.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Singleton for reading property from file.
 */
public class PropertyReader {

    private static volatile PropertyReader properties;
    private static final Properties prop = new Properties();


    private PropertyReader() {
    }

    public static synchronized PropertyReader getProperties() {
        if (properties == null){
            properties = new PropertyReader();
            load();
        }
        return properties;
    }

    /**
     * Finding property by name.
     * @param property a string of property name.
     * @return a string of property.
     */
    public String getProp(String property) {
        return prop.getProperty(property);
    }

    private static void load() {
        try (InputStream inputStream = PropertyReader.class.getClassLoader().getResourceAsStream("application.property")) {
            prop.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

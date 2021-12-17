package com.github.akarazhev.jacademy.practice.designpatterns.facade;

import com.github.akarazhev.jacademy.practice.designpatterns.proxy.Document;
import com.github.akarazhev.jacademy.practice.designpatterns.proxy.ProxyDocumentTxt;

import java.io.IOException;
import java.nio.file.Path;

/**
 * Main class for representing pattern facade.
 */
public class ManufactureFacade {

    Document document;
    Employee employeeM;
    Employee employeeE;

    public ManufactureFacade(Path path) throws IOException {
        document = new ProxyDocumentTxt(path);
        employeeM = new MillwrightEmployeeImpl(document);
        employeeE = new EngineerEmployeeImpl(document);
    }

    /**
     * Starting all employee.
     */
    public void workFlow(){
        employeeE.startWork();
        while (employeeE.isWorking());
        employeeM.startWork();
    }

}

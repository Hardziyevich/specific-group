package com.github.akarazhev.jacademy.practice.designpatterns.facade;

import com.github.akarazhev.jacademy.practice.designpatterns.facade.proxy.Document;
import com.github.akarazhev.jacademy.practice.designpatterns.facade.proxy.ProxyDocumentTxt;

import java.io.IOException;
import java.nio.file.Path;

public class ManufactureFacade {
    Document document = new ProxyDocumentTxt(Path.of("C:\\work\\byMyMentor\\jacademy-base\\practice\\src\\main\\resources\\1.txt"));
    Employee employeeM = new MillwrightEmployeeImpl(document);
    Employee employeeE = new EngineerEmployeeImpl(document);

    public ManufactureFacade() throws IOException {
    }

    public void workFlow(){
        employeeE.Work();
        while (employeeE.isWorking());
        employeeM.Work();
    }
}

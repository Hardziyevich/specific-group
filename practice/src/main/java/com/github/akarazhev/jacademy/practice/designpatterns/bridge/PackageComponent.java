package com.github.akarazhev.jacademy.practice.designpatterns.bridge;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class PackageComponent {
    private List<Component> list;

    public PackageComponent(List<Component> list) {
        this.list = list;
    }

    public Optional<String> showPackage(){
        return list.stream().map(x-> x.getValue() + " ").reduce(String::concat);
    }
}

package com.github.akarazhev.jacademy.practice.designpatterns.flyweight;

import java.util.List;
import java.util.Objects;

public class Solution {
    public static void main(String[] args){
        ShaperFactory shaperFactory = new ShaperFactory();
        Shape shape = shaperFactory.newShape(ShapeType.TETRAHEDRON);
        Shape shape1 = shaperFactory.newShape(ShapeType.TETRAHEDRON);
        System.out.println(Objects.equals(shape, shape));
        shape.setId(2);
        shape1.setCoordinates(List.of(new Point(2,2,2)));
        Shape shape2 = shaperFactory.newShape(ShapeType.TETRAHEDRON);
        System.out.println(shape2.getId());
        shape2.getCoordinates().forEach(System.out::println);
    }
}

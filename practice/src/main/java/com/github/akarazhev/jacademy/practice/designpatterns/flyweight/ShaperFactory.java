package com.github.akarazhev.jacademy.practice.designpatterns.flyweight;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ShaperFactory {
    private final Map<ShapeType,Shape> shapes;

    public ShaperFactory(){
        shapes = new EnumMap<>(ShapeType.class);
    }

    public Shape newShape(ShapeType shapeType){
        Shape shape = shapes.get(shapeType);
        if(shape == null){
            switch (shapeType){
                case TETRAHEDRON:{
                    shape = new Shape(1, List.of(new Point(1.0,1.0,1.0)));
                    shapes.put(shapeType,shape);
                } default:break;
            }
        }
        return shape.clone();
    }
}

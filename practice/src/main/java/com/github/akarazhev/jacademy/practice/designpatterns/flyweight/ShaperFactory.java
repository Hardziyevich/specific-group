package com.github.akarazhev.jacademy.practice.designpatterns.flyweight;

import java.util.*;

public class ShaperFactory {

    private final Map<ShapeType, Shape> shapes;

    public ShaperFactory() {
        shapes = new EnumMap<>(ShapeType.class);
    }

    public Optional<Shape> newShape(ShapeType shapeType) {
        Shape result = null;
        Shape shape = shapes.get(shapeType);
        if (shape == null) {
            if (shapeType == ShapeType.TETRAHEDRON) {
                shape = new Shape(1, List.of(new Point(1.0, 1.0, 1.0)));
                shapes.put(shapeType, shape);
                result = shape.clone();
            }
        }
        return Optional.of(result);
    }
}

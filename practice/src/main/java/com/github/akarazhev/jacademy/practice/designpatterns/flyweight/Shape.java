package com.github.akarazhev.jacademy.practice.designpatterns.flyweight;

import java.util.List;
import java.util.Objects;

/**
 * A figure that is located in 3D space.
 */
public class Shape implements Cloneable{

    private int id;
    private List<Point> coordinates;

    public Shape(int id, List<Point> coordinates) {
        this.id = id;
        this.coordinates = coordinates;
    }

    public int getId() {
        return id;
    }

    public List<Point> getCoordinates() {
        return List.copyOf(coordinates);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "id=" + id +
                ", coordinates=" + coordinates +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return id == shape.id && Objects.equals(coordinates, shape.coordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, coordinates);
    }

    @Override
    public Shape clone() {
        Shape newShape;
        try {
            newShape = (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            newShape = new Shape(this.id,this.coordinates);
        }
        newShape.coordinates = List.copyOf(this.coordinates);
        return newShape;
    }

}

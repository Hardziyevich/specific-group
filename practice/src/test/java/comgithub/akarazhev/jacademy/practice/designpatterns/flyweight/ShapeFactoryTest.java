package comgithub.akarazhev.jacademy.practice.designpatterns.flyweight;

import com.github.akarazhev.jacademy.practice.designpatterns.flyweight.Shape;
import com.github.akarazhev.jacademy.practice.designpatterns.flyweight.ShapeType;
import com.github.akarazhev.jacademy.practice.designpatterns.flyweight.ShaperFactory;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static com.github.akarazhev.jacademy.practice.designpatterns.flyweight.ShapeType.*;
import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {
    ShaperFactory shaperFactory = new ShaperFactory();

    @Test
    void testNewShape(){
        Optional<Shape> shape = shaperFactory.newShape(TETRAHEDRON);
        Shape result = shape.orElse(null);
        assertNotNull(result);
    }
}

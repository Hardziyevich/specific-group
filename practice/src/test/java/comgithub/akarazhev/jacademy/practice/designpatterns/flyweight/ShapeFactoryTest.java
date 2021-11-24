package comgithub.akarazhev.jacademy.practice.designpatterns.flyweight;

import com.github.akarazhev.jacademy.practice.designpatterns.flyweight.Shape;
import com.github.akarazhev.jacademy.practice.designpatterns.flyweight.ShapeType;
import com.github.akarazhev.jacademy.practice.designpatterns.flyweight.ShaperFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {
    ShaperFactory shaperFactory = new ShaperFactory();

    @Test
    void testNewShape(){
        Shape shape = shaperFactory.newShape(ShapeType.TETRAHEDRON);
        assertNotNull(shape);
    }
}

package comgithub.akarazhev.jacademy.practice.designpatterns.observer;

import com.github.akarazhev.jacademy.practice.designpatterns.observer.DBShape;
import com.github.akarazhev.jacademy.practice.designpatterns.observer.entity.Point;
import com.github.akarazhev.jacademy.practice.designpatterns.observer.entity.Shape;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {
    Shape triangle = new Shape(1,"triangle", List.of(new Point(1.0,1.0,1.0),new Point(1.0,1.0,1.0),new Point(1.0,1.0,1.0)));
    DBShape dbShape = DBShape.getInstance();

    @Test
    void testObserver() {
        dbShape.setBd(1,triangle);
        triangle.setCoordinates(List.of(new Point(2.0,2.0,2.0),new Point(2.0,2.0,2.0),new Point(1.0,1.0,1.0)));
        assertEquals(new Shape(1,"triangle", List.of(new Point(2.0,2.0,2.0),new Point(2.0,2.0,2.0),new Point(1.0,1.0,1.0))),
                dbShape.getBd().get(1));
    }
}

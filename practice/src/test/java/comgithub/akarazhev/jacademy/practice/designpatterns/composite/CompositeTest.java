package comgithub.akarazhev.jacademy.practice.designpatterns.composite;

import com.github.akarazhev.jacademy.practice.designpatterns.composite.Component;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.entity.Capacitor;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.impl.PackageCapacitorImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.impl.WarehouseComponentImpl;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CompositeTest {
    @Test
    void testComposite(){
        PackageCapacitorImpl packageCapacitor = new PackageCapacitorImpl();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            packageCapacitor.add(new Capacitor(random.nextInt(100) + "uF"));
        }
        WarehouseComponentImpl warehouseComponent = new WarehouseComponentImpl();
        packageCapacitor.getAllComponent().forEach(x->warehouseComponent.add((Capacitor)x));

        warehouseComponent.getAllComponent().forEach(System.out::println);
    }
}

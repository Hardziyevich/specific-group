package comgithub.akarazhev.jacademy.practice.designpatterns.bridge;

import com.github.akarazhev.jacademy.practice.designpatterns.bridge.Component;
import com.github.akarazhev.jacademy.practice.designpatterns.bridge.PackageComponent;
import com.github.akarazhev.jacademy.practice.designpatterns.bridge.entity.Capacitor;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BridgeTest {

    @Test
    void testBridge(){
        List<Component> components = List.of(new Capacitor("10uF"),new Capacitor("10uF"),new Capacitor("10uF"),new Capacitor("10uF"));
        PackageComponent pack = new PackageComponent(components);
        assertEquals("10uF 10uF 10uF 10uF ",pack.showPackage().get());
    }
}

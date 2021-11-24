package comgithub.akarazhev.jacademy.practice.designpatterns.singleton;

import com.github.akarazhev.jacademy.practice.designpatterns.singleton.PropertyReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyReaderTest {

    @Test
    @DisplayName("Test singleton")
    void testSing(){
        PropertyReader propertyReader = PropertyReader.getProperties();
        PropertyReader propertyReader1 = PropertyReader.getProperties();
        assertAll(()->{
            assertEquals(propertyReader1,propertyReader);
            assertEquals("2",propertyReader.getProp("two"));
        });
    }
}

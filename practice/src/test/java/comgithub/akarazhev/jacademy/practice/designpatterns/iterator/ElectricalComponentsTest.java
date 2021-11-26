package comgithub.akarazhev.jacademy.practice.designpatterns.iterator;

import com.github.akarazhev.jacademy.practice.designpatterns.iterator.ElectricalComponent;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ElectricalComponentsTest {
    private ElectricalComponent component = new ElectricalComponent();

    @BeforeAll
    void init(){
        for (int i = 0; i < 10; i++) {
            component.addComponent(Integer.toString(i));
        }
    }

    @Test
    void testNext(){
        assertThat("0", equalTo(component.next()));
    }
    @Test
    void testHasNext(){
        assertTrue(component.hasNext());
    }
}

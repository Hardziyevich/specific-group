package comgithub.akarazhev.jacademy.practice.designpatterns.abstractfactory;

import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.AbstractFactory;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.Capacitor;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.ElectricalComponent;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.Microchip;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.Resistor;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Master;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.WorkerChip;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    @DisplayName("Test abstract factory")
    void testGetComponent() {
        assertAll(() -> {
            assertNotNull(AbstractFactory.startWorker("chip"));
            assertNotNull(AbstractFactory.startWorker("passive"));
            assertThrows(IllegalArgumentException.class, () -> {
                AbstractFactory.startWorker("Led");
            });
        });
    }

    @Test
    @DisplayName("Test class WorkerChip")
    void testMethodeForWorkerChip() throws Exception {
        Master chip = AbstractFactory.startWorker("chip");
        List<ElectricalComponent> list = new ArrayList<>();
        list.add(new Microchip());
        list.add(new Microchip());
        assertAll(()->{
            assertEquals(true,chip.placeOnBoard(list));
            assertThrows(Exception.class,()->{
                chip.placeOnBoard(List.of(new Capacitor()));
            });
        });
    }

    @Test
    @DisplayName("Test class WorkerPE")
    void testMethodeForWorkerPE() throws Exception {
        Master chip = AbstractFactory.startWorker("passive");
        List<ElectricalComponent> list = new ArrayList<>();
        list.add(new Capacitor());
        list.add(new Resistor());
        assertAll(()->{
            assertEquals(true,chip.placeOnBoard(list));
            assertThrows(Exception.class,()->{
                chip.placeOnBoard(List.of(new Microchip()));
            });
        });
    }

}

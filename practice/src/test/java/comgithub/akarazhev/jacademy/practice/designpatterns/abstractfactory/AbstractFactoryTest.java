package comgithub.akarazhev.jacademy.practice.designpatterns.abstractfactory;

import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.AbstractFactory;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.ElectricalComponent;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Worker;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.componentimpl.Capacitor;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.componentimpl.Microchip;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.componentimpl.Resistor;
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
        Worker chip = AbstractFactory.startWorker("chip");
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
        Worker chip = AbstractFactory.startWorker("passive");
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

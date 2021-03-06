package comgithub.akarazhev.jacademy.practice.designpatterns.factorymethod;


import com.github.akarazhev.jacademy.practice.designpatterns.builder.BoardBuilder;
import com.github.akarazhev.jacademy.practice.designpatterns.factorymethod.DemoBoard;
import com.github.akarazhev.jacademy.practice.designpatterns.factorymethod.factorymethod.EthernetToSDITranslator;
import com.github.akarazhev.jacademy.practice.designpatterns.factorymethod.factorymethod.PowerSupplyModule;
import com.github.akarazhev.jacademy.practice.designpatterns.factorymethod.factorymethod.ZynqModule;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class DemoBoardTest {

    @Test
    void testDemoBoardEnvironment(){
        List<DemoBoard> demoBoards = List.of(new EthernetToSDITranslator(),new ZynqModule(),new PowerSupplyModule());
        List<BoardBuilder> collect = demoBoards.stream().map(DemoBoard::creatBoard).collect(Collectors.toList());
        assertNotNull(collect);
    }
}

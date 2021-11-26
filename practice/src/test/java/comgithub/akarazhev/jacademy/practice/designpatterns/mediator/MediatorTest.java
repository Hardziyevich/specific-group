package comgithub.akarazhev.jacademy.practice.designpatterns.mediator;

import com.github.akarazhev.jacademy.practice.designpatterns.mediator.Board;
import com.github.akarazhev.jacademy.practice.designpatterns.mediator.Module;
import com.github.akarazhev.jacademy.practice.designpatterns.mediator.impl.DemoBoard;
import com.github.akarazhev.jacademy.practice.designpatterns.mediator.impl.entity.DisplayModuleImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.mediator.impl.entity.EthernetModuleImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.mediator.impl.entity.HdmiModuleImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class MediatorTest {

    @Test
    void testMediator(){
        HdmiModuleImpl hdmi = new HdmiModuleImpl(new DisplayModuleImpl(null));
        Module ethernet = new EthernetModuleImpl(hdmi);
        Board hdmiEthernetConverter = new DemoBoard(List.of(hdmi,ethernet));
        hdmiEthernetConverter.startWork();
        Board hdmiMonitorBoard = new DemoBoard(List.of(new DisplayModuleImpl(new HdmiModuleImpl(null))));
        hdmiMonitorBoard.startWork();
        assertNotNull(hdmiMonitorBoard);
    }
}

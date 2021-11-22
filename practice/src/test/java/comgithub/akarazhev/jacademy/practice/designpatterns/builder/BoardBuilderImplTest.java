package comgithub.akarazhev.jacademy.practice.designpatterns.builder;


import com.github.akarazhev.jacademy.practice.designpatterns.builder.builder.BoardBuilder;
import com.github.akarazhev.jacademy.practice.designpatterns.builder.builder.BoardBuilderImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class BoardBuilderImplTest {

    @Test
    void testAllParam(){
        BoardBuilder boardBuilder = new BoardBuilderImpl()
                .powerSupple()
                .ddr()
                .sdi()
                .processor()
                .hdmi()
                .usb();
        assertAll(()->{
            assertEquals("THN30",boardBuilder.getPowerSupple());
            assertEquals("ZYNQ7000",boardBuilder.getProcessor());
            assertEquals("HDMI - YES",boardBuilder.getHdmi());
            assertEquals("USB - YES",boardBuilder.getUsb());
            assertEquals("SDI - YES",boardBuilder.getSdi());
            assertEquals("DDR4",boardBuilder.getDdr());
            assertNotNull(boardBuilder.build());
        });
    }
}

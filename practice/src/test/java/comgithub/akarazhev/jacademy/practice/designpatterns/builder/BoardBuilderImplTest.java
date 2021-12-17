package comgithub.akarazhev.jacademy.practice.designpatterns.builder;


import com.github.akarazhev.jacademy.practice.designpatterns.builder.BoardBuilder;
import com.github.akarazhev.jacademy.practice.designpatterns.builder.impl.BoardBuilderImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BoardBuilderImplTest {

    @Test
    void testAllParam(){
        BoardBuilder boardBuilder = new BoardBuilderImpl()
                .powerSupply()
                .ddr()
                .sdi()
                .processor()
                .hdmi()
                .usb();
        assertAll(()->{
            assertEquals("THN30",boardBuilder.getPowerSupply());
            assertEquals("ZYNQ7000",boardBuilder.getProcessor());
            assertEquals("HDMI - YES",boardBuilder.getHdmi());
            assertEquals("USB - YES",boardBuilder.getUsb());
            assertEquals("SDI - YES",boardBuilder.getSdi());
            assertEquals("DDR4",boardBuilder.getDdr());
        });
    }
}

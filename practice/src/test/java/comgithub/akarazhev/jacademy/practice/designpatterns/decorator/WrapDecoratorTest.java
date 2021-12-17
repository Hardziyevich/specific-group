package comgithub.akarazhev.jacademy.practice.designpatterns.decorator;

import com.github.akarazhev.jacademy.practice.designpatterns.decorator.impl.WrapCRC;
import com.github.akarazhev.jacademy.practice.designpatterns.decorator.impl.WrapConvolutional;
import com.github.akarazhev.jacademy.practice.designpatterns.decorator.impl.WrapDecorator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrapDecoratorTest {
    @Test
    void testDecorator(){
        WrapDecorator wrapDecorator = new WrapConvolutional(new WrapCRC(new WrapDecorator()));
        assertEquals("DatawrapperCRCConv",wrapDecorator.encodingData("Data"));
    }
}

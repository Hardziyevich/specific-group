package comgithub.akarazhev.jacademy.practice.designpatterns.decorator;

import com.github.akarazhev.jacademy.practice.designpatterns.decorator.WrapCRC;
import com.github.akarazhev.jacademy.practice.designpatterns.decorator.WrapConvolutional;
import com.github.akarazhev.jacademy.practice.designpatterns.decorator.WrapDecorator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WrapDecoratorTest {
    @Test
    void testDecorator(){
        WrapDecorator wrapDecorator = new WrapConvolutional(new WrapCRC(new WrapDecorator(data -> data+" Some data ")));
        assertEquals("Data Some data CRCConv",wrapDecorator.encodingData("Data"));
    }
}

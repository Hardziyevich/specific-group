package comgithub.akarazhev.jacademy.practice.designpatterns.chainofresponsibility;


import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.BaseParser;
import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.impl.ExpressionParser;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComponent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpressionBaseParserTest {

    @Test
    void testParser() {
        String test = "13<<1";
        BaseParser expressionBaseParser = ExpressionParser.getInstance();
        TextComponent expression = expressionBaseParser.parse(test);
        assertEquals("26", expression.toString());
    }
}

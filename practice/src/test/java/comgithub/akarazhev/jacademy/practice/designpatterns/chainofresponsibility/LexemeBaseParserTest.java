package comgithub.akarazhev.jacademy.practice.designpatterns.chainofresponsibility;


import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.BaseParser;
import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.impl.LexemeParser;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComponent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LexemeBaseParserTest {

    @Test
    void testParser() {
        String lexemeTest = "Pasha,";
        BaseParser lexemeBaseParser = LexemeParser.getInstance();
        TextComponent lexeme = lexemeBaseParser.parse(lexemeTest);
        assertEquals(lexemeTest, lexeme.toString());
    }
}

package comgithub.akarazhev.jacademy.practice.designpatterns.chainofresponsibility;


import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.BaseParser;
import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.impl.SentenceParser;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComponent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SentenceBaseParserTest {

    @Test
    void testParse() {
        String test = "It has survived - not only (five) centuries, but also the leap into 13<<2 electronic typesetting, ";
        BaseParser baseParser = SentenceParser.getInstance();
        TextComponent parse = baseParser.parse(test);
        assertEquals("It has survived - not only (five) centuries, but also the leap into 52 electronic typesetting, ", parse.toString());
    }
}

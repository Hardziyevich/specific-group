package comgithub.akarazhev.jacademy.practice.designpatterns.chainofresponsibility;


import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.BaseParser;
import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.impl.WordParser;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComponent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordBaseParserTest {

    @Test
    void testWordParser() {
        String word = "Pasha";
        BaseParser wordBaseParser = WordParser.getInstance();
        TextComponent wordComponent = wordBaseParser.parse(word);
        assertEquals(word, wordComponent.toString());
    }
}

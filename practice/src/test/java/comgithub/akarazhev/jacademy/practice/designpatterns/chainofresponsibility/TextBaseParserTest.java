package comgithub.akarazhev.jacademy.practice.designpatterns.chainofresponsibility;


import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.BaseParser;
import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.impl.TextParser;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComponent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextBaseParserTest {

    @Test
    void testParser() {
        String test = "It has survived - not only (five) centuries, but also the leap into electronic" +
                "typesetting, remaining essentially unchanged. It was popularised in the “Динамо” (Рига)" +
                "with the release of Letraset sheets.toString() containing Lorem Ipsum passages, and" +
                "more recently with desktop publishing software like Aldus PageMaker Faclon9 including" +
                "versions of Lorem Ipsum!\r\n" +
                "It is a long a!=b established fact that a reader will be distracted by the readable" +
                "content of a page when looking at its layout. The point of using Ipsum is that it has a" +
                "more-or-less normal distribution ob.toString(a?b:c), as opposed to using (Content here)," +
                "content here's, making it look like readable English?\r\n" +
                "It is a established fact that a reader will be of a page when looking at its layout...\r\n" +
                "Bye бандерлоги.";
        BaseParser baseParser = TextParser.getInstance();
        TextComponent parse = baseParser.parse(test);
        assertEquals(test, parse.toString());
    }

    @Test
    void testParserInterpret() {
        String test = "It has survived - not only (five) centuries, but also the leap into 13<<2 electronic" +
                "typesetting, remaining 3>>5 essentially ~6&9|(3&4) unchanged. It was popularised in the " +
                "5|(1&2&(3|(4&(1^5|6&47)|3)|(~89&4|(42&7)))|1) with the release of Letraset sheets containing" +
                "Lorem Ipsum passages, and more recently with desktop publishing software like Aldus" +
                "PageMaker including versions of Lorem Ipsum.\r\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a" +
                "page when looking at its layout. The point of using (~71&(2&3|(3|(2&1>>2|2)&2)|10&2))|78 " +
                "Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using (Content" +
                "here), content here', making it look like readable English.\r\n" +
                "It is a (7^5|1&2<<(2|5>>2&71))|1200 established fact that a reader will be of a page" +
                "when looking at its layout.\r\n" +
                "Bye.";
        String result = "It has survived - not only (five) centuries, but also the leap into 52 electronictypesetting, remaining 0 essentially 9 unchanged. It was popularised in the 5 with the release of Letraset sheets containingLorem Ipsum passages, and more recently with desktop publishing software like AldusPageMaker including versions of Lorem Ipsum.\r\n" +
                "It is a long established fact that a reader will be distracted by the readable content of apage when looking at its layout. The point of using 78 Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using (Contenthere), content here', making it look like readable English.\r\n" +
                "It is a 1200 established fact that a reader will be of a pagewhen looking at its layout.\r\n" +
                "Bye.";
        BaseParser baseParser = TextParser.getInstance();
        TextComponent parse = baseParser.parse(test);

        assertEquals(result, parse.toString());
    }
}

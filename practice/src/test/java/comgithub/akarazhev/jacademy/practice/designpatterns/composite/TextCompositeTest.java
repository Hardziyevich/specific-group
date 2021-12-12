package comgithub.akarazhev.jacademy.practice.designpatterns.composite;

import com.github.akarazhev.jacademy.practice.designpatterns.composite.Symbol;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComposite;
import org.junit.jupiter.api.Test;

import static com.github.akarazhev.jacademy.practice.designpatterns.composite.TextType.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TextCompositeTest {

    @Test
    void testToString() {
        TextComposite text = new TextComposite(TEXT);
        TextComposite paragraph1 = new TextComposite(PARAGRAPH);
        TextComposite paragraph2 = new TextComposite(PARAGRAPH);
        TextComposite sentence1 = new TextComposite(SENTENCE);
        TextComposite sentence2 = new TextComposite(SENTENCE);
        TextComposite word1 = new TextComposite(WORD);
        TextComposite word2 = new TextComposite(WORD);
        TextComposite word3 = new TextComposite(WORD);
        TextComposite word4 = new TextComposite(WORD);
        TextComposite lexeme1 = new TextComposite(LEXEME);
        TextComposite lexeme2 = new TextComposite(LEXEME);
        Symbol symbol1 = new Symbol(DIGIT, 'I');
        Symbol symbol2 = new Symbol(DIGIT, 'a');
        Symbol symbol3 = new Symbol(DIGIT, 'm');
        Symbol symbol4 = new Symbol(DIGIT, 'P');
        Symbol symbol5 = new Symbol(DIGIT, 'a');
        Symbol symbol6 = new Symbol(DIGIT, 's');
        Symbol symbol7 = new Symbol(DIGIT, 'h');
        Symbol symbol8 = new Symbol(DIGIT, 'a');
        Symbol symbol9 = new Symbol(PUNCTUATION, '.');

        Symbol symbol10 = new Symbol(DIGIT, 'I');
        Symbol symbol11 = new Symbol(DIGIT, 'a');
        Symbol symbol12 = new Symbol(DIGIT, 'm');
        Symbol symbol13 = new Symbol(DIGIT, 'N');
        Symbol symbol14 = new Symbol(DIGIT, 'a');
        Symbol symbol15 = new Symbol(DIGIT, 't');
        Symbol symbol16 = new Symbol(DIGIT, 'a');
        Symbol symbol17 = new Symbol(DIGIT, 's');
        Symbol symbol18 = new Symbol(DIGIT, 'h');
        Symbol symbol19 = new Symbol(DIGIT, 'a');
        Symbol symbol20 = new Symbol(PUNCTUATION, '!');

        word1.addText(symbol2);
        word1.addText(symbol3);

        lexeme1.addText(symbol4);
        lexeme1.addText(symbol5);
        lexeme1.addText(symbol6);
        lexeme1.addText(symbol7);
        lexeme1.addText(symbol8);
        lexeme1.addText(symbol9);

        sentence1.addText(symbol1);
        sentence1.addText(word1);
        sentence1.addText(lexeme1);

        word2.addText(symbol11);
        word2.addText(symbol12);

        lexeme2.addText(symbol13);
        lexeme2.addText(symbol14);
        lexeme2.addText(symbol15);
        lexeme2.addText(symbol16);
        lexeme2.addText(symbol17);
        lexeme2.addText(symbol18);
        lexeme2.addText(symbol18);
        lexeme2.addText(symbol19);
        lexeme2.addText(symbol20);

        sentence2.addText(symbol10);
        sentence2.addText(word2);
        sentence2.addText(lexeme2);

        paragraph1.addText(sentence1);
        paragraph1.addText(sentence2);

        paragraph2.addText(sentence2);

        text.addText(paragraph1);
        text.addText(paragraph2);


        System.out.print(text);

        assertNotNull(text);
    }
}

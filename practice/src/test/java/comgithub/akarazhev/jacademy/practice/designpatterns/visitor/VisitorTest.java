package comgithub.akarazhev.jacademy.practice.designpatterns.visitor;

import com.github.akarazhev.jacademy.practice.designpatterns.visitor.Visitor;
import com.github.akarazhev.jacademy.practice.designpatterns.visitor.impl.SentenceImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.visitor.impl.TextImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.visitor.impl.VisitorImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.visitor.impl.WordImpl;
import org.junit.jupiter.api.Test;

public class VisitorTest {

    @Test
    void testVisitor(){
        Visitor visitor = new VisitorImpl();
        TextImpl text = new TextImpl();
        text.addComponent(new WordImpl());
        text.addComponent(new SentenceImpl());
        text.execute(visitor);
    }
}

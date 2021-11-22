package comgithub.akarazhev.jacademy.practice.designpatterns.prototype;

import com.github.akarazhev.jacademy.practice.designpatterns.prototype.Document;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    void testDocument(){
        Document test = new Document("Some text");
        assertEquals("Some text", test.clone().getText());
    }
}

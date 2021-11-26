package comgithub.akarazhev.jacademy.practice.designpatterns.memento;

import com.github.akarazhev.jacademy.practice.designpatterns.memento.AutoGenId;
import com.github.akarazhev.jacademy.practice.designpatterns.memento.Buffer;
import com.github.akarazhev.jacademy.practice.designpatterns.memento.Document;
import com.github.akarazhev.jacademy.practice.designpatterns.memento.Save;
import org.hamcrest.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertAll;

public class MementoTest {

    @Test
    void test(){
        Document document = new Document("Some information");
        Save save1 = new Save(AutoGenId.getId(),document,"1.0");
        Save save2 = new Save(AutoGenId.getId(),document,"1.1");
        Save save3 = new Save(AutoGenId.getId(),document,"1.2");
        Buffer buffer = new Buffer();
        buffer.add(save1);
        buffer.add(save2);
        buffer.add(save3);
        assertAll(()->{
            assertThat(save1,equalTo(buffer.getSaveById(save1.getId())));
            assertThat(save2,equalTo(buffer.getSaveByVersion("1.1").stream().findAny().get()));
        });
    }
}

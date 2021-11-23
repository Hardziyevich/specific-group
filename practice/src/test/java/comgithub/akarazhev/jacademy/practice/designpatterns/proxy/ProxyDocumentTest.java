package comgithub.akarazhev.jacademy.practice.designpatterns.proxy;

import com.github.akarazhev.jacademy.practice.designpatterns.proxy.Document;
import com.github.akarazhev.jacademy.practice.designpatterns.proxy.DocumentTxt;
import com.github.akarazhev.jacademy.practice.designpatterns.proxy.ProxyDocumentTxt;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class ProxyDocumentTest {
    Document rightPath = new ProxyDocumentTxt(Path.of("C:\\work\\byMyMentor\\jacademy-base\\practice\\src\\main\\resources\\1.txt"));

    public ProxyDocumentTest() throws IOException {
    }

    @Test
    void testAllMethode() {
        Document document = new DocumentTxt(Path.of("C:\\work\\byMyMentor\\jacademy-base\\practice\\src\\main\\resources\\1.txt"));
        document.isDownload();
        assertAll(() -> {
            assertTrue(rightPath.isDownload());
            assertEquals(document.getInfo(), rightPath.getInfo());
            assertThrows(IOException.class, () -> new ProxyDocumentTxt(Path.of("C:\\work\\byMyMentor\\jacademy-base\\practice\\src\\main\\resources\\1.t")));
        });
    }
}

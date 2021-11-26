package comgithub.akarazhev.jacademy.practice.designpatterns.proxy;

import com.github.akarazhev.jacademy.practice.designpatterns.proxy.Document;
import com.github.akarazhev.jacademy.practice.designpatterns.proxy.DocumentTxt;
import com.github.akarazhev.jacademy.practice.designpatterns.proxy.ProxyDocumentTxt;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class ProxyDocumentTest {
    private final URL is = getClass().getClassLoader().getResource("1.txt");
    private final File file = new File(is.getFile());
    Document rightPath = new ProxyDocumentTxt(Path.of(file.getPath()));
    public ProxyDocumentTest() throws IOException {
    }

    @Test
    void testAllMethode() {
        Document document = new DocumentTxt(Path.of(file.getPath()));
        document.isDownload();
        assertAll(() -> {
            assertTrue(rightPath.isDownload());
            assertEquals(document.getInfo(), rightPath.getInfo());
            assertThrows(IOException.class, () -> new ProxyDocumentTxt(Path.of("1.t")));
        });
    }
}

package comgithub.akarazhev.jacademy.practice.designpatterns.facade;

import com.github.akarazhev.jacademy.practice.designpatterns.facade.ManufactureFacade;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;

class ManufactureFacadeTest {
    private final URL is = getClass().getClassLoader().getResource("1.txt");
    private final File file = new File(is.getFile());

    @Test
    void testFacade() throws IOException {
        new ManufactureFacade(Path.of(file.getPath())).workFlow();
    }
}

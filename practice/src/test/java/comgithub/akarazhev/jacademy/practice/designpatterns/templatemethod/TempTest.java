package comgithub.akarazhev.jacademy.practice.designpatterns.templatemethod;

import com.github.akarazhev.jacademy.practice.designpatterns.templatemethod.Letters;
import com.github.akarazhev.jacademy.practice.designpatterns.templatemethod.Words;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempTest {

    @Test
    void testTemp(){
        Words words = new Words();
        Letters letters = new Letters();
        for (int i = 0; i < 15; i++) {
            words.add(String.valueOf(i));
            letters.add(String.valueOf(i));
        }

        assertAll(()->{
            assertEquals("0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14",words.converter());
            assertEquals("[0][1][2][3][4][5][6][7][8][9][1][0][1][1][1][2][1][3][1][4]",letters.converter());
        });
    }
}

package comgithub.akarazhev.jacademy.practice.designpatterns.state;

import com.github.akarazhev.jacademy.practice.designpatterns.state.Food;
import com.github.akarazhev.jacademy.practice.designpatterns.state.impl.IngredientsImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.state.impl.NutritionalValueImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;

public class StateTest {

    private final Food food = new Food();

    @Test
    void testState() {
        food.addProperty(new IngredientsImpl());
        food.addProperty(new NutritionalValueImpl());
        assertDoesNotThrow(() -> {
            food.execute(null,null);
            food.execute(null,"15");
            food.execute("water","1...5");
            food.execute("water",null);
        });
    }
}

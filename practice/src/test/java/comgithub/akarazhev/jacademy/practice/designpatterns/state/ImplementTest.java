package comgithub.akarazhev.jacademy.practice.designpatterns.state;

import com.github.akarazhev.jacademy.practice.designpatterns.state.impl.IngredientsImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.state.impl.NutritionalValueImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ImplementTest {

    @Test
    void testNutrition() {
        NutritionalValueImpl nut = new NutritionalValueImpl();
        nut.interpret("fat", "1");
        nut.interpret("carb", "2");
        nut.interpret("protein", "3");
        assertAll(() -> {
            assertEquals(1, nut.getFat());
            assertEquals(2, nut.getCarb());
            assertEquals(3, nut.getProtein());
        });
    }

    @Test
    void testIngredients() {
        IngredientsImpl in = new IngredientsImpl();
        in.interpret("water", "1.1");
        in.interpret("sugar", "1.2");
        in.interpret("fructose", "1.3");
        in.interpret("vanilla", "1.4");
        assertAll(() -> {
            assertEquals(1.1, in.getWater());
            assertEquals(1.2, in.getSugar());
            assertEquals(1.3, in.getFructose());
            assertEquals(1.4, in.getVanilla());
        });
    }
}

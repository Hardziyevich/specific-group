package comgithub.akarazhev.jacademy.practice.designpatterns.state;

import com.github.akarazhev.jacademy.practice.designpatterns.state.impl.IngredientsImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.state.impl.NutritionalValueImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;

public class ImplementTest {

    @Test
    void testNutrition() {
        NutritionalValueImpl nut = new NutritionalValueImpl();
        nut.execute("fat", "1");
        nut.execute("carb", "2");
        nut.execute("protein", "3");
        assertAll(() -> {
            assertEquals(1, nut.getFat());
            assertEquals(2, nut.getCarb());
            assertEquals(3, nut.getProtein());
        });
    }

    @Test
    void testIngredients() {
        IngredientsImpl in = new IngredientsImpl();
        in.execute("water", "1.1");
        in.execute("sugar", "1.2");
        in.execute("fructose", "1.3");
        in.execute("vanilla", "1.4");
        assertAll(() -> {
            assertEquals(1.1, in.getWater());
            assertEquals(1.2, in.getSugar());
            assertEquals(1.3, in.getFructose());
            assertEquals(1.4, in.getVanilla());
        });
    }
}

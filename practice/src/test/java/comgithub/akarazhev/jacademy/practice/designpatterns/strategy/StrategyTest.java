package comgithub.akarazhev.jacademy.practice.designpatterns.strategy;

import com.github.akarazhev.jacademy.practice.designpatterns.strategy.Strategy;
import com.github.akarazhev.jacademy.practice.designpatterns.strategy.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StrategyTest {

    private User user;

    @BeforeAll
    void init(){
        user = new User(data -> data.matches("Pasha\\s.+"));
        user.addWarehouse("Pasha 2");
        user.addWarehouse("Pasha 3");
        user.addWarehouse("Stepa 1");
        user.addWarehouse("Stepa 23");
    }

    @Test
    void testStrategy(){
        assertThat(List.of("Pasha 2","Pasha 3"),equalTo(user.getWarehouse()));
    }
}

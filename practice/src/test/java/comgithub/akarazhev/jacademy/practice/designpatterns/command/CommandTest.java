package comgithub.akarazhev.jacademy.practice.designpatterns.command;

import com.github.akarazhev.jacademy.practice.designpatterns.command.Boss;
import com.github.akarazhev.jacademy.practice.designpatterns.command.Employee;
import com.github.akarazhev.jacademy.practice.designpatterns.command.impl.ChangeTaskImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.command.impl.DevelopTaskImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.command.impl.TestTaskImpl;
import org.junit.jupiter.api.Test;

class CommandTest {
    private static Boss boss = new Boss();

    @Test
    void testAllTask(){
        boss.getTask("Develop new Board",new DevelopTaskImpl());
        boss.getTask("Change new Board",new ChangeTaskImpl());
        boss.getTask("Test new Board",new TestTaskImpl());
        Employee employee = new Employee(boss.sendTaskToEmployee("Develop new Board"));
        employee.doSth();
    }
}

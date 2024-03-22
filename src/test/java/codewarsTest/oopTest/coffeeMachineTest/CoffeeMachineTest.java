package codewarsTest.oopTest.coffeeMachineTest;

import codewars.oop.coffeeMachine.domain.CoffeeMachine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeMachineTest {
    @ParameterizedTest
    @DisplayName("Comprobar Método getType y constructor de clase Coffee")
    @ValueSource(strings = {"cappuccino", "latte", "cortado", "irish", "espresso"})
    public void testCoffeeMachine(String coffeeMachineName) {

        assertEquals(coffeeMachineName, new CoffeeMachine(coffeeMachineName).getCoffeeMachineName(),"Check Coffee Machine object Creation.");
        System.out.println(new CoffeeMachine(coffeeMachineName));
    }
}

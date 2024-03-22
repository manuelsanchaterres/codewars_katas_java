package codewarsTest.oopTest.coffeeMachineTest;

import codewars.oop.coffeeMachine.domain.Coffee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeTest {
    @ParameterizedTest
    @DisplayName("Comprobar Método getType y constructor de clase Coffee.")
    @ValueSource(strings = {"moccamaster", "nespresso", "sage", "seattle", "breville"})
    public void testCoffee(String coffeeType) {

        assertEquals(coffeeType, new Coffee(coffeeType).getType(),"Check Coffee Machine object Creation.");
        System.out.println(new Coffee(coffeeType).getType());
    }
}

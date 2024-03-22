package codewarsTest.oopTest.coffeeMachineTest;

import codewars.oop.coffeeMachine.domain.CoffeeMachine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeMachineTest {
    @ParameterizedTest
    @DisplayName("Comprobar Método getType y constructor de clase Coffee")
    @ValueSource(strings = {"cappuccino", "latte", "cortado", "irish", "espresso"})
    public void testCoffeeMachineType(String coffeeMachineName) {

        assertEquals(coffeeMachineName, new CoffeeMachine(coffeeMachineName).getCoffeeMachineName(),"Check Coffee Machine object Creation.");

//        System.out.println(new CoffeeMachine(coffeeMachineName));
    }

    private static Stream<Arguments> testCoffeeMachineArgumentsProvider() {
        List<Arguments> listWithArguments = List.of(
                Arguments.of(new String[] {"moccamaster"}, 1),
                Arguments.of(new String[] {"moccamaster", "nespresso"}, 2),
                Arguments.of(new String[] {"moccamaster", "nespresso", "sage"}, 3),
                Arguments.of(new String[] {"moccamaster", "nespresso", "sage", "seattle"}, 4),
                Arguments.of(new String[] {"moccamaster", "nespresso", "sage", "seattle", "breville"}, 5),
                Arguments.of(new String[] {"moccamaster", "nespresso","nespresso", "sage", "seattle", "breville"}, 6),
                Arguments.of(new String[] {"moccamaster", "nespresso","nespresso", "sage", "seattle","seattle", "breville"}, 7)
        );
        return listWithArguments.stream();
    }
    @ParameterizedTest
    @DisplayName("Comprobar Método numberOfCoffeeMade y numberOfCoffeeTypesMade de clase CoffeeMachine.")
    @MethodSource("testCoffeeMachineArgumentsProvider")
    public void testMakeCoffeeMachine(String[] coffeeTypesList, int expectedCoffeeListLength) {

        CoffeeMachine coffeeMachine = new CoffeeMachine("coffeeMachine");
        for (int i = 0; i < coffeeTypesList.length; i++) {
            coffeeMachine.makeCoffee(coffeeTypesList[i]);
        }

        assertAll(
                () -> assertEquals(expectedCoffeeListLength, coffeeMachine.numberOfCoffeeMade(),"Check expected Number of Coffees Made.")
        );

//        System.out.println(coffeeMachine);
    }
}
